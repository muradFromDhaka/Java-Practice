package com.abc.SpringBootCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.SpringBootCRUD.entity.Employee;
import com.abc.SpringBootCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	
	public List<Employee> getAllData(){
		return empRepo.findAll();
	}
	
	public Employee getDataByID(Long id) {
		return empRepo.findById(id).orElse(null);
	}
	
	public Employee getDataByName(String name) {
		return empRepo.findByName(name).orElse(null);
	}
	
	public Employee save(Employee emp) {
		return empRepo.save(emp);
	}
	
	public Boolean deleteData(Long id) {
		Optional<Employee> emp = empRepo.findById(id);
		
		if(emp.isPresent()) {
			empRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}

}
