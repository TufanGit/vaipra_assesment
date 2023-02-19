package com.vaipra.studentManagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vaipra.studentManagement.constant.AppConstant;

import lombok.Data;

@Data
@Entity
@Table(name = AppConstant.STUDENT_MARKS)
public class StudentMarks implements Serializable {

	@Id
	private Long stdId;
	private String session;
	private String semester;
	private Integer totalSubject;
	private Integer totalMarks;
}
