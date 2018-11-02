package com.peng.crm.service;

import java.util.List;

import com.peng.crm.pojo.BaseDict;

/**
 *字典数据表业务逻辑接口
 *@author  道_z
 *@version 2018年11月1日下午6:00:39
 */
public interface BaseDictService {
	
	/**
	 * 根据字典编码查询字典列表
	 * @time 2018年11月1日下午6:09:56
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
}
