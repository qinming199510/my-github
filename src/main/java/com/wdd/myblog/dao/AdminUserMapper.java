package com.wdd.myblog.dao;

import org.apache.ibatis.annotations.Param;

import com.wdd.myblog.entity.AdminUser;


 
public interface AdminUserMapper {
	//根据用户名和密码查询用户
    AdminUser login(@Param("loginUserName") String loginUserName, @Param("loginPassword") String loginPassword);

	 //根据用户id查询用户
    AdminUser selectByPrimaryKey(Integer adminUserId);
     
	 
	 //更新用户
    int updateByPrimaryKeySelective(AdminUser adminUser);
}
