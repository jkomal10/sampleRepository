package com.report.CATToolApplication.Exception;

public class CATToolApplicationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5549570710525280345L;
	
	public CATToolApplicationException(String s) {
		super(s);
		System.out.println(s);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Wrong Password";
	}
	
	

}
