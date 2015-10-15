package fr.homezone.exception;

import java.util.ResourceBundle;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

	private static final ResourceBundle resource = 	ResourceBundle.getBundle("fr.homezone.exception.WebApplicationExceptionMapper");
	
	static final Logger logger = LoggerFactory.getLogger(WebApplicationExceptionMapper.class);
	
	@Override
	public Response toResponse(WebApplicationException e) {
		logger.error("WebApplicationException", e);
		
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setLink(resource.getString(Integer.toString(e.getResponse().getStatus())));
		errorMessage.setStatus(e.getResponse().getStatus());
		errorMessage.addMessage(e.getMessage());
		
		return Response.status(errorMessage.getStatus()).entity(errorMessage).type(MediaType.APPLICATION_JSON)
				.build();

	}

}