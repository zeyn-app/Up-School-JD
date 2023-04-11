package org.jdbootcamp.homework.homework04;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Album> albums = new ArrayList<>(); 
	private List<Song> songs = new ArrayList<>();
	

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(Album album) {
		albums.add(album);
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(Song song) {
		songs.add(song);
	}
}
