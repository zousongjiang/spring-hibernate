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
@Table(name="t_class")
public class ClassBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="c_id")
	@GenericGenerator(name="id.strategy",strategy="identity")
	@GeneratedValue(generator="id.strategy")
	private int classId;
	
	@Column(name="c_name")
	private String className;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="clas")
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	private Set<StudentBean> students;
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public Set<StudentBean> getStudents() {
		return students;
	}
	public void setStudents(Set<StudentBean> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "ClassBean [classId=" + classId + ", className=" + className + "]";
	}
	
	

}
