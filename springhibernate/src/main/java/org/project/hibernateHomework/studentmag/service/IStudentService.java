package org.project.hibernateHomework.studentmag.service;

import java.util.List;
import java.util.Map;

import org.project.hibernateHomework.beans.StudentBean;
import org.project.hibernateHomework.vo.PageBean;

public interface IStudentService {
	public void addStudent(StudentBean stu);
	public void deleteStudent(StudentBean stu);
	public StudentBean getStudent(int id);
	public void updateStudent(StudentBean stu);
	public List<?> findStudentByName(String name);
	public List<?> findStudentByMap(Map map);
	public PageBean findStudentByMap(PageBean pageBean,Map map);

}
