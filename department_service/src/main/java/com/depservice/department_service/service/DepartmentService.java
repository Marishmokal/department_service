package com.depservice.department_service.service;

import com.depservice.department_service.model.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	Department getDepartmentById(Long departmentId);

}
