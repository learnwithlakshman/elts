package com.lwl.elts.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwl.elts.domain.Employee;
import com.lwl.elts.domain.Rating;
import com.lwl.elts.dto.CourseDTO;
import com.lwl.elts.dto.EmployeeDTO;
import com.lwl.elts.dto.RatingDTO;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Override
	public CourseDTO createCourse(CourseDTO course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDTO updateCourse(CourseDTO course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CourseDTO> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseDTO> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addRating(int cid, Rating rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEmployee(int cid, Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeDTO> getEmployeeByCourse(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RatingDTO> getRatings(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
