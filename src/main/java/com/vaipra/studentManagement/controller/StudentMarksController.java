package com.vaipra.studentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaipra.studentManagement.constant.AppConstant;
import com.vaipra.studentManagement.dto.StudentMarksDto;
import com.vaipra.studentManagement.response.ResponseGiver;
import com.vaipra.studentManagement.service.MarksService;

@RestController
@RequestMapping(value = AppConstant.BASE_URL)
public class StudentMarksController {

	@Autowired
	private MarksService marksService;

	// To insert student marks
	@PostMapping(value = AppConstant.ADD_RESPECTIVE_MARKS_DETAILS)
	public ResponseGiver addRespectiveMarksDetails(@RequestBody StudentMarksDto studentMarksDto) {
		return marksService.addRespectiveMarksDetails(studentMarksDto);
	}
}
