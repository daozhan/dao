package com.peng.crm.service;

import java.util.List;

import com.peng.crm.pojo.BaseDict;

/**
 *�ֵ����ݱ�ҵ���߼��ӿ�
 *@author  ��_z
 *@version 2018��11��1������6:00:39
 */
public interface BaseDictService {
	
	/**
	 * �����ֵ�����ѯ�ֵ��б�
	 * @time 2018��11��1������6:09:56
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
}
