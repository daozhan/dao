package com.peng.crm.mapper;

import java.util.List;

import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;

/**
 *客户信息持久化接口
 *@author  道_z
 *@version 2018年11月2日上午12:08:53
 */
public interface CustomerMapper {
	/**
	 * 查询查询条件,分页查询用户列表
	 * @time 2018年11月2日上午12:11:07
	 * @param vo
	 * @return
	 */
	List<Customer> getCustomerByQueryVo(QueryVo vo);

	/**
	 * 根据查询条件查询总数
	 * @time 2018年11月2日上午12:19:17
	 * @param vo
	 * @return
	 */
	Integer getCountByQueryVo(QueryVo vo);
	
	/**
	 * 根据id查询用户信息
	 * @time 2018年11月2日下午3:53:20
	 * @param id
	 * @return
	 */
	Customer getCustomerById(Integer id);
	
	/**
	 * 更新用户信息
	 * @time 2018年11月2日下午5:02:11
	 * @param cusetomer
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 删除用户
	 * @time 2018年11月2日下午5:50:21
	 * @param id
	 */
	void deleteCustomer(Integer id);
}
