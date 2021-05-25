package com.test.problemstatements;

public class Movie {
	
	String movieName;
	String hero;
	String heroine;
	double ratings;
	int releasedate;
	public Movie(String movieName, String hero, String heroine, double ratings, int releasedate) {
		this.movieName = movieName;
		this.hero = hero;
		this.heroine = heroine;
		this.ratings = ratings;
		this.releasedate = releasedate;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public int getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(int releasedate) {
		this.releasedate = releasedate;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", hero=" + hero + ", heroine=" + heroine + ", ratings=" + ratings
				+ ", releasedate=" + releasedate + "]";
	}
	
	
	

}
