package com.peng.crm.mapper;

import java.util.List;

import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;

/**
 *�ͻ���Ϣ�־û��ӿ�
 *@author  ��_z
 *@version 2018��11��2������12:08:53
 */
public interface CustomerMapper {
	/**
	 * ��ѯ��ѯ����,��ҳ��ѯ�û��б�
	 * @time 2018��11��2������12:11:07
	 * @param vo
	 * @return
	 */
	List<Customer> getCustomerByQueryVo(QueryVo vo);

	/**
	 * ���ݲ�ѯ������ѯ����
	 * @time 2018��11��2������12:19:17
	 * @param vo
	 * @return
	 */
	Integer getCountByQueryVo(QueryVo vo);
	
	/**
	 * ����id��ѯ�û���Ϣ
	 * @time 2018��11��2������3:53:20
	 * @param id
	 * @return
	 */
	Customer getCustomerById(Integer id);
	
	/**
	 * �����û���Ϣ
	 * @time 2018��11��2������5:02:11
	 * @param cusetomer
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * ɾ���û�
	 * @time 2018��11��2������5:50:21
	 * @param id
	 */
	void deleteCustomer(Integer id);
}
