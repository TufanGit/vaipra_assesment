package com.vaipra.studentManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import com.vaipra.studentManagement.allEntityNames.EntityAsProperties;
import com.vaipra.studentManagement.dto.StudentInfoDto;
import com.vaipra.studentManagement.entity.StudentInfo;
import com.vaipra.studentManagement.repository.MarksRepository;
import com.vaipra.studentManagement.repository.StudentRepository;
import com.vaipra.studentManagement.response.ResponseGiver;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private MarksRepository marksRepository;

	public void addStudents(List<StudentInfoDto> list) {
		List<StudentInfo> newList = new ArrayList<StudentInfo>();

		for (StudentInfoDto ref : list) {
			StudentInfo studentInfo = new StudentInfo();
			BeanUtils.copyProperties(ref, studentInfo); // BeanUtils is using to map the DTO with the entity
			newList.add(studentInfo);
		}
		studentRepository.saveAll(newList);
	}

	public List<StudentInfo> getAllStudentRecords() {
		return studentRepository.findAll();
	}

	public StudentInfo getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	public EntityAsProperties getStudentInfoWithMarks(@RequestHeader Long id) {

		EntityAsProperties asProperties = new EntityAsProperties();
		asProperties.setStudentInfo(getStudentById(id));
		asProperties.setStudentMarks(marksRepository.findById(id).get());

		return asProperties; //It will return Student details and his/her marks details
	}
	
	public ResponseGiver deleteStudentById(Long id) {
		ResponseGiver responseGiver = new ResponseGiver();
		try { //If with the same id student is available or not
			studentRepository.deleteById(id);
			
			try { //If with the same id marks is not available
				marksRepository.deleteById(id);
				responseGiver.setMessage("Records deleted successfully");
				responseGiver.setCode("00");
				return responseGiver;
			}catch (Exception e) { //If with same id student marks is not available
				
				responseGiver.setMessage("Student Records deleted successfully but no marks there for this id");
				responseGiver.setCode("00");
				return responseGiver;
			}
			
		} catch (Exception e) { //If wrong input is there 
			
			
			responseGiver.setMessage("You might have entered wrong input");
			responseGiver.setCode("99");
			return responseGiver;
			
		}
		
		
		
	}
}
