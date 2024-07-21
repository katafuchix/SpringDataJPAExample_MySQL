package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity annotation defines that a 
//class can be mapped to a table
@Entity 
public class Employee {

    // @ID This annotation specifies 
    // the primary key of the entity.
    @Id 
  
    // @GeneratedValue This annotation 
    // is used to specify the primary 
    // key generation strategy to use
    // JPAプロバイダー がデフォルトの生成戦略を選択
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
    // 主キーの生成をデータベースに任せる方法 AUTO_INCREMENT 機能を利用
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
	private String role;
	
    public Employee() {
        super();
    }
    public Employee(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
