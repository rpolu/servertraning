package com.server.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.config.status.StatusBean;

@Provider
public class NotAvailableMapper implements ExceptionMapper<UserNotAvailbleException> {
	private static final long serialVersionUID = 1L;
	final Logger logger = LogManager.getLogger(NotAvailableMapper.class);

	@Override
	public Response toResponse(UserNotAvailbleException exception) {
		logger.error("Problem occued ", exception.getCause(), exception);
		StatusBean bean = new StatusBean();
		bean.setStCode("E002");
		bean.setData("Problem Occured");
		return Response.ok().entity(bean).build();
	}

}
