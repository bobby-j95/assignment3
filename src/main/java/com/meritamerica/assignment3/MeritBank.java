package com.meritamerica.assignment3;

import java.util.Arrays;
import java.util.Random;

/*This is the MeritBank part of the assignment.
 * This interacts with CDOffering.java and AccountHolder.java
 * Created by Robert Johns
 */
public class MeritBank {

	// All private variables needed in the program
	private static int numOfAccountHolder = 0;
	private static long nextAccountNumber = 1;
	private static AccountHolder[] accountHolderArray = new AccountHolder[0];
	private static CDOffering[] cdOffering = new CDOffering[5];
	private static double totalValue = 0;

	//This adds another AccountHolder to the array
	static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] tempAccHolder = new AccountHolder[accountHolderArray.length+1];
		for(int i = 0; i < accountHolderArray.length; i++) {
			tempAccHolder[i] = accountHolderArray[i];
		}
		tempAccHolder[numOfAccountHolder] = accountHolder;
		accountHolderArray = tempAccHolder;
		numOfAccountHolder++;
	}
	
	//getter for the AccountHolder array
	static AccountHolder[] getAccountHolders() {
		return accountHolderArray;
	}

	//getter for the CDOffering array
	static CDOffering[] getCDOfferings() {
		return cdOffering;	
	}

	//compares the best value for CDAccount by its offerings and outputs that offering
	static CDOffering getBestCDOffering(double depositAmount) {
		CDOffering temp = cdOffering[0];
		for (int x = 1; x < cdOffering.length; x++) {
				if (futureValue(depositAmount, cdOffering[x-1].getInterestRate(), cdOffering[x-1].getTerm())
					< futureValue(depositAmount, cdOffering[x].getInterestRate(), cdOffering[x].getTerm())) {
					temp = cdOffering[x];
				}
		}
		return temp;
	}

	//compares the second best value for CDAccount by its offerings and outputs that offering
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		CDOffering temp = cdOffering[0];
		CDOffering temp2 = cdOffering[0];
		for (int x = 1; x < cdOffering.length; x++) {
				if (futureValue(depositAmount, cdOffering[x-1].getInterestRate(), cdOffering[x-1].getTerm())
					< futureValue(depositAmount, cdOffering[x].getInterestRate(), cdOffering[x].getTerm())) {
					temp2 = temp;
					temp = cdOffering[x];
				}
		}
		return temp2;	
	}

	//clears the offering array
	static void clearCDOfferings() {
		cdOffering = null;
	}

	//setter for the offering array
	static void setCDOfferings(CDOffering[] offerings) {
		cdOffering = offerings;
	}

	//getter for a new Account Number
	static long getNextAccountNumber() {
		return nextAccountNumber++;
	}

	//returns the total balance of the whole account holder array
	static double totalBalances() {
		for(AccountHolder x : accountHolderArray) {
			totalValue += x.getCombinedBalance();
		}
		return totalValue;	
	}

	//returns the future value of what the user wants based off of parameters
	static double futureValue(double presentValue, double interestRate, int term) {
		return (presentValue * (Math.pow((1 + interestRate), term)));
	}
	
	
	
}
