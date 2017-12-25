package org.project.hibernateHomework.classmag.service.impl;

import javax.annotation.Resource;

import org.project.hibernateHomework.beans.ClassBean;
import org.project.hibernateHomework.classmag.dao.IClassDao;
import org.project.hibernateHomework.classmag.service.IClassService;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements IClassService {
	
	@Resource
	private IClassDao classDaoImpl;
	public void addClass(ClassBean clas) {
		// TODO Auto-generated method stub
		classDaoImpl.addClass(clas);
	}

	public ClassBean getClassById(int id) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassById(id);
	}

}
