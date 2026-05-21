package com.vishalini.project_11.service;

import com.vishalini.project_11.model.Student;
import com.vishalini.project_11.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public void saveStudent(Student student){
        repo.save(student);
    }
    public List<Student>getAllStudents(){
        return repo.findAll();
    }

    public void deleteStudent(int id){
        repo.deleteById(id);
    }

    public Student updateStudent(int id, Student updatedStudent){

        Student student = repo.findById(id).orElse(null);

        if(student != null){
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setDepartment(updatedStudent.getDepartment());
            student.setGrade(updatedStudent.getGrade());

            return repo.save(student);
        }
        return null;
    }
}


