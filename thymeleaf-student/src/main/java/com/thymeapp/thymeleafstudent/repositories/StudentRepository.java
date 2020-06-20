package com.thymeapp.thymeleafstudent.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thymeapp.thymeleafstudent.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query(value = "Select s.id,s.name,s.department from registration_module.student s where s.department LIKE  %:keyword%", nativeQuery = true)
	public List<Student> findByCategory(@Param("keyword") String keyword);
}
