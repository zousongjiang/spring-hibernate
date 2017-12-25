package org.project.hibernateHomework.studentCardmag.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.project.hibernateHomework.base.SessionDao;
import org.project.hibernateHomework.beans.StudentCardBean;
import org.project.hibernateHomework.studentCardmag.dao.IStudentCardDao;
import org.springframework.stereotype.Repository;
@Repository
public class StudentCardDaoImpl extends SessionDao implements IStudentCardDao {
    
	public void addCard(StudentCardBean card) {
		// TODO Auto-generated method stub
		getSession().save(card);
		
	}

	public List<StudentCardBean> getCardByStudenName(String name) {
		// TODO Auto-generated method stub
		String hql = "from StudentCardBean as sc join fetch sc.student as s where s.studentName=:name ";
		Query query = getSession().createQuery(hql);
		query.setString("name", name);
		return query.list();
	}

}
