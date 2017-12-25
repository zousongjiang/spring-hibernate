package org.project.hibernateHomework.classmag.service;

import org.project.hibernateHomework.beans.ClassBean;

public interface IClassService {
	public void addClass(ClassBean clas);
	
	public ClassBean getClassById( int id);

}
