package com.book.exception;

import java.sql.SQLException;

import com.exception.Book;

public class CustomException {
	boolean findnotes() {
		// boolean a=true;
		return true;

	}

	void delieveriveringclass()  {
		boolean c = true;

		try {
			
			if (c == true) 
			{
				System.out.println("notes not found");
				/*int a = 5, b = 0, res;
				res = a / b;*/
				throw new Book("Book Found");
				}
			
		} catch (Exception e) {
			System.out.println("in catch block--- ");
			System.out.println(e.getMessage());
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("------------");
				System.out.println(e1);
				e1.printStackTrace();
			}
			// System.out.println("catch block");
		}
		//System.out.println("after catch");
	}

	public static void main(String[] args) {

		CustomException ce = new CustomException();
		try {
			ce.delieveriveringclass();
			System.out.println("try block of main");
		} catch (Exception s) {
			System.out.println("catch block of main");

		}
	}

}
