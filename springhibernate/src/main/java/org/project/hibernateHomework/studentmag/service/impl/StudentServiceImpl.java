package org.project.hibernateHomework.studentmag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.project.hibernateHomework.base.SessionDao;
import org.project.hibernateHomework.beans.StudentBean;
import org.project.hibernateHomework.studentmag.dao.IStudentDao;
import org.project.hibernateHomework.studentmag.service.IStudentService;
import org.project.hibernateHomework.vo.PageBean;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl  implements IStudentService {
	
	@Resource
	private IStudentDao studentDaoImpl;
	
	@CachePut(value="students")
	public void addStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.addStudent(stu);
		
	}
    @CacheEvict(value="students",allEntries=false,beforeInvocation=true)
	public void deleteStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStudent(stu);
		
	}
	
	@Cacheable(value="students")
	public StudentBean getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStudent(id);
	}

	public void updateStudent(StudentBean stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.updateStudent(stu);
		
	}
    
	@Cacheable(value="students")
	public List<?> findStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findStudentByName(name);
	}
    
	@Cacheable(value="students")
	public List<?> findStudentByMap(Map map) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findStudentByMap(map);
	}
	
	@Cacheable(value="students")
	public PageBean findStudentByMap(PageBean pageBean, Map map) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findStudentByMap(pageBean, map);
	}

}
