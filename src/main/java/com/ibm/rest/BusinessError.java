/**
 * 
 */
package com.ibm.rest;

/**
 * @author root
 *
 */
public class BusinessError {

	String errorCode;
	
	String errorDesc;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public BusinessError(String errorCode, String errorDesc) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public BusinessError() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
