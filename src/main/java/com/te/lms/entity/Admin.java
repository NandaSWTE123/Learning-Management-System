package com.te.lms.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Admin {
	@Column(name="id")
	@Id
	private String adminId;
	
	@Column(name="username")
	private String adminName;
	
	@Column(name="emailId")
	private String adminEmailId;
	
}
