package com.meritamerica.assignment3;

//Created by Behulum W
public class CheckingAccount extends BankAccount {

	private static final double INTEREST_RATE = .0001;

	public CheckingAccount(double openingBalance) {

		super(openingBalance, INTEREST_RATE);

	}
}