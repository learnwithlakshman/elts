package com.lwl.elts.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lwl.elts.domain.Course;

@Repository
public class CourseDaoImpl implements CourseDao {

	private Logger log = LoggerFactory.getLogger(CourseDaoImpl.class);
	@PersistenceContext
	private EntityManager em;

	@Override
	public Course createCourse(Course course) {
		em.persist(course);
		log.info("Course is added with id:{}", course.getCid());
		return course;
	}

}
