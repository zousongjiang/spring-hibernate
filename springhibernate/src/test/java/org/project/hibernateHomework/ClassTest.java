package org.project.hibernateHomework;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.hibernateHomework.beans.ClassBean;
import org.project.hibernateHomework.classmag.dao.IClassDao;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:applicationContext.xml"})
public class ClassTest {
	@Resource
	private IClassDao classDaoImpl;
	
	@Test
	public void findClassById() {
		System.out.println(classDaoImpl.getClassById(2).getStudents());
	}
	
	@Test
	public void addClass() {
		ClassBean bean = new ClassBean();
		bean.setClassName("测试一班");
		classDaoImpl.addClass(bean);
	}


}
