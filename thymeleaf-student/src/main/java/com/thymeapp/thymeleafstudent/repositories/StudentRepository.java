package com.thymeapp.thymeleafstudent.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thymeapp.thymeleafstudent.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query(value = "Select s.id,s.department,s.name,s.updated_by,s.updated_on from student s where s.department LIKE :category", nativeQuery = true)
	List<Student> findByCategory(String category);
}
