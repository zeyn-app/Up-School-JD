package org.jdbootcamp.homework.homework04;

import java.util.ArrayList;
import java.util.List;

public class Artist {
	private String name;
	private List<Album> albums = new ArrayList<>();
	private List<Song> songs = new ArrayList<>();

	public Artist() {
	}

	public Artist(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void listAlbums() {
		System.out.println("The albums of \"" + name + "\"");

		for (Album album : albums) {
			album.printInfo();
		}
	}

	public void add(Album album) {
		albums.add(album);
	}

	public void listSongs() {
		System.out.println("The songs of \"" + name + "\"");
		for (Song song : songs) {
			song.printInfo();
		}
	}

	public void add(Song song) {
		songs.add(song);
	}
}
