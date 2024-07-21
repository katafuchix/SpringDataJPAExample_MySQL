package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeUpdateRequest extends EmployeeCreateRequest implements Serializable {

	//@NotEmpty(message = "IDを入力してください")
    private Integer id;
	
}
