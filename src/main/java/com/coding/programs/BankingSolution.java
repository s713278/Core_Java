package com.coding.programs;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

class Account {
	Integer accountId;
	Instant timeStamp;
	Double amount;

	public Account(Integer accountId, Instant timeStamp) {
		super();
		this.accountId = accountId;
		this.timeStamp = timeStamp;
	}

	public Account(Integer accountId, Instant timeStamp, Double amount) {
		super();
		this.accountId = accountId;
		this.timeStamp = timeStamp;
		this.amount = amount;
	}
}

public class BankingSolution {

	private static Map<Integer, Account> bankDatabase = new HashMap<Integer, Account>();
	static {
		bankDatabase.put(2, new Account(2, Instant.now()));
	}
	
	

	public boolean createAccount(Integer accountID, Instant timeStamp) {
		if (bankDatabase.get(accountID) == null) {
			System.out.println("Create new accout nwith ID: " + accountID);
			bankDatabase.put(accountID, new Account(accountID, Instant.now()));
			return true;
		}
		return false;
	}

	
	
	public void deposit(Integer fromAccountID, Instant timeStamp, Double amount) {

	}

	public void pay(Integer toAccountID, Instant timeStamp, Double amount) {

	}

	public static void main(String[] args) {

	}

}
