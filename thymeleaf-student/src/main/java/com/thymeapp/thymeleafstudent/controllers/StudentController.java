package com.thymeapp.thymeleafstudent.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thymeapp.thymeleafstudent.models.Student;
import com.thymeapp.thymeleafstudent.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		final List<Student> students = studentService.getAll();
		model.addAttribute("students", students);

		final String username = "User";
		model.addAttribute("username", username);

		return "students";
	}

	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Student> getOne(Integer Id) {
		return studentService.getOne(Id);
	}

	@PostMapping("/addNew")
	public String addNew(Student student) {
		studentService.addNew(student);
		return "redirect:/students/getAll";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/students/getAll";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer Id) {
		studentService.delete(Id);
		return "redirect:/students/getAll";
	}

	@RequestMapping("/byCategory")
	public String byCategory(@RequestParam(value = "categoryButton") String cat) {
		studentService.findByCategory(cat);
		System.out.println(cat);

		return "output";
	}

}
