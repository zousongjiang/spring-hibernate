package org.project.springMybatis.beans;

public class UserBean {
	private String name;
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", pwd=" + pwd + "]";
	}
	

}
