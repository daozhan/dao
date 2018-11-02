package com.peng.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.crm.mapper.CustomerMapper;
import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;
import com.peng.crm.service.CustomerService;
import com.peng.crm.utils.Page;

/**
 *�ӿ�ʵ����
 *@author  ��_z
 *@version 2018��11��2������12:32:34
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
		
		//�����ҳ��ѯ��������ʼ
		vo.setStart((vo.getPage() - 1) * vo.getRows());
		
		//��ѯ�ܼ�¼��
		Integer total = customerMapper.getCountByQueryVo(vo);
		
		//��ѯÿҳ�������б�
		List<Customer> list = customerMapper.getCustomerByQueryVo(vo);
		
		Page<Customer> page = new Page<Customer>(total, vo.getPage(), vo.getRows(), list);
		
		return page;
	}

	@Override
	public Customer getCustomerById(Integer id) {
		return customerMapper.getCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerMapper.deleteCustomer(id);
	}

}
