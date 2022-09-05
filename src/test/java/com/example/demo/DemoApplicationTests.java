package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testStudent() {
		Student student1 = new Student();
		student1.setBorn(LocalDate.now());
		student1.setName("Anne");
		studentRepository.save(student1);

		List<Student> students = studentRepository.findAll();
		assertEquals(3, students.size());

		studentRepository.delete(student1);
		students = studentRepository.findAll();
		assertEquals(2, students.size());


	}

}
