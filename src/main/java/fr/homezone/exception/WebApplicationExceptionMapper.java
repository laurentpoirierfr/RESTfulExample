package fr.homezone.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

	// private static final ResourceBundle resource =
	// ResourceBundle.getBundle("");

	@Override
	public Response toResponse(WebApplicationException e) {
		
		ErrorMessage errorMessage = new ErrorMessage();
		
		errorMessage.setStatus(e.getResponse().getStatus());
		errorMessage.addMessage(e.getMessage());
		
		return Response.status(errorMessage.getStatus()).entity(errorMessage).type(MediaType.APPLICATION_JSON)
				.build();

	}

}