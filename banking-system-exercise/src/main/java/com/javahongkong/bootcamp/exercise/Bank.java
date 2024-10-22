package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	private static long accNumCount = 0L;


	public Bank() {
		// complete the function ok
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function OK
		return this.accounts.get(accountNumber);
	}

	@Override
	public Long openCommercialAccount(Company company, int pin,
			double startingDeposit) {
		// complete the function
		CommercialAccount commercialAccount =
				new CommercialAccount(company, ++accNumCount, pin, startingDeposit);
		this.accounts.put(accNumCount, commercialAccount);
		// return commercialAccount.getAccountNumber(); w
		return accNumCount;
	}

	@Override
	public Long openConsumerAccount(Person person, int pin,
			double startingDeposit) {
		// complete the function
		ConsumerAccount consumerAccount =
				new ConsumerAccount(person, ++accNumCount, pin, startingDeposit);
		this.accounts.put(accNumCount, consumerAccount);
		// return consumerAccount.getAccountNumber(); w
		return accNumCount;
	}

	@Override
	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		boolean accOK = false;
		boolean pinOK = false;
		if (accounts.containsKey(accountNumber)) {
			accOK = true;
		}
		if (accounts.get(accountNumber).getPin() == pin) {
			pinOK = true;
		}
		if (pinOK == false || accOK == false) {
			return false;
		}
		return true;
	}

	@Override
	public double getBalance(Long accountNumber) {
		// complete the function
		System.err.println("  accountNumber   " + accountNumber);
		// return this.accounts.get(accountNumber).getBalance();
		return this.getAccount(accountNumber).getBalance();

	}

		
	public void credit(Long accountNumber, double amount) {
		// complete the function
		// BigDecimal.valueOf(accounts.get(accountNumber).getBalance())
		// 		.add(BigDecimal.valueOf(amount));
		this.getAccount(accountNumber).creditAccount(amount);
	}

	@Override
	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		// BigDecimal.valueOf(accounts.get(accountNumber).getBalance())
		// .subtract(BigDecimal.valueOf(amount));
		// return false;
		if (amount <= 0)
			throw new IllegalArgumentException("Amount must be >0");
		if (amount > this.getAccount(accountNumber).getBalance()) {
			return false;
		}
		return this.getAccount(accountNumber).debitAccount(amount);
	}
}
