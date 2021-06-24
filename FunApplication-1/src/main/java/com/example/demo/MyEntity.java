package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class MyEntity {
	
	@Size(min = 3,max=10)
	@NotNull(message = "Field name Mandatory")  
	@NotEmpty(message = "Field Name can't be empty")
	private String name;
	@NotNull(message = "address name Mandatory")  
	@NotEmpty(message = "address Name can't be empty")
	private String addrs;
	@NotNull
	@NotEmpty
	private String dob;
	@Size(max = 10)
	private String phnNo;
	
	public MyEntity() {
		System.out.println("Constructor");
	}
	public MyEntity(String name, String addrs, String dob, String phnNo) {
		super();
		this.name = name;
		this.addrs = addrs;
		this.dob = dob;
		this.phnNo = phnNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	
	
	

}
