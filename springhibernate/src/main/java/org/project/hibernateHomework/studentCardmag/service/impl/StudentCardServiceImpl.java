package org.project.hibernateHomework.studentCardmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.project.hibernateHomework.beans.StudentCardBean;
import org.project.hibernateHomework.studentCardmag.dao.IStudentCardDao;
import org.project.hibernateHomework.studentCardmag.service.IStudentCardService;
import org.springframework.stereotype.Service;

@Service
public class StudentCardServiceImpl implements IStudentCardService {
	
	@Resource
	private IStudentCardDao studentCardDaoImpl;
	public void addCard(StudentCardBean card) {
		// TODO Auto-generated method stub
		studentCardDaoImpl.addCard(card);

	}

	public List<StudentCardBean> getCardByStudenName(String name) {
		// TODO Auto-generated method stub
		return studentCardDaoImpl.getCardByStudenName(name);
	}

}
