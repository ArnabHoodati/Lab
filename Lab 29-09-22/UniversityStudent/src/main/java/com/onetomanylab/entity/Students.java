package com.onetomanylab.entity;
/*
 *@author Arnab Kumar Hoodati 
 * 
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//entity class
public class Students {
	//declare instances variable
	@Id	//primary key
	private int sid;
	
	@Column(length = 20, nullable = false)
	private String sname;
	
	@Column(length = 30, nullable = false)
	private String address;
	
	@Column(length = 10, nullable = false)
	private String dept;
	
	@Column(length = 11, nullable = false, unique = true)
	private long sphone;
	
	@Column(length = 25, nullable = false, unique = true)
	private String email;
	

	

}
