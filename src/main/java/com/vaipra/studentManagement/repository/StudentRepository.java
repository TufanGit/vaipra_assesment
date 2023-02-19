package com.vaipra.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaipra.studentManagement.entity.StudentInfo;

@Repository
public interface StudentRepository extends JpaRepository<StudentInfo, Long> {

}
