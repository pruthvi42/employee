package com.mindtree.OneToManyEmpDept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.OneToManyEmpDept.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
