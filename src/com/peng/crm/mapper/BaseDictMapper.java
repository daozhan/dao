package com.peng.crm.mapper;

import java.util.List;

import com.peng.crm.pojo.BaseDict;

/**
 *字典数据表持久化接口
 *@author  道_z
 *@version 2018年11月1日下午6:00:39
 */
public interface BaseDictMapper {
	
	/**
	 * 根据字典编码查询字典列表
	 * @time 2018年11月1日下午6:09:56
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
}
