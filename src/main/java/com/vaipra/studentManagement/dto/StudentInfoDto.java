package com.vaipra.studentManagement.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentInfoDto implements Serializable {

	private Long stdId;
	private String stdName;
	private String stdAddress;
	private String stdEmail;
	private String stdPhoneno;
	private String stdSection;
	private String stdGrade;

}
