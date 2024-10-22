package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		if(this.pin == attemptedPin){
			return true;
		}
		return false;
		// return attemptedPin == this.getPin();
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
	//	this.balance = BigDecimal.valueOf(amount).add(BigDecimal.valueOf(this.balance)).doubleValue();
	this.balance += amount;
}

	public boolean debitAccount(double amount) {
		// complete the function

		if (amount > this.getBalance()) {
			System.out.println("Debit cannot proceed.");
			return false;
		}

		this.balance = BigDecimal.valueOf(this.getBalance())
		.subtract(BigDecimal.valueOf(amount)).doubleValue();
		return true;
	}
}
