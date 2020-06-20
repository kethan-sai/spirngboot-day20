package com.thymeapp.thymeleafstudent.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymeapp.thymeleafstudent.models.Student;
import com.thymeapp.thymeleafstudent.repositories.StudentRepository;

@Service
public class StudentService implements StudentCategoryService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}

	public Optional<Student> getOne(Integer Id) {
		return studentRepository.findById(Id);
	}

	public void addNew(Student student) {
		studentRepository.save(student);
	}

	public void update(Student student) {
		studentRepository.save(student);
	}

	public void delete(Integer Id) {
		studentRepository.deleteById(Id);
	}

	@Override
	public List<Student> findByCategory(String category) {

		final List<Student> categoryList = studentRepository.findByCategory(category);
		return categoryList;
	}

}
