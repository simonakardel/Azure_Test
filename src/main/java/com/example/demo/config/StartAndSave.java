package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

// everything will be created when the project is run
@Component
public class StartAndSave implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student();
        student1.setBorn(LocalDate.now());
        student1.setName("Anne");
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setBorn(LocalDate.now().plusDays(1000));
        student2.setName("Marie");
        studentRepository.save(student2);

    }
}
