package com.book.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "book_table")
//entity class
public class Book {

	@Id	//primary key
	@GeneratedValue(strategy = GenerationType.AUTO)	 //auto increment id
	private int bid;
	
	@Column(length = 30, nullable = false)
	private String btitle;
	
	@Column(length = 20, nullable = false)
	private String bauthor;
	
	@Column(length = 20, nullable = false)
	private String bcategory;
	
	@Column(length = 10, nullable = false)
	private double price;
	
	@Column(length = 30, nullable = false)
	private int year;

}
