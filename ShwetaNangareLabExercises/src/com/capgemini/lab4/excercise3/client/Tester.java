package com.capgemini.lab4.excercise3.client;

import com.capgemini.lab4.excercise3.service.Cd;

public class Tester {

	public static void main(String[] args) {
		
	
		Cd cd = new Cd(101, "JK", 1, 9, "ABC", "Comedy");
		cd.print();
		cd.checkOut();
		cd.print();
		
	}

}
