package org.project.hibernateHomework.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_studentcard")
public class StudentCardBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="sc_id")
	@GenericGenerator(name="id.strategy",strategy="identity")
	@GeneratedValue(generator="id.strategy")
	private int scId;
	
	@Column(name="sc_time")
	private Date scTime;
	
	@Column(name="sc_address")
	private String address;
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="card")
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	private StudentBean student;
	
	public int getScId() {
		return scId;
	}

	public void setScId(int scId) {
		this.scId = scId;
	}

	public Date getScTime() {
		return scTime;
	}

	public void setScTime(Date scTime) {
		this.scTime = scTime;
	}

	public StudentBean getStudent() {
		return student;
	}

	public void setStudent(StudentBean student) {
		this.student = student;
	}
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentCardBean [scId=" + scId + ", scTime=" + scTime + ", address=" + address + "]";
	}

	

	
	
	

}
