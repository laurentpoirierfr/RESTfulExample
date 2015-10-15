package fr.homezone.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class TechnicalExceptionMapper implements ExceptionMapper<TechnicalException> {

	// private static final ResourceBundle resource =
	// ResourceBundle.getBundle("");
	static final Logger logger = LoggerFactory.getLogger(TechnicalExceptionMapper.class);

	@Override
	public Response toResponse(TechnicalException e) {
		logger.error("TechnicalException", e);
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getErrorMessage())
				.type(MediaType.APPLICATION_JSON).build();
	}

}