package com.capgemini.lab4.excercise3.service;



public class Item {

	private int idNum;
	private String title;
	private int Copies;
	
	public Item(int idNum, String title, int Copies){
		this.idNum = idNum;
		this.title = title;
		this.Copies = Copies;
	}
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumCopies() {
		return Copies;
	}
	public void setNumCopies(int numCopies) {
		this.Copies = numCopies;
	}
	public void checkIn() {
		Copies = Copies + 1;
	}
	
	public void checkOut() {
		Copies =Copies - 1;
	}
	
	@Override
	public String toString(){
		return "ID:" + idNum + " Title:" + title + " Number of Copies:" +Copies;
	}
	
	public void print() {
		System.out.println("ID:" + idNum);
		System.out.println("Title:" + title);
		System.out.println("Number of copies:" + Copies);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		
		Item other = (Item) obj;
		return idNum == other.idNum && 
			   title == other.title && 
			   Copies == other.Copies;
	}
	
	public void addItem(int idNum, String str, int n) {
		setIdNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

}
