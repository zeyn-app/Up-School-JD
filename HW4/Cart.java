package org.jdbootcamp.homework.homework04;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private User user;
	private double totalPrice = 0.0d;
	private List<Song> songs = new ArrayList<>();
	private List<Album> albums = new ArrayList<>();

	public Cart() {
	}

	public Cart(User user) {
		this.user = user;
		user.setCart(this);
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void add(Song song) {
		songs.add(song);
		totalPrice += song.getPrice();
	}

	public void add(Album album) {
		albums.add(album);
		totalPrice += album.getPrice();
	}

	public void listItems() {
		int index = 0;
		System.out.println("\n\t=============== SEPETİM ===============\n");
		if (!albums.isEmpty()) {
			for (Album album : albums) {
				System.out.println("\t" + ++index + ". " + album.getName());
			}
		}
		if (!songs.isEmpty()) {
			for (Song song : songs) {
				System.out.println("\t" + ++index + ". " + song.getName());
			}
		}

		System.out.println("\n\tToplam tutar: " + totalPrice);
		System.out.println("\t=======================================");
	}

	/*
	public void RemoveItem(int i) {
		if(i<0) return;
		
		if(albums.size()<i) albums.remove(i);
		else songs.remove(i);
		
	}

	public void RemoveAll() {
		songs = null;
		albums = null;
		
	}
	*/

}
