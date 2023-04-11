package org.jdbootcamp.homework.homework04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {

	private List<User> users = new ArrayList<User>();

	public UserManager() {}

	public void add(User user) {
		
		if (user.getName() == null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n\t=========== YENİ KULLANICI ============\n");
			System.out.print("\tAdınız: ");
			user.setName(scanner.nextLine());

			System.out.print("\tSoyadınız: ");
			user.setSurname(scanner.nextLine());

			System.out.print("\tŞifre: ");
			user.setPassword(scanner.nextLine());
			
			System.out.println("\t=======================================");
			
		}
		users.add(user);
	}

	public void getUser() {
		int index = 0;
		System.out.println("\n\t============ KULLANICILAR =============\n");
		for (User user : users) {
			System.out.println("\t" + ++index + ". " + user.getName() + " " + user.getSurname());
		}
		System.out.println("\t=======================================");
		//System.out.println("\t_______________________________________");
	}

}
