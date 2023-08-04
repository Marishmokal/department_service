package com.depservice.department_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depservice.department_service.model.Department;
import com.depservice.department_service.repository.DepartmentRepo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class DepartmentServiceIMPL implements DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
		
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		
		return departmentRepo.findById(departmentId).get();
	}
}
