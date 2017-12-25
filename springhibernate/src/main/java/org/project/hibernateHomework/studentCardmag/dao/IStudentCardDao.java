package org.project.hibernateHomework.studentCardmag.dao;

import java.util.List;

import org.project.hibernateHomework.beans.StudentCardBean;

public interface IStudentCardDao {
	
	public void addCard(StudentCardBean card);
	
	public 	List<StudentCardBean> getCardByStudenName(String name);

}
