package com.peng.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.crm.mapper.BaseDictMapper;
import com.peng.crm.pojo.BaseDict;
import com.peng.crm.service.BaseDictService;

/**
 *
 *@author  ��_z
 *@version 2018��11��1������7:32:28
 */

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	@Override
	public List<BaseDict> getBaseDictByCode(String code) {
		return baseDictMapper.getBaseDictByCode(code);
	}

}
