package com.duartetech.api_curso.model.entity;

import java.time.OffsetDateTime;

import com.duartetech.api_curso.model.enums.EnrollmentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String registrationNumber;	
	private String fullName;
	private OffsetDateTime registrationDateTime;
	
	@Enumerated(EnumType.STRING)
	private EnrollmentStatus status;
	
	public Student(String fullName) {
		this.fullName = fullName;
	}
}
