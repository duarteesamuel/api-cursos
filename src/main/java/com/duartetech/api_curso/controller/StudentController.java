package com.duartetech.api_curso.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duartetech.api_curso.dtos.StudentRequestDTO;
import com.duartetech.api_curso.model.entity.Student;
import com.duartetech.api_curso.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;
	
	@PostMapping
	public ResponseEntity<Void> registerStudent(@RequestBody StudentRequestDTO dto){
		
		studentService.registerStudent(dto);
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents(){
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getAllStudents());
	}
	
}
