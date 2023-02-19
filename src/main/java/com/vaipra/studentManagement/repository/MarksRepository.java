package com.vaipra.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaipra.studentManagement.entity.StudentMarks;

@Repository
public interface MarksRepository extends JpaRepository<StudentMarks, Long> {

}
