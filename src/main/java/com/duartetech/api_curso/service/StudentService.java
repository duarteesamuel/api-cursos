package com.duartetech.api_curso.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.duartetech.api_curso.dtos.StudentRequestDTO;
import com.duartetech.api_curso.model.entity.Student;
import com.duartetech.api_curso.model.enums.EnrollmentStatus;
import com.duartetech.api_curso.repository.StudentRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;
	
	@Transactional
	public void registerStudent(StudentRequestDTO dto) {
		
		Student student = Student.builder()
				.registrationNumber(generatedRegistrationNumber())
				.fullName(dto.fullName())
				.registrationDateTime(OffsetDateTime.now())
				.status(EnrollmentStatus.ACTIVE)
				.build();
		
		studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	
	private String generatedRegistrationNumber() {
		
		Random random = new Random();
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		while(uniqueNumbers.size() < 8) {
			uniqueNumbers.add(random.nextInt(10));
		}
		
		String digits = uniqueNumbers.stream()
											.map(String::valueOf)
											.reduce("", String::concat);
		
		return digits;
		
	}
}
