package com.lwl.elts.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {
	private int empno;
	private String name;
	private String email;
	private AddressproofDTO addressproof;
	private List<CourseDTO> courses = new ArrayList<>();


}
