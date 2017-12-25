package org.project.hibernateHomework.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_subject")
public class SubjectBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="su_id")
	@GenericGenerator(name="id.strategy",strategy="identity")
	@GeneratedValue(generator="id.strategy")
	private int subjectId;
	
	@Column(name="su_name")
	private String subjectName;
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="subjects")
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	private Set<StudentBean> sutdents;
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public Set<StudentBean> getSutdents() {
		return sutdents;
	}
	public void setSutdents(Set<StudentBean> sutdents) {
		this.sutdents = sutdents;
	}
	@Override
	public String toString() {
		return "SubjectBean [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
	

}
