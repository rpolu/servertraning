package com.server.rest.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.config.status.StatusBean;
import com.server.bean.Student;
import com.student.service.StudentService;

@Controller
@Path("/student")
public class StudentController {
	@Autowired
	private StudentService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(value = "/getAll")
	public Response gettAllStudents() {
		List<Student> students = service.getStudents();
		StatusBean bean = new StatusBean();
		bean.setData(students);
		return Response.ok().entity(bean).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(value = "/add")
	public Response addStudent(Student student) {
		service.addStudet(student);
		StatusBean bean = new StatusBean();
		bean.setData(null);
		return Response.ok().entity(bean).build();
	}

}
