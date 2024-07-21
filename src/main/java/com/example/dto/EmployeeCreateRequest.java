package com.example.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeCreateRequest implements Serializable {
    /**
     * name
     */
    @NotEmpty(message = "名前を入力してください")
    @Size(max = 100, message = "名前は100桁以内で入力してください")
    private String name;
    
    /**
     * role
     */
    @NotEmpty(message = "役職を入力してください")
    @Size(max = 100, message = "役職は100桁以内で入力してください")
    private String role;
}
