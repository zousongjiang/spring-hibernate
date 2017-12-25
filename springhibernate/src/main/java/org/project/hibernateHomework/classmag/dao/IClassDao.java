package org.project.hibernateHomework.classmag.dao;

import org.project.hibernateHomework.beans.ClassBean;

public interface IClassDao {
	/**
	 * 添加班级
	 * @param clas
	 */
	public void addClass(ClassBean clas);
	
	public ClassBean getClassById( int id);

}
