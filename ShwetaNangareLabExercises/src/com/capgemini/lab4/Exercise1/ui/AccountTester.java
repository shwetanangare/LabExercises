package com.capgemini.lab4.Exercise1.ui;

import com.capgemini.lab4.Exercise1.CurrentAccount;

public class AccountTester {

	public static void main(String[] args) 
	{
				
		CurrentAccount curAcc = new CurrentAccount("komal", 22, 789845, 5000,2000);
		System.out.println(curAcc);
		
		curAcc.withdraw(7002);
		System.out.println(curAcc);
		
		
	}

}
