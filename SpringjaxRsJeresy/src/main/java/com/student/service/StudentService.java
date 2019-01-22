package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.bean.Student;
import com.server.dao.StudentDao;
import com.server.rest.exception.UserNotAvailbleException;

@Service
public class StudentService {
	@Autowired
	private StudentDao dao;

	public List<Student> getStudents() {
		return dao.getAllStudents();
	}

	public void addStudet(Student student) throws UserNotAvailbleException {
		if (true) {

			throw new UserNotAvailbleException();

		}
		dao.addStudet(student);

	}

}
