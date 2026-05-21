package com.vishalini.project_11.repo;

import com.vishalini.project_11.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
