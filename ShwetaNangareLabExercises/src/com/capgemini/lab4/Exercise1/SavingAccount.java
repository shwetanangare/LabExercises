package com.capgemini.lab4.Exercise1;

public class SavingAccount extends Account {
	
	public SavingAccount(String name, float age, long accNum, double balance) {
		super(name, age, accNum, balance);
		// TODO Auto-generated constructor stub
	}

	private final double minBalance=1000;

	@Override
	public void withdraw(double bal) {
		
		if((super.getBalance()-bal)<this.minBalance)
			System.out.println("Sorry !! Minimun balance should be INR 1000");
		else
			super.setBalance(super.getBalance()-bal);
	}
	
	
	
}
