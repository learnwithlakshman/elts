package com.lwl.elts.dto;

import javax.persistence.Entity;

import lombok.Getter;

@Entity
@Getter
public class RatingDTO {

		
		private int rid;
		private String name;
		private int rating;
		private CourseDTO course;
}
