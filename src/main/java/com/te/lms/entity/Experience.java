package com.te.lms.entity;

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
public class Experience {
	private String companyName;
	private double yearOfExperince;
	private String dateOfJoining;
	private String dateOfReleaving;
	@Id
	private String designation;
	private String location;
}
