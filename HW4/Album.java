package org.jdbootcamp.homework.homework04;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private String name;
	private Artist artist;
	private String publishedYear;
	private List<Song> songs = new ArrayList<>();
	private double price;

	public Album() {
	}

	public Album(String name, Artist artist, String publishedYear, double price) {
		super();
		this.name = name;
		this.artist = artist;
		this.price = price;
		this.publishedYear = publishedYear;
		artist.add(this);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}

	public void add(Song song) {
		songs.add(song);
	}

	public void listSongs() {
		int index = 0;

		System.out.println("The songs of \"" + name + "\"");

		for (Song song : songs) {
			System.out.println(++index + ". " + song.getName());
		}
	}

	public void printInfo() {
		System.out.println("\n\t**********************");
		System.out.println("\tName: " + name + " " + "\n\tArtist: " + artist.getName() + "\n\tPublished Year: "
				+ publishedYear + "\n\tprice: " + price);
		System.out.println("\t**********************\n");
	}
}
