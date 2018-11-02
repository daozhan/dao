package com.peng.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.crm.pojo.BaseDict;
import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;
import com.peng.crm.service.BaseDictService;
import com.peng.crm.service.CustomerService;
import com.peng.crm.utils.Page;

/**
 *�ͻ���Ϣ����������
 *@author  ��_z
 *@version 2018��11��1������4:12:58
 */

@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private BaseDictService dictService;

	@Autowired
	private CustomerService customerService;

	@Value("${customer_from_type}")
	private String customer_from_type;

	@Value("${customer_industry_type}")
	private String customer_industry_type;

	@Value("${customer_level_type}")
	private String customer_level_type;

	@RequestMapping("list")
	public String list(Model model, QueryVo vo) {
		//��ѯ��Դ
		List<BaseDict> fromType = dictService
				.getBaseDictByCode(customer_from_type);
		//��ѯ��ҵ
		List<BaseDict> industryType = dictService
				.getBaseDictByCode(customer_industry_type);
		//��ѯ����
		List<BaseDict> levelType = dictService
				.getBaseDictByCode(customer_level_type);

		//��������ģ�ͷ���
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);

		//���ݲ�ѯ������ҳ��ѯ�û��б�
		Page<Customer> page = customerService.getCustomerByQueryVo(vo);

		//���÷�ҳ������
		model.addAttribute("page", page);

		return "customer";
	}
	//�첽����
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Integer id) {
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public String update(Customer customer) {
		String msg = "1";
		try {
			customerService.updateCustomer(customer);
			msg = "0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer id) {
		String msg = "1";
		try {
			customerService.deleteCustomer(id);
			msg = "0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
}
