package com.example.SpringMVCCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringMVCCRUD.entities.Employeee;
import com.example.SpringMVCCRUD.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeeController {

	@Autowired
	private EmployeeService empService;

	// List all employees
	@GetMapping("/list")
	public String listEmployees(Model model) {
		model.addAttribute("employees", empService.getAllData());
		return "list-employees";
	}

	@GetMapping("/form")
	public String showCreateForm(Model model) {
		model.addAttribute("employee", new Employeee());
		return "employee_form";
	}

	// save employee(create or update)
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employeee employee) {
		empService.save(employee);
		return "redirect:/employees/list";
	}
	
	
    // ✅ (Optional) Edit an existing employee
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Employeee employee = empService.getDataByID(id);
        model.addAttribute("employee", employee);
        return "employee_form";
    }

    // ✅ (Optional) Delete an employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        empService.deleteData(id);
        return "redirect:/employees/list";
    } 
}
