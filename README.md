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



### Git configuration

Pour éviter certaines déconvenues pour l'accès à GitHub.com:

	git config --global url."https://".insteadOf git://
	
	