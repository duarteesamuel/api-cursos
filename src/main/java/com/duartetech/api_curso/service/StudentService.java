package com.duartetech.api_curso.service;

import org.springframework.stereotype.Service;

import com.duartetech.api_curso.model.entity.Student;
import com.duartetech.api_curso.repository.StudentRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;
	
	@Transactional
	public void registerStudent(Student student) {
		
		studentRepository.save(student);
	}
}
