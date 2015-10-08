package com.exception;

public class BadcredentialsException extends RuntimeException {

	public BadcredentialsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BadcredentialsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BadcredentialsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BadcredentialsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println("in badcredentials");
	}

	public BadcredentialsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
