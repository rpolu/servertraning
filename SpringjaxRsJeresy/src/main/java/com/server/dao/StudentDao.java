package com.server.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.server.bean.Student;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate template;
	final Logger logger = LogManager.getLogger(StudentDao.class);

	public List<Student> getAllStudents() {
		List<Student> al = new ArrayList<>();
		List<Map<String, Object>> rows = template.queryForList("select * from student");
		for (Map row : rows) {
			Student s = new Student((int) row.get("rollnum"), (String) row.get("name"), (int) row.get("marks"),
					(String) row.get("address"));
			al.add(s);
		}
		return al;
	}

	public void addStudet(Student student) {
		template.update("insert into student values(?,?,?,?)", student.getRollNum(), student.getName(),
				student.getMarks(), student.getAddress());
	}

}
