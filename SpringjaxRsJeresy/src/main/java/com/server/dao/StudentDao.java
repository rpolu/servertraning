package com.server.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.server.bean.Student;

@Repository
public class StudentDao {
	static List<Student> al = new ArrayList<>();

	public List<Student> getAllStudents() {
		Student s1 = new Student(10, "rama", "90", "Marathalli");
		Student s2 = new Student(11, "Ravi", "91", "Bang");
		Student s3 = new Student(11, "Narashimaiah", "92", "SilkBorad");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		return al;
	}

	public void addStudet(Student student) {
		al.add(student);
	}

}
