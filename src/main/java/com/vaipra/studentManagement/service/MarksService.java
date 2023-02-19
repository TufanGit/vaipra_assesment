package com.vaipra.studentManagement.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaipra.studentManagement.controller.StudentController;
import com.vaipra.studentManagement.dto.StudentMarksDto;
import com.vaipra.studentManagement.entity.StudentMarks;
import com.vaipra.studentManagement.repository.MarksRepository;
import com.vaipra.studentManagement.response.ResponseGiver;

@Service
public class MarksService {

	@Autowired
	private MarksRepository marksRepository;

	@Autowired
	private StudentController studentController;

	public ResponseGiver addRespectiveMarksDetails(StudentMarksDto studentMarksDto) {

		ResponseGiver responseGiver = new ResponseGiver();
		Long id = studentMarksDto.getStdId();
		
		/**
		 * try-catch is used
		 * If the given id of the student is not present in database
		 */

		try {
			if (id == studentController.getStudentById(id).getStdId()) { 
				StudentMarks marks = new StudentMarks();
				BeanUtils.copyProperties(studentMarksDto, marks);//This BeanUtils is using to map the MarksDTO with the Marks Entity
				marksRepository.save(marks);
				responseGiver.setMessage("Record inserted successfully");
				responseGiver.setCode("00");
				return responseGiver;
			} else {
				responseGiver.setMessage("Record insertion failed");
				responseGiver.setCode("99");
				return responseGiver;
			}
		} catch (Exception e) {
			responseGiver.setMessage("Record insertion failed");
			responseGiver.setCode("99");
			return responseGiver;
		}

	}

	public StudentMarks getStudentMarksById(Long id) {
		return marksRepository.findById(id).get();
	}
}
