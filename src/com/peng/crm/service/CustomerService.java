package com.peng.crm.service;



import com.peng.crm.pojo.Customer;
import com.peng.crm.pojo.QueryVo;
import com.peng.crm.utils.Page;

/**
 *�ͻ���Ϣҵ���߼��ӿ�
 *@author  ��_z
 *@version 2018��11��2������12:08:53
 */
public interface CustomerService {
	/**
	 * ��ѯ��ѯ����,��ҳ��ѯ�û��б�
	 * @time 2018��11��2������12:11:07
	 * @param vo
	 * @return
	 */
	Page<Customer> getCustomerByQueryVo(QueryVo vo);
	
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
