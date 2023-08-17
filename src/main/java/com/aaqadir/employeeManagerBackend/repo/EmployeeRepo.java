package com.aaqadir.employeeManagerBackend.repo;

import com.aaqadir.employeeManagerBackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
