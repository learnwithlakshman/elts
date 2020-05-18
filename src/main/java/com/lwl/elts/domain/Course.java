package com.lwl.elts.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String canme;
	private int duration;

	@Setter(AccessLevel.NONE)
	@ManyToMany
	@JoinTable(name = "course_employee",
			joinColumns = {@JoinColumn(name = "cid", referencedColumnName = "cid") },
			inverseJoinColumns = {@JoinColumn(name = "empno", referencedColumnName = "empno") }

	)
	private List<Employee> employees;
	
	@Setter(AccessLevel.NONE)
	@OneToMany(mappedBy ="course")
	private List<Rating> ratings= new ArrayList<Rating>();
	
	public List<Rating> addRating(Rating rating){
		this.ratings.add(rating);
		return ratings;
	}
	public void removeRatings(Rating rating) {
		this.ratings.remove(rating);
	}
	
	
	public List<Employee> addEmployee(Employee employee){
		this.employees.add(employee);
		return employees;
	}
	
	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}
	
	
	

}
