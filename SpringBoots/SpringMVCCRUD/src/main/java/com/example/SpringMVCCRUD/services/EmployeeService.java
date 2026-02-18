package com.example.SpringMVCCRUD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringMVCCRUD.entities.Employeee;
import com.example.SpringMVCCRUD.repository.EmployeeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeeRepository repository;
	
	public List<Employeee> getAllData(){
		return repository.findAll();
	}
	
	public Employeee getDataByID(Long id) {
		return repository.findById(id).orElse(null);
	}
	
//	public Employeee getDataByName(String name) {
//		return repository.findByName(name).orElse(null);
//	}
	
	public Employeee save(Employeee emp) {
		return repository.save(emp);
	}
	
	public Boolean deleteData(Long id) {
		Optional<Employeee> emp = repository.findById(id);
		
		if(emp.isPresent()) {
			repository.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
}
