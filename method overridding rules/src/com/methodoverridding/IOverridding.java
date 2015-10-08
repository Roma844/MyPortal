package com.methodoverridding;

import java.sql.SQLException;

public interface IOverridding {
	//checked exception
	void m1() throws SQLException;
	void m2();
	//uncecked exception or runtime exception
	void m3() throws ArithmeticException;

}
