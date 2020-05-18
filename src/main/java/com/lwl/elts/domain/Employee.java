package com.lwl.elts.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empno;
	private String name;
	private String email;
	@OneToOne
	@JoinColumn(name = "aid", referencedColumnName = "aid")
	private Addressproof addressproof;
	@Setter(AccessLevel.NONE)
	@ManyToMany(mappedBy = "employees")
	private List<Course> courses = new ArrayList<>();

	public List<Course> addCourse(Course course) {
		this.courses.add(course);
		return courses;
	}

	public void removeCourse(Course course) {
		this.courses.remove(course);
	}

}
