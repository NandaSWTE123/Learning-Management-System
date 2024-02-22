package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Employee {
	@Column(name = "id")
	@Id
	private String employeeId;

	@Column(name = "name")
	private String employeeName;

	@Column(name = "emailId")
	private String employeeEmailId;

	@ManyToOne(cascade = CascadeType.ALL)
	@Column(name = "batch")
	private Batch batch;

	@OneToOne
	private Secondary secondary;

	@OneToMany
	private Education education;

	@OneToMany
	private Address address;

	@OneToMany
	private Mock mock;

	@OneToOne
	private Bank bank;

	@OneToMany
	private TechnicalSkill technicalSkill;

	@OneToMany
	private Experience experience;

	@OneToMany
	private Contact contact;

}
