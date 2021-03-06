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
	//storing the data we got from reading the file into the cd offering
	public static CDOffering readFromString(String cdOfferingDataString) {
	   	String[] holding = cdOfferingDataString.split(",");
    	int term = Integer.parseInt(holding[0]);
    	double interestRate = Double.parseDouble(holding[1]);
    	return new CDOffering(term, interestRate);
    }
	// writing the data we have stored in cd offering to a string and sending it to txt file
	    public String writeToString() {
	    	StringBuilder cdOfferingData = new StringBuilder();
	    	cdOfferingData.append(term).append(",");
	    	cdOfferingData.append(interestRate);
	    	return cdOfferingData.toString(); 
	    }
}