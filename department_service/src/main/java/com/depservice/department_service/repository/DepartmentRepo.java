package com.depservice.department_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.depservice.department_service.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

	Optional<Department> findById(Long departmentId);

}
