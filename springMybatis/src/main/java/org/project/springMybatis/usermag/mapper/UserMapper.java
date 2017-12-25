package org.project.springMybatis.usermag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.project.springMybatis.beans.UserBean;

public interface UserMapper {
	
	
	@Insert("insert into t_user(user_name,user_pwd) values(#{user.name},#{user.pwd})")
	public void addUser(@Param("user")UserBean user);

}
