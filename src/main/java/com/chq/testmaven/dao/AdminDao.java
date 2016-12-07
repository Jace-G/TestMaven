package com.chq.testmaven.dao;

import com.chq.testmaven.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}