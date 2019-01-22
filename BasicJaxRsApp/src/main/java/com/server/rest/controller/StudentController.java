package com.server.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.config.status.StatusBean;
import com.server.bean.Student;

@Path("/student")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(value = "/getAll")
	public Response gettAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Student s = new Student(10, "rama", 10, "bang");
		students.add(s);
		students.add(s);
		StatusBean bean = new StatusBean();
		bean.setData(students);
		return Response.ok().entity(bean).build();
	}

}
