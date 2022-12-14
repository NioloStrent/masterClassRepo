package com.keith.linkedlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songList;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songList = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			this.songList.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (Song checkedSong : this.songList) {
			if (checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber -1;
		if ((index >= 0) && (index <= this.songList.size())) {
			playList.add(this.songList.get(index));
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album.");
		return false;
	}
}
