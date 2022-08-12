package com.mindtree.OneToManyEmpDept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.OneToManyEmpDept.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
