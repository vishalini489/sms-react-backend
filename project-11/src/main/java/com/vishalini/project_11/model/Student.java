package com.vishalini.project_11.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name ="sms_students")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    @Column (unique = true)
    String email;
    String department;
    String grade;
}

