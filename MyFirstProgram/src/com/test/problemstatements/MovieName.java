package com.test.problemstatements;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieName {

	ArrayList<Movie> list = new ArrayList<Movie>();

	ArrayList<Movie> getMovieDetailsinfo() {
		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i < 1; i++) {
				System.out.println("enter movie name");
				String movieName = sc.next();
				System.out.println("enter hero name");
				String hero = sc.next();
				System.out.println("enter herione name");
				String heroine = sc.next();
				System.out.println("enter release date");
				int releasedate = sc.nextInt();
				System.out.println("enter ratings");
				int ratings = sc.nextInt();

				Movie obj = new Movie(movieName, hero, heroine, ratings, releasedate);
				list.add(obj);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;

	}

	void displayMovieInformation(Scanner sc) {

		try {

			ArrayList<Movie> obj = getMovieDetailsinfo();

			System.out.println(" enter the movie date to see the ratings");
			int Moviedate = sc.nextInt();

			for (Movie movie : obj) {

				// System.out.println(" enter the movie name to see the ratings" + movie);

				if (movie.getReleasedate() == Moviedate) {

					System.out.println(" movie rating is......." + movie.getRatings()+ "movie hero is....."+ movie.getHero());

				}
				else {
					System.out.println("flop film");
				}
			}
		}

		catch (Exception e) {

			// TODO: handle exception
		}
	}

	public static void main(String[] args) {

		MovieName obj = new MovieName();
		Scanner sc = new Scanner(System.in);
		obj.displayMovieInformation(sc);

	}

}
