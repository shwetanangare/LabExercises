package com.capgemini.lab4.Exercise1;

public class CurrentAccount extends Account {

	private double overdraftLimit;
	
	public CurrentAccount(String name, float age, long accNum, double balance,double overdraftLimit) {
		super(name, age, accNum, balance);
		this.overdraftLimit=overdraftLimit;
	}

	@Override
	public String toString() {
		
		return super.toString()+" CurrentAccount [overdraftLimit=" + overdraftLimit + "]";
	}



	@Override
	public void withdraw(double bal) {
		
		double overBalance=super.getBalance()+this.overdraftLimit;
		
		if((overBalance - bal)<0)
		{
			System.out.println("Overdraft limit reached");
		}
		else
		{
			if(super.getBalance()<bal)
			{
				super.setBalance(0);
				this.overdraftLimit = overBalance-bal;
			}
			else
			{
				super.setBalance(super.getBalance()-bal);
			}
		}
		
	}
}
