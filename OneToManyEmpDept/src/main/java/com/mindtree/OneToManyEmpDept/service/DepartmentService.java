package com.mindtree.OneToManyEmpDept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.OneToManyEmpDept.entity.Department;
import com.mindtree.OneToManyEmpDept.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department addOrUpdate(Department department) {
		return departmentRepository.save(department);
	}
	
	public boolean deleteById(Long id) {
		departmentRepository.deleteById(id);
		return true;
	}
	
	public List<Department> getAll(){
		return departmentRepository.findAll();
	}
	
	public Department getById(Long id) {
		return departmentRepository.findById(id).get();
	}
	

}
