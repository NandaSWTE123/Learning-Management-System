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
public class Secondary {
	private String panNo;
	@Id
	private String adharNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNo;
	private String maritalStatus;

}
