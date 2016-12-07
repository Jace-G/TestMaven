package com.chq.testmaven.service;

import com.chq.testmaven.entity.Admin;

public interface AdminService {
	int deleteByPrimaryKey(Integer id);

	int insert(Admin record);

	int insertSelective(Admin record);

	Admin selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Admin record);

	int updateByPrimaryKey(Admin record);

}