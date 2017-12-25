package org.project.hibernateHomework.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_student")
public class StudentBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="s_id")
	@GenericGenerator(name="id.strategy",strategy="identity")
	@GeneratedValue(generator="id.strategy")
	private int studentId;
	
	@Column(name="s_name")
	private String studentName;
	
	@Column(name="s_age")
	private int studentAge;
	
	@Column(name="s_gender")
	private String studentGender;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_classid")
	private ClassBean clas;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_roomid")
	private RoomBean room;
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_cardid")
	private StudentCardBean card;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinTable(name="t_student_subjects",joinColumns= {@JoinColumn(name="fk_sid")},
	inverseJoinColumns= {@JoinColumn(name="fk_suid")})
	private Set<SubjectBean> subjects;
	
	@Version
	private int version;
	
	
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public RoomBean getRoom() {
		return room;
	}
	public void setRoom(RoomBean room) {
		this.room = room;
	}
	public ClassBean getClas() {
		return clas;
	}
	public void setClas(ClassBean clas) {
		this.clas = clas;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	
	public StudentCardBean getCard() {
		return card;
	}
	public void setCard(StudentCardBean card) {
		this.card = card;
	}
	
	
	public Set<SubjectBean> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<SubjectBean> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentGender=" + studentGender + ", clas=" + clas + ", room=" + room + ", card=" + card
				+ ", subjects=" + subjects + "]";
	}

	
	
	
	
	
	

}
