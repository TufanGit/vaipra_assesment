package com.vaipra.studentManagement.allEntityNames;

import com.vaipra.studentManagement.entity.StudentInfo;
import com.vaipra.studentManagement.entity.StudentMarks;

import lombok.Data;
/**
 * 
 * @author Vaipra Tech Solution
 *
 *This class is uses for,when we want to get
 *both Student Details and Marks for that specific Student
 */
@Data
public class EntityAsProperties {

	private StudentInfo studentInfo;// It holds Student Personal details
	private StudentMarks studentMarks;//It holds Student Marks details
}
