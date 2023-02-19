package com.vaipra.studentManagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vaipra.studentManagement.constant.AppConstant;

import lombok.Data;

@Data
@Entity
@Table(name = AppConstant.STUDENT_INFO)
public class StudentInfo implements Serializable {

	@Id
	private Long stdId;
	private String stdName;
	private String stdAddress;
	private String stdEmail;
	private String stdPhoneno;
	private String stdSection;
	private String stdGrade;

}
