package com.vaipra.studentManagement.response;

import lombok.Data;
/**
 * 
 * @author Vaipra Tech Solution
 *
 *This class will give some message and a code
 * according to the operation
 */
@Data
public class ResponseGiver {

	private String message;//To provide customized message
	private String code; //To provide customized code
}
