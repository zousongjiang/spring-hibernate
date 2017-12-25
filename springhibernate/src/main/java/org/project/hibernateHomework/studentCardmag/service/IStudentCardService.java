package org.project.hibernateHomework.studentCardmag.service;

import java.util.List;

import org.project.hibernateHomework.beans.StudentCardBean;

public interface IStudentCardService {

	public void addCard(StudentCardBean card);
	
	public 	List<StudentCardBean> getCardByStudenName(String name);
}
