package org.project.hibernateHomework.studentmag.dao.impl;



import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.project.hibernateHomework.base.SessionDao;
import org.project.hibernateHomework.beans.StudentBean;
import org.project.hibernateHomework.studentmag.dao.IStudentDao;
import org.project.hibernateHomework.vo.PageBean;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDaoImpl extends SessionDao implements IStudentDao {
	
	

	public void addStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		getSession().save(stu);
		
	}

	public void deleteStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		getSession().delete(stu);
		
	}

	public StudentBean getStudent(int id) {
		// TODO Auto-generated method stub
		return (StudentBean) getSession().get(StudentBean.class, id);
		
	}

	public void updateStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		getSession().update(stu);
		
	}
	
	public List<?> findStudentByName(String name){
//		//以？传值的方式 叫做位置设值方案（起始位置是0）
//		String hql = "From StudentBean as s where s.studentName like concat(?,'%')";
//		//这句话的作用：第一个创建一个Query接口实例，第二个就是将上诉的Hql转化为sql，并且对sql进行预编译
//		Query query = session.createQuery(hql);
//		query.setString(0, name);
		
		//参数别名设值方案
		/*
		 如果left join或者inner join后方不添加fetch ，在From前面则可使用select new map()来实现按需查询
		fetch 只能添加在left join或者inner join的后面，不能添加在right join的后面
		fetch 代表的是讲后面查询的结果向第一个对象进行填充，实际上是调用第一个对象的setter()来完成的
		 */
		String hql = "From StudentBean as s join fetch s.clas as c join fetch s.room as r where s.studentName like concat(:name,'%')";
		Query query = getSession().createQuery(hql);
		query.setString("name", name);
		return query.list();
//		
//		String sql="select *from t_student where s_name like concat(?,'%')";
//		SQLQuery query = session.createSQLQuery(sql);
//		query.setString(0, name);
//		query.addEntity(StudentBean.class);//是将通过sql查询出来的结果 向对象进行转化
		
		
	}

	public List<?> findStudentByMap(Map map) {
		// TODO Auto-generated method stub
		String hql = "From StudentBean as s where s.studentName like concat(:studentName,'%')" ;
		
		return null;
	}

	public PageBean findStudentByMap(PageBean pageBean, Map map) {
		// TODO Auto-generated method stub
		
		
		String hql="select count(s.studentId) from StudentBean as s join  s.clas where s.studentName like concat(:studentName,'%')";
		Query query = getSession().createQuery(hql);
		query.setProperties(map);
		long totalSize = (Long) query.uniqueResult();
		pageBean.setTotalSize((int)totalSize);
		
		hql="from StudentBean as s join fetch s.clas join fetche s.room where s.studentName like concat(:studentName,'%') ";
		query = getSession().createQuery(hql);
		query.setProperties(map);
		query.setFirstResult(pageBean.getBeginIndex());//limit后的第一个参数
		query.setMaxResults(pageBean.getSize());//limit后的第二个参
		List<?> datas = query.list();
		pageBean.setDataList(datas);
		return pageBean;
		
		//Criteria该接口与query接口一样 同样可以作为条件查询，但是它没有query接口灵活
		//主要存在的问题 结构不清晰  不可以实现按需查询()
		
//		Criteria criteria = session.createCriteria(UserBean.class);//From UserBean
//		//MatchMode.START 表示以查询条件开始，向后查
//		criteria.add(Restrictions.like("userName", user.getUserName(),MatchMode.START));
//		criteria.add(Restrictions.eq("age", user.getAge()));
//		
//		//查询总行数
//		Long totalRows = (Long)criteria.setProjection(Projections.rowCount()).uniqueResult();
//		page.setTotalRows(Integer.parseInt(String.valueOf(totalRows)));
//		
//		criteria.setProjection(null);//清空投影
//		criteria.setFirstResult(page.getIndex());
//		criteria.setMaxResults(page.getRows());
//		List<?> datas = criteria.list();
//		page.setDatas(datas);
//		return page;
	}

}
