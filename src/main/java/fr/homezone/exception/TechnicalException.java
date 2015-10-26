package fr.homezone.exception;

public class TechnicalException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3698852468345497663L;

	private ErrorMessage errorMessage = new ErrorMessage();

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public TechnicalException(String link, String... mesgs) {
		this.errorMessage.setLink(link);
		this.errorMessage.setStatus(500);
		for (String mesg : mesgs) {
			this.errorMessage.getMessages().add(mesg);
		}
	}

}
