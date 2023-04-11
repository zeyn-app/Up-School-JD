package org.jdbootcamp.homework.homework04;

public class Song {

	private String name;
	private Artist artist;
	private Album album;
	private String size;
	private double price;

	public Song() {
	}

	public Song(String name, Artist artist, Album album, String size, double price) {
		super();
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.size = size;
		this.price = price;
		album.add(this);
		artist.add(this);
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public void printInfo() {
		System.out.println("\n\t**********************");
		System.out.println("\tName: " + name + " " + "\n\tArtist: " + artist.getName() + "\n\tSize: " + size + "\n\tAlbum: "
				+ album.getName() + "\n\tPrice: " + price);
		System.out.println("\t**********************\n");
	}

}
