package com.vaipra.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaipra.studentManagement.allEntityNames.EntityAsProperties;
import com.vaipra.studentManagement.constant.AppConstant;
import com.vaipra.studentManagement.dto.StudentInfoDto;
import com.vaipra.studentManagement.entity.StudentInfo;
import com.vaipra.studentManagement.response.ResponseGiver;
import com.vaipra.studentManagement.service.StudentService;

@RestController
@RequestMapping(value = AppConstant.BASE_URL)
public class StudentController {

	@Autowired
	private StudentService studentService;

	ResponseGiver responseGiver = new ResponseGiver();

	@PostMapping(value = AppConstant.INSERT_STUDENT_RECORDS)
	public ResponseGiver AddStudents(@RequestBody List<StudentInfoDto> list) { // To add Student details into

		try {//If Student is not available for the given id
			studentService.addStudents(list);

			responseGiver.setMessage(list.size() + " records inserted successfully");
			responseGiver.setCode("00");
			return responseGiver;
		} catch (Exception e) {
			responseGiver.setMessage("Failed to insert records");
			responseGiver.setCode("99");
			return responseGiver;
		}

	}

	// To read all Student Details
	@GetMapping(value = AppConstant.GET_ALL_STUDENT_RECORDS)
	public List<StudentInfo> getAllStudentRecords() {
		return studentService.getAllStudentRecords();
	}

	// This method is for insert student marks operation
	public StudentInfo getStudentById(Long id) {
		return studentService.getStudentById(id);
	}

	// To read Student Details along with marks details
	@GetMapping(value = AppConstant.GET_STUDENT_INFO_WITH_MARKS)
	public EntityAsProperties getStudentInfoWithMarks(@PathVariable("id") Long id) {
		return studentService.getStudentInfoWithMarks(id);
	}

	// To delete student details and marks by id
	@DeleteMapping(value = AppConstant.DELETE_STUDENT_BY_ID)
	public ResponseGiver deleteStudentById(Long id) {
		return studentService.deleteStudentById(id);
		
	}
	

}
