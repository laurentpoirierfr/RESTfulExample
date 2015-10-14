package fr.homezone.exception;

import java.util.ArrayList;
import java.util.List;

public class ErrorMessage {

	private int status;
	private String link = "";
	private List<String> messages;

	public ErrorMessage() {
		this.messages = new ArrayList<String>();
	}

	public ErrorMessage(int status, String link, List<String> messages) {
		this.status = status;
		this.link = link;
		this.messages = messages;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

}
