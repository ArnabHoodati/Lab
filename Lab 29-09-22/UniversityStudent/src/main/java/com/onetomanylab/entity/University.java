package com.onetomanylab.entity;
/*
 *@author Arnab Kumar Hoodati 
 * 
 */
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
//entity class
public class University {
	//declare instances variable
	@Id	//primary key
	@GeneratedValue(strategy = GenerationType.AUTO)	//auto increment id
	private int uid;
	
	@Column(length = 30, nullable = false)
	private String uname;
	
	@Column(length = 20, nullable = false)
	private String ucity;
	
	@Column(length = 25, nullable = false, unique = true)
	private String uemail;
	
	@OneToMany(cascade = CascadeType.ALL)	//table joining relation
	@JoinColumn(name = "uid")	//join column uid
	private List<Students> students;	//aggregation

}
