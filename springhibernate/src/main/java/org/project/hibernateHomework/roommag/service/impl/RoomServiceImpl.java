package org.project.hibernateHomework.roommag.service.impl;

import javax.annotation.Resource;

import org.project.hibernateHomework.beans.RoomBean;
import org.project.hibernateHomework.roommag.dao.IRoomDao;
import org.project.hibernateHomework.roommag.service.IRoomService;
import org.springframework.stereotype.Service;
@Service
public class RoomServiceImpl implements IRoomService {
	
	@Resource
	private IRoomDao roomDaoImpl;
	public void addRoom(RoomBean room) {
		// TODO Auto-generated method stub
		roomDaoImpl.addRoom(room);

	}

	public RoomBean findRoomById(int id) {
		// TODO Auto-generated method stub
		return roomDaoImpl.findRoomById(id);
	}

}
