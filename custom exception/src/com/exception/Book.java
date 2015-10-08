package com.exception;

public class Book extends Exception {
	public Book() {
		// TODO Auto-generated constructor stub
		
	}
	
	String message;

	/*public Book(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}*/

	/*public Book(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
*/
	public Book(String message) {
		//super(message);
		// TODO Auto-generated constructor stub
		//this();
		this.message=message;
		System.out.println("parameterized constructor of Book class");
	}

	/*public Book(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	*/
	@Override
	public String getMessage() {
		
		return this.message;
	}

}
