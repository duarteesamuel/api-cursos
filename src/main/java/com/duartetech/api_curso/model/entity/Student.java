package com.duartetech.api_curso.model.entity;

import java.time.LocalDate;

import com.duartetech.api_curso.model.enums.EnrollmentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String registrationNumber;	
	private String fullName;
	private LocalDate registrationDate;
	private EnrollmentStatus status;
	
}
