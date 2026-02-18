package com.abc.SpringBootCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.SpringBootCRUD.entity.Employee;
import com.abc.SpringBootCRUD.service.EmployeeService;

@Controller
/* @RequestMapping("/emp") */
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	@GetMapping("/")
	public String listEmployees(Model model) {
		model.addAttribute("employees", empService.getAllData());
		return "views/EmpList";
	}

	@GetMapping("/employeeForm")
	public String showCreateForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "views/employeeForm";
	}

//
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		empService.save(employee);
		return "redirect:/";
	}

	@GetMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        Employee emp = empService.getDataByID(id);
        		model.addAttribute("employee", emp);
        return "views/employeeForm";
    }
//
    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {
    	empService.save(employee);
        return "redirect:/";
    }

	@GetMapping("/deleteEmployee/{id}")
    public String deleteData(@PathVariable Long id) {
		empService.deleteData(id);
		return "redirect:/";
	}
//	
//	
//	
//	
//	
////    @PostConstruct
////	public void prePersist() {
//////    	System.out.println(empService.getAllData());
////    	
////    	Employee emp = new Employee();
////		emp.setName("Ahmad2");
////		emp.setEmail("Ahmad@gmail.com");
////		emp.setAddress("Dhaka");
////		emp.setSalary(500000.00);
////
////		System.out.println(empService.save(emp));
////	}
//	
//	

}
