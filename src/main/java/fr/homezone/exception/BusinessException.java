package fr.homezone.exception;


public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;

	private ErrorMessage errorMessage = new ErrorMessage();
	
	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}
	
	public BusinessException(String link, String... mesgs) {
		this.errorMessage.setLink(link);
		this.errorMessage.setStatus(400);
		for (String mesg : mesgs) {
			this.errorMessage.getMessages().add(mesg);
		}
	}
}