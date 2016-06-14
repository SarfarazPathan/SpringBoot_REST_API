/**
 * 
 */
package com.ibm.rest.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author root
 *
 */
public class AccountDetailsOutput {

	private List<Account> accounts = new ArrayList<Account>();
	
	private String custId;


	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	
}
