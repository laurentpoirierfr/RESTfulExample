# ResfulExample

### Gestion des exceptions : 

TechnicalException, BusinessException ainsi que tout autre WebApplicationException.

Structure ErrorMessage :

	public class ErrorMessage {

		private int status;
		private String link = "";
		private List<String> messages;

		...
	}


