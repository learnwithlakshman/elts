package com.lwl.elts.service;

import java.util.List;

import com.lwl.elts.domain.Employee;
import com.lwl.elts.domain.Rating;
import com.lwl.elts.dto.CourseDTO;
import com.lwl.elts.dto.EmployeeDTO;
import com.lwl.elts.dto.RatingDTO;

public interface CourseService {
	public CourseDTO createCourse(CourseDTO course);

	public CourseDTO updateCourse(CourseDTO course);

	public boolean deleteCourse(int cid);

	public List<CourseDTO> getCourses();

	public List<CourseDTO> search(String str);

	public boolean addRating(int cid, Rating rating);

	public boolean addEmployee(int cid, Employee employee);

	public List<EmployeeDTO> getEmployeeByCourse(int cid);

	public List<RatingDTO> getRatings(int cid);

}
