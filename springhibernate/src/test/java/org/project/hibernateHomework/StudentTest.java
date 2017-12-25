package org.project.hibernateHomework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.hibernateHomework.beans.ClassBean;
import org.project.hibernateHomework.beans.RoomBean;
import org.project.hibernateHomework.beans.StudentBean;
import org.project.hibernateHomework.classmag.dao.IClassDao;
import org.project.hibernateHomework.classmag.service.IClassService;
import org.project.hibernateHomework.roommag.dao.IRoomDao;
import org.project.hibernateHomework.roommag.service.IRoomService;
import org.project.hibernateHomework.studentCardmag.dao.IStudentCardDao;
import org.project.hibernateHomework.studentCardmag.service.IStudentCardService;
import org.project.hibernateHomework.studentmag.service.IStudentService;
import org.project.hibernateHomework.vo.PageBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:applicationContext.xml"})
public class StudentTest {
	@Resource
	private IStudentService studentServiceImpl;
	@Resource
	private IClassService classServiceImpl;
	@Resource
	private IRoomService roomServiceImpl;
	@Resource
	private IStudentCardService studentCardServiceImpl;
	
	
	
	@Test
	public void deleteStudent() {
		StudentBean stu =studentServiceImpl.getStudent(8);
		studentServiceImpl.deleteStudent(stu);
		
	}
	@Test
	public void addStudent() {
		ClassBean bean=classServiceImpl.getClassById(3);
		RoomBean room = roomServiceImpl.findRoomById(1);
		
		StudentBean  stu = new StudentBean();
		stu.setStudentAge(22);
		stu.setStudentName("晓东");
		stu.setStudentGender("女");
		stu.setClas(bean);
		stu.setRoom(room);
		studentServiceImpl.addStudent(stu);
	}
	
	@Test
	public void findStudentById() {
		System.out.println(studentServiceImpl.getStudent(2).getStudentName());
		System.out.println(studentServiceImpl.getStudent(2).getStudentName());
	}
	
	@Test
	public void updateStudent() {
		StudentBean stu =studentServiceImpl.getStudent(2);
		stu.setStudentAge(20);
		stu.setStudentName("xiaominasd");
		stu.setStudentGender("男");
		studentServiceImpl.updateStudent(stu);
	}
	@Test
	public void findByName() {
			System.out.println(studentServiceImpl.findStudentByName("小红"));
	}
	
//	public void findStudentByMap() {
//		Map map = new HashMap();
//		map.put("studentAge", 18);
//		map.put("studentName", "小");
//		System.out.println(studentServiceImpl.findStudentByMap(map));
//	}
	
	@Test
	public void findPageByName() {
		Map map = new HashMap();
		map.put("studentName", "小红");
		PageBean bean = new PageBean();
		bean.setPage(1);
		bean.setSize(2);
		bean=studentServiceImpl.findStudentByMap(bean, map);
		System.out.println(bean);
			
	}
	
	public void studentChooseSubjet() {
		
		StudentBean stu =studentServiceImpl.getStudent(2);
		
		
		
	}
	

}
