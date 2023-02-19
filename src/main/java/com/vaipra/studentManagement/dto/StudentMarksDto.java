package com.vaipra.studentManagement.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentMarksDto implements Serializable {

	private Long stdId;
	private String session;
	private String semester;
	private Integer totalSubject;
	private Integer totalMarks;
}
