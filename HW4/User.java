package org.jdbootcamp.homework.homework04;

public class User {
	private String name;
	private String surname;
	private String password;
	private Cart cart;

	public User() {
	}

	public User(String name, String surname, Cart cart) {
		super();
		this.name = name;
		this.surname = surname;
		this.cart = cart;
		cart.setUser(this);
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
