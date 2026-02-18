package com.abc.SpringBootCRUD.controller;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.abc.SpringBootCRUD.entity.Student;
import com.abc.SpringBootCRUD.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	StudentService stuService;
	
	@GetMapping("/Home")
	public String homePage() {
	    return "views/HomePage"; 
	}
	
	
	@GetMapping("/S_List")
	public String showData(Model model) {
       model.addAttribute("students", stuService.getAllData());
       return "views/StuList";
	}
	
	@PostMapping("/studentForm")
	public String saveData(@ModelAttribute("student") Student student){
		stuService.save(student);
		return "redirect:/S_List";
	}
	
	@GetMapping("/studentForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "views/StudentForm";
	}
	
	@GetMapping("/editStudent/{id}")
	public String editStudentForm(@PathVariable("id") Long id, Model model) {
	    Student existingStu = stuService.getById(id);
	    if (existingStu != null) {
	        model.addAttribute("student", existingStu);
	        return "views/StudentForm";
	    } else { 
	        return "redirect:/S_List";
	    }
	}

	@GetMapping("/deleteStudent/{id}")
	public String delete(@PathVariable Long id) {
		stuService.deleteData(id);
		return "redirect:/S_List";
	}
	
}
