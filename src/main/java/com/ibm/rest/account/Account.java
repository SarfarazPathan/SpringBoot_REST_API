/**
 * 
 */
package com.ibm.rest.account;

/**
 * @author root
 *
 */
public class Account {
	
	String bankAccountId;
	String accountHolderName;
	String availableBalance;
	String currentBalance;
	String availableLimit;
	String branchCode;
	
	
	
	public String getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getAvailableLimit() {
		return availableLimit;
	}
	public void setAvailableLimit(String availableLimit) {
		this.availableLimit = availableLimit;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	
	

}
