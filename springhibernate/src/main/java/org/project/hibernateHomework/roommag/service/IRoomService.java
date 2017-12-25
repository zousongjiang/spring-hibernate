package org.project.hibernateHomework.roommag.service;

import org.project.hibernateHomework.beans.RoomBean;

public interface IRoomService {
	public void addRoom(RoomBean room);
	public RoomBean  findRoomById(int id);

}
