package org.jdbootcamp.homework.homework04;

public class StockManager {
	private Stock stock = new Stock();

	public StockManager() {
	}

	public StockManager(Stock stock) {
		this.stock = stock;
	}

	public void updateStock(Album album) {
		stock.setAlbums(album);
	}

	public void updateStock(Song song) {
		stock.setSongs(song);
	}

	public void listStock() {

		System.out.println("\n\t=======================================");

		int index = 0;
		if (!stock.getAlbums().isEmpty()) {
			System.out.println("\t...Albümler...\n");
			for (Album album : stock.getAlbums()) {
				System.out.println("\t" + ++index + ". " + album.getName());
			}
		}

		index = 0;
		if (!stock.getSongs().isEmpty()) {
			System.out.println("\n\t...Şarkılar...\n");
			for (Song song : stock.getSongs()) {
				System.out.println("\t" + ++index + ". " + song.getName());
			}
		}
		System.out.println("\t=======================================");
	}

	public void allItems() {
		Artist artist1 = new Artist("The Weeknd");
		Artist artist2 = new Artist("Şebnem Ferah");
		Artist artist3 = new Artist("Adamlar");

		Album album1 = new Album("The Weeknd Dawn Fm", artist1, "2022", 50);
		Album album2 = new Album("OD", artist2, "2013", 32);
		Album album3 = new Album("Eski Dostum Tankla Gelmiş", artist3, "2014", 41);
		Album album4 = new Album("Rüyalarda Buruşmuşuz", artist3, "2016", 37);

		updateStock(album1);
		updateStock(album2);
		updateStock(album3);
		updateStock(album4);

		Song song1 = new Song("Dawn FM", artist1, album1, "1:36", 2);
		Song song2 = new Song("Gasoline", artist1, album1, "3:32", 2.5);
		Song song3 = new Song("How Do I Make You Love Me?", artist1, album1, "3:34", 3);
		Song song4 = new Song("Take My Breath", artist1, album1, "3:45", 1.5);
		Song song5 = new Song("Sacrifice", artist1, album1, "3:09", 2);
		Song song6 = new Song("Is There Someone Else?", artist1, album1, "2:44", 1.8);
		Song song7 = new Song("Best Friends", artist1, album1, "3:20", 1.4);

		updateStock(song1);
		updateStock(song2);
		updateStock(song3);
		updateStock(song4);
		updateStock(song5);
		updateStock(song6);
		updateStock(song7);

		Song songA1 = new Song("Kapısı Kapalı", artist3, album3, "4:46", 2.3);
		Song songA2 = new Song("Bi Öyle Bi Böyle", artist3, album3, "3:53", 1.9);
		Song songA3 = new Song("Koca Yaşlı Şişko Dünya", artist3, album3, "3:54", 4.1);
		Song songA4 = new Song("İnsanın Düştüğü Durumlar", artist3, album3, "4:44", 2);
		Song songA5 = new Song("Utanmazsan Unutmam", artist3, album3, "4:07", 2.1);

		updateStock(songA1);
		updateStock(songA2);
		updateStock(songA3);
		updateStock(songA4);
		updateStock(songA5);
	}
}
