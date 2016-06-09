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

	private List<AccountDetails> bankAcctRec = new ArrayList<AccountDetails>();
	
	private String custId;

	public List<AccountDetails> getBankAcctRec() {
		return bankAcctRec;
	}

	public void setBankAcctRec(List<AccountDetails> bankAcctRec) {
		this.bankAcctRec = bankAcctRec;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	
}
