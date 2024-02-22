package com.te.lms.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.te.lms.enums.AddressType;

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
public class Address {
	@Enumerated(EnumType.STRING)
	private AddressType addressType;

	private String DoorNo;
	private String street;
	private String locality;
	private String city;

	@Enumerated(EnumType.STRING)
	private String state;
	@Id
	private String pinCode;
	private String landMark;

}
