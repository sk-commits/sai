package com.test.problemstatements;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTitle {
	
	ArrayList<LibraryTask> list = new ArrayList<LibraryTask>();

	ArrayList<LibraryTask> getBookinformation() {
		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i < 1; i++) {
				System.out.println(" .............year published .............");
				int year = sc.nextInt();
				System.out.println(" .............book price is .............");
				double price = sc.nextDouble();
				System.out.println(" .............rack number is .............");
				int racknumb = sc.nextInt();
				System.out.println(" .............author name is .............");
				String authorname = sc.next();

				LibraryTask librarytask = new LibraryTask(year, price, racknumb, authorname);
				list.add(librarytask);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;

	}

	void trackbooktitle(Scanner sc) {

		try {

			ArrayList<LibraryTask> bookdetails = getBookinformation();
			
			System.out.println("enter author name and get book information");
			String author = sc.next();
			
			for (LibraryTask libraryTask : bookdetails) {
				
				if (libraryTask.getAuthor().equalsIgnoreCase(author)) {
					
					//System.out.println("Authorname......."+libraryTask.getAuthor()+"Price....."+libraryTask.getPrice() );
					System.out.println(libraryTask);
					
				}
				
				//System.out.println(" All Book details...."+libraryTask);
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public static void main(String[] args) {
		
		BookTitle obj = new BookTitle();
		Scanner sc = new Scanner(System.in);
		obj.trackbooktitle(sc);
		//obj.getBookinformation();

	}

}
