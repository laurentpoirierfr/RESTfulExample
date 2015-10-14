package fr.homezone.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException> {

	// private static final ResourceBundle resource =
	// ResourceBundle.getBundle("com.blogspot.avianey");

	@Override
	public Response toResponse(BusinessException e) {
		return Response.status(Status.BAD_REQUEST).entity(e.getErrorMessage()).type(MediaType.APPLICATION_JSON).build();
	}

}
