package com.employee.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
public class Student implements Serializable{

	private static final long serialVersionUID = 4319588681430428206L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int stdID;
	private String stdName;
	private String stdDiv;
	
}
