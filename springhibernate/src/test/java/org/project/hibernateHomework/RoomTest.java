package org.project.hibernateHomework;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.hibernateHomework.beans.RoomBean;
import org.project.hibernateHomework.roommag.dao.IRoomDao;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath*:applicationContext.xml"})
public class RoomTest {
	@Resource
	private IRoomDao roomDaoImpl;
	
	@Test
	public void addRoom() {
		RoomBean rom = new RoomBean();
		rom.setRoomName("抚琴小区");
		roomDaoImpl.addRoom(rom);
		
	}
	@Test
	public void findRoomById() {
		System.out.println(roomDaoImpl.findRoomById(2));
		
	}
	@Test
	public void findStudentByRoomId() {
		System.out.println(roomDaoImpl.findRoomById(2).getStudents());
		
	}
	

}
