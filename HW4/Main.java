package org.jdbootcamp.homework.homework04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stock stock = new Stock();
		StockManager stockManager = new StockManager(stock);
		UserManager userManagement = new UserManager();
		stockManager.allItems();

		String choice = "";
		Scanner scanner = new Scanner(System.in);

		Cart cart = new Cart();
		User user = new User("Zeynep", "Özdemir", cart);
		userManagement.add(user);

		System.out.println("***** HOŞGELDİNİZ *****\n");

		OUTERLOOP: while (true) {
			//System.out.println("**********************************************************");
			System.out.println("1-Ürünleri İncele\n2-Kullanıcı İşlemleri\n3-Çıkış Yap");
			choice = scanner.next();

			switch (choice) {
			case "2":
				INNERLOOP: while (true) {
					System.out.println("\n1-Yeni Kullanıcı Ekle\n" + "2-Kullanıcıları Listele\n" + "3-Geri");

					String subChoice = scanner.next();
					switch (subChoice) {
					case "1":
						//System.out.println("\tKullanıcı bilgilerinizi giriniz: ");
						User newUser = new User();
						userManagement.add(newUser);
						break;

					case "2":
						//System.out.println("Kullanıcılar listeleniyor...");
						userManagement.getUser();
						break;

					case "3":
						break INNERLOOP;

					default:
						System.out.println("Yanlış seçim yaptınız...");
						break;
					}
				}

				break;
			case "1":
				INNERLOOP2: while (true) {
					System.out.println("\n1-Arama Yap\n" + "2-Tüm Ürünleri Listele\n"
							+ "3-Sepetimdeki Ürünleri Göster\n" + "4-Alışverişi Tamamla\n" + "5-Geri");

					String subChoice = scanner.next();
					switch (subChoice) {
					case "1":
						while (true) {
							System.out.println("\nKategori Seçiniz: \nAlbüm\nŞarkı");
							String category = scanner.next();

							if (category.charAt(0) == 'A' || category.charAt(0) == 'a') {
								System.out.print("\tAramak İstediğiniz Ürün: ");
								String product = scanner.next();

								for (Album album : stock.getAlbums()) {
									product.toLowerCase();
									String albm = album.getName().toLowerCase();
									if (albm.contains(product)) {
										album.printInfo();

										System.out.println("\t1-Sepete Ekle\t\t2-Geri");
										String lastChoice = scanner.next();
										if (lastChoice.equals("1")) {
											cart.add(album);
											break;
										} else if (lastChoice.equals("2")) {
											continue INNERLOOP2;
										} else {
											System.out.println("Önceki Sayfaya Yönlendiriliyosunuz...");
											continue INNERLOOP2;
										}
									}
								}
							}

							else if (category.charAt(0) == 'S' || category.charAt(0) == 's' || category.charAt(0) == 'Ş' || category.charAt(0) == 'ş') {
								System.out.print("\tAramak İstediğiniz Ürün: ");
								String product = scanner.next();
				
								product.toLowerCase();
								for (Song song : stock.getSongs()) {
									String sng = song.getName().toLowerCase();
									if (sng.contains(product)) {
										song.printInfo();

										System.out.println("\t1-Sepete Ekle\t\t2-Geri");
										String lastChoice = scanner.next();
										if (lastChoice.equals("1")) {
											cart.add(song);
											break;
										} else if (lastChoice.equals("2")) {
											continue INNERLOOP2;
										} else {
											System.out.println("Önceki Sayfaya Yönlendiriliyosunuz...");
											continue INNERLOOP2;
										}
									}
								}
							}

							else {
								System.out.println("Sonuç Bulunamadı");
								System.out.println("Önceki Sayfaya Yönlendiriliyosunuz...");
								continue INNERLOOP2;
							}
						}
					case "2":
						stockManager.listStock();
						break;

					case "3":
						cart.listItems();/*
						System.out.println("1-Sepetten Çıkar\t\t\t2-Geri");
						String lastChoice = scanner.next();

						if (lastChoice.equals("1")) {
							System.out.println("1-Bir ürün çıkar\t\t\t2-Tümünü Çıkar\t\t\tGeri");
							String lastChoice2 = scanner.next();
							switch (lastChoice2) {
							case "1":
								System.out.println("Hangi ürün: ");
								int index = scanner.nextInt();
								cart.RemoveItem(index - 1);

							case "2":
								cart.RemoveAll();
								System.out.println("İşlem tamamlandı.");
							}
						}*/

						break;

					case "4":
						System.out.println("Siparişiniz tamamlanmıştır...\nİyi Günler Dileriz");
						break OUTERLOOP;

					case "5":
						break INNERLOOP2;

					default:
						System.out.println("Yanlış seçim yaptınız...");
						break;
					}
				}

				break;
			case "3":
				System.out.println("\n**** İyi Günler Dileriz ****");
				break OUTERLOOP;
			}
		}
	}

}