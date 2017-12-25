package org.project.hibernateHomework.classmag.dao.impl;

import org.hibernate.Session;
import org.project.hibernateHomework.base.SessionDao;
import org.project.hibernateHomework.beans.ClassBean;
import org.project.hibernateHomework.classmag.dao.IClassDao;
import org.springframework.stereotype.Repository;
@Repository
public class ClassDaoImpl extends SessionDao implements IClassDao {
	

	public void addClass(ClassBean clas) {
		
		// TODO Auto-generated method stub
		getSession().save(clas);
		
		
	}

	public ClassBean getClassById(int id) {
		// TODO Auto-generated method stub
		
		return (ClassBean) getSession().get(ClassBean.class, id);
	}

}
