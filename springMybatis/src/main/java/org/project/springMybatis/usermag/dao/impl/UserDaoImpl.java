package org.project.springMybatis.usermag.dao.impl;

import javax.annotation.Resource;

import org.project.springMybatis.beans.UserBean;
import org.project.springMybatis.usermag.dao.IUserDao;
import org.project.springMybatis.usermag.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
	@Resource
	private UserMapper userMapper;

	public void addUser(UserBean user) {
		userMapper.addUser(user);
		throw new NumberFormatException(); 
		
	}
	
	

}
