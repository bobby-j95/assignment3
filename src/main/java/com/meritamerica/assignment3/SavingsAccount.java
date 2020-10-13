package com.meritamerica.assignment3;

/*Savings Account class for user
 * Created by Robert J
 */
public class SavingsAccount extends BankAccount{

	// All constants needed in class
	private static final double INTEREST_RATE = .01;

	// Constructor that adds balance and interest to the account 
	public SavingsAccount (double openingBalance) {
		
		super(openingBalance, INTEREST_RATE);
		
	}

}