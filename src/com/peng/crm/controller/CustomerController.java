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
 *客户信息请求请求处理
 *@author  道_z
 *@version 2018年11月1日下午4:12:58
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
		//查询来源
		List<BaseDict> fromType = dictService
				.getBaseDictByCode(customer_from_type);
		//查询行业
		List<BaseDict> industryType = dictService
				.getBaseDictByCode(customer_industry_type);
		//查询级别
		List<BaseDict> levelType = dictService
				.getBaseDictByCode(customer_level_type);

		//设置数据模型返回
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);

		//根据查询条件分页查询用户列表
		Page<Customer> page = customerService.getCustomerByQueryVo(vo);

		//设置分页数返回
		model.addAttribute("page", page);

		return "customer";
	}
	//异步请求
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
