package com.meritamerica.assignment3;

public class CDOffering {
	int term;
	double interestRate;

	// created by behulum w

	CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}

	public double getInterestRate() {
		
		return interestRate;
	}
}