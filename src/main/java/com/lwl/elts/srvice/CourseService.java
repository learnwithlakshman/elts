package com.lwl.elts.srvice;

import com.lwl.elts.domain.Course;
import com.lwl.elts.domain.Employee;

public interface CourseService {

	
		public Course createCourse(Course course);
		public boolean addEmployee(int cid,Employee employee);
}
