package com.lwl.elts.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDTO {
	private int cid;
	private String canme;
	private int duration;
	private List<EmployeeDTO> employees=new ArrayList<>();
	private List<RatingDTO> ratings= new ArrayList<>();
}
