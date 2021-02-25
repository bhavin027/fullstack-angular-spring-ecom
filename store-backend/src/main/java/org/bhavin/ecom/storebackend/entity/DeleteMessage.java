package org.bhavin.ecom.storebackend.entity;

public class DeleteMessage {

	private String message;
	
	public DeleteMessage() {}

	public DeleteMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DeleteMessage [message=" + message + "]";
	}
	
	
}
