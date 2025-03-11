package com.duartetech.api_curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duartetech.api_curso.model.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
