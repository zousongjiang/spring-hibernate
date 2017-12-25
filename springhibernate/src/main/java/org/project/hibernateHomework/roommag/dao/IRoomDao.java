package org.project.hibernateHomework.roommag.dao;

import org.project.hibernateHomework.beans.RoomBean;

public interface IRoomDao {
	
	public void addRoom(RoomBean room);
	public RoomBean  findRoomById(int id);

}
