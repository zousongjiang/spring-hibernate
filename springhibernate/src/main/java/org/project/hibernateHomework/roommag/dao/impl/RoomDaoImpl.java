package org.project.hibernateHomework.roommag.dao.impl;

import org.hibernate.Session;
import org.project.hibernateHomework.base.SessionDao;
import org.project.hibernateHomework.beans.RoomBean;
import org.project.hibernateHomework.roommag.dao.IRoomDao;
import org.springframework.stereotype.Repository;

@Repository
public class RoomDaoImpl extends SessionDao implements IRoomDao {

	public void addRoom(RoomBean room) {
		// TODO Auto-generated method stub
		getSession().save(room);
		
	}

	public RoomBean findRoomById(int id) {
		// TODO Auto-generated method stub
		return (RoomBean) getSession().get(RoomBean.class, id);
	}

}
