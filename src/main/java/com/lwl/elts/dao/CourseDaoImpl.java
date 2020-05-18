package com.lwl.elts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lwl.elts.domain.Course;
import com.lwl.elts.domain.Employee;
import com.lwl.elts.domain.Rating;

@Repository
public class CourseDaoImpl implements CourseDao {

	private Logger log = LoggerFactory.getLogger(CourseDaoImpl.class);
	@PersistenceContext
	private EntityManager em;

	@Override
	public Course createCourse(Course course) {
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> search(String str) {
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
	public List<Employee> getEmployeeByCourse(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rating> getRatings(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
