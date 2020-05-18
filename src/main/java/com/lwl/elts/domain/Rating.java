package com.lwl.elts.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rating {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int rid;
		private String name;
		private int rating;
		@ManyToOne
		@JoinColumn(name = "cid",referencedColumnName = "cid")
		private Course course;
}
