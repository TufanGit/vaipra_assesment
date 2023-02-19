package com.vaipra.studentManagement.constant;

public interface AppConstant {
	// To map with the all APIs
	public static String BASE_URL = "/student";

	// Database Tables name
	public static String STUDENT_INFO = "student_info";
	public static String STUDENT_MARKS = "student_marks";

	// URL for the StudentInfo controller
	public static String INSERT_STUDENT_RECORDS = "/details/insert";
	public static String GET_ALL_STUDENT_RECORDS = "/details/getAllStudentRecords";
	public static String GET_STUDENT_INFO_WITH_MARKS = "/details/getStudentAndMarks/{id}";
	public static String DELETE_STUDENT_BY_ID="/details/deleteById";

	// URL for the StudentMarks Controller
	public static String ADD_RESPECTIVE_MARKS_DETAILS = "/marks/insert_marks";

}
