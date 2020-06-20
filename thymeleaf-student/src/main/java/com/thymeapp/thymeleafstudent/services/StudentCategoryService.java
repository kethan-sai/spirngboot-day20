package com.thymeapp.thymeleafstudent.services;

import java.util.List;

import com.thymeapp.thymeleafstudent.models.Student;

public interface StudentCategoryService {
	List<Student> findByCategory(String category);
}
