package org.project.springMybatis.usermag.service.impl;

import javax.annotation.Resource;

import org.project.springMybatis.beans.UserBean;
import org.project.springMybatis.usermag.dao.IUserDao;
import org.project.springMybatis.usermag.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
//@Transactional(readOnly=true)
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDaoImpl;
	public void addUser(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.addUser(user);
	}

}
