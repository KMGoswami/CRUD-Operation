/**
 * @author kartavya goswami
 * This will be our controller class.
 * It will redirect the URL by using requestmapping annotation. 
 */

package com.work.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.work.entity.*;
import com.work.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/Add")
	public String displayForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "Add";
		
	}
	
	@RequestMapping(value="/saveProcess")
	public String saveProcess(@ModelAttribute("student") Student student, Model model ) {
		studentService.saveStudentObj(student); 
		List <Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		return "ListStudents";
	}
	
	@RequestMapping(value="/ListStudents")
	public String getAllStudens(Model model) {
		List<Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList",studentList);
		return "ListStudents";
	}
	
	@RequestMapping(value="/showUpdateForm")
	public String showUpdateForm(@RequestParam("studentName") String studentName,Model model) {
		Student student = findByName(studentName);
		model.addAttribute("student", student);
		return "Add";
	}
	
	@RequestMapping(value="/deleteRecord")
	public String deleteStudentObj(@RequestParam("studentName") String studentName, Model model) {
		Student student = findByName(studentName);
		studentService.deleteStudentObj(student);
		return "redirect:/ListStudents";
	}
	
	private Student findByName(String studentName) {
		Student student = studentService.getStudentObj(studentName);
		return student;
	}	
	
}
