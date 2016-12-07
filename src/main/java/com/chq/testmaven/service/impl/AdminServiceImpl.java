package com.chq.testmaven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chq.testmaven.dao.AdminDao;
import com.chq.testmaven.entity.Admin;
import com.chq.testmaven.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return adminDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Admin record) {
		return adminDao.insert(record);
	}

	@Override
	public int insertSelective(Admin record) {
		return adminDao.insertSelective(record);
	}

	@Override
	public Admin selectByPrimaryKey(Integer id) {
		return adminDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		return adminDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Admin record) {
		return adminDao.updateByPrimaryKey(record);
	}

}