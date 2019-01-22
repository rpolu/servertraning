package com.server.rest.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.config.status.StatusBean;
import com.server.bean.Student;
import com.server.rest.exception.UserNotAvailbleException;
import com.student.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/student")
@Api(value = "Hello API - say hello to the world", produces = "application/json")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
public class StudentController {
	@Autowired
	private StudentService service;

	final Logger logger = LogManager.getLogger(StudentController.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(value = "/getAll")
	@ApiOperation(value = "Returns All Students Details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Returns the students Details") })
	public Response gettAllStudents() {
		logger.info(" Request came to controller");
		List<Student> students = service.getStudents();
		logger.info("Service call oSver ");
		StatusBean bean = new StatusBean();
		bean.setData(students);
		return Response.ok().entity(bean).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(value = "/add")
	public Response addStudent(Student student) throws UserNotAvailbleException {
		service.addStudet(student);
		StatusBean bean = new StatusBean();
		bean.setData(null);
		return Response.ok().entity(bean).build();
	}

}
