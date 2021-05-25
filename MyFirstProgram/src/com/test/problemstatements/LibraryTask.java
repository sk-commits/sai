package com.test.problemstatements;

public class LibraryTask {
	
	int yearOfPublished;
	double price;
	int racknumber;
	String author;
	
	
	
	public int getYearOfPublished() {
		return yearOfPublished;
	}
	public LibraryTask(int yearOfPublished, double price, int racknumber, String author) {
		super();
		this.yearOfPublished = yearOfPublished;
		this.price = price;
		this.racknumber = racknumber;
		this.author = author;
	}
	public void setYearOfPublished(int yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRacknumber() {
		return racknumber;
	}
	public void setRacknumber(int racknumber) {
		this.racknumber = racknumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "LibraryTask [yearOfPublished=" + yearOfPublished + ", price=" + price + ", racknumber=" + racknumber
				+ ", author=" + author + "]";
	}
	
	
	

}
