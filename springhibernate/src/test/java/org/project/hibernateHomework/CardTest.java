package org.project.hibernateHomework;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.hibernateHomework.studentCardmag.dao.IStudentCardDao;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:applicationContext.xml"})
public class CardTest {
	@Resource
	private IStudentCardDao studentCardDaoImpl;
	
	@Test
	public void findCardByStuName() {
		System.out.println(studentCardDaoImpl.getCardByStudenName("xiao"));
	}

}
