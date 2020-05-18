package com.lwl.elts.dao;

import java.util.List;

import com.lwl.elts.domain.Course;
import com.lwl.elts.domain.Employee;
import com.lwl.elts.domain.Rating;

public interface CourseDao {

	public Course createCourse(Course course);

	public Course updateCourse(Course course);

	public boolean deleteCourse(int cid);

	public List<Course> getCourses();

	public List<Course> search(String str);

	public boolean addRating(int cid, Rating rating);

	public boolean addEmployee(int cid, Employee employee);

	public List<Employee> getEmployeeByCourse(int cid);

	public List<Rating> getRatings(int cid);

}
