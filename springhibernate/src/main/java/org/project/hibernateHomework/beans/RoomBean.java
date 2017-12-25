package org.project.hibernateHomework.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_room")
public class RoomBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="r_id")
	@GenericGenerator(name="id.strategy",strategy="identity")
	@GeneratedValue(generator="id.strategy")
	private int roomId;
	
	@Column(name="r_name")
	private String roomName;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="room")
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	private Set<StudentBean> students;
	
	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Set<StudentBean> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentBean> students) {
		this.students = students;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RoomBean [roomId=" + roomId + ", roomName=" + roomName + "]";
	}
	
	

}
