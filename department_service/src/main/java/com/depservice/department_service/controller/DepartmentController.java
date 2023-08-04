package com.depservice.department_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.depservice.department_service.model.Department;
import com.depservice.department_service.service.DepartmentService;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping
	public ResponseEntity<Department>saveDepartment(@RequestBody Department department)
	{
		Department savedDepartment=departmentService.saveDepartment(department);
		return new ResponseEntity<>(savedDepartment,HttpStatus.CREATED);
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Department>getDepartmentById(@PathVariable("id")Long departmentId)
	{
		Department getDepartment=departmentService.getDepartmentById(departmentId);
		return new ResponseEntity<>(getDepartment,HttpStatus.OK);
	}
}
