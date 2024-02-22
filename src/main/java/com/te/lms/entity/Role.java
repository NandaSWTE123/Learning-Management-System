package com.te.lms.entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

import antlr.collections.List;

public class Role {
	@Id
	private String roleId;
	private String roleName;

	@ManyToMany
	private GoLmsUser goLmsUser;

}
