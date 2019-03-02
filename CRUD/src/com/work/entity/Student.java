/**
 * @author : Kartavya Goswami
 */
package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 

/*Name of table in the database*/
@Table(name = "signin") 
public class Student {

	/* Id annotation for the primary key*/
	@Id
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
