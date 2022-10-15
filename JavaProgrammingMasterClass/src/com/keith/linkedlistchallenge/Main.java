package com.keith.linkedlistchallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	// Create a program that implements a playlist for songs
	// Create a Song class having Title and Duration for a song.
	// The program will have an Album class containing a list of songs.
	// The albums will be stored in an ArrayList.
	// Songs from different albums can be added to the playlist and will appear in the list in the other
	// they are added.
	// Once the songs have been added to the playlist, create a menu of options to:-
	// Quit, skip forward to the next song, skip backwards to a previous song. Replay the current song.
	// List the songs in the playlist.
	// A song must exist in an album before it can be added to the playlist (so you can only play songs that you own).
	// Hint: To replay a song, consider what happened when we went back and forth from a city before we
	// started tracking the direction we were going.
	// As an optional extra, provide an option to remove the current song from the playlist.
	// ( hint: listIterator.remove() )
	
	
	public static void main(String[] args) {
		
		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love Don't Mean A Thing", 4.22);
		album.addSong("Holy Man", 4.3);
		album.addSong("Hold On", 5.6);
		album.addSong("Lady Double Dealer", 3.21);
		album.addSong("You Can't Do It Right", 6.23);
		album.addSong("High Ball Shooter", 4.27);
		album.addSong("The Gypsy", 4.2);
		album.addSong("Soldier of Fortune", 3.13);
		albums.add(album);
		
		album = new Album("For Those About To Rock", "AC/DC");
		album.addSong("For Those About To Rock", 5.44);
		album.addSong("I Put The Finger On You", 3.25);
		album.addSong("Let's Go", 3.45);
		album.addSong("Inject The Venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil Walks", 3.45);
		album.addSong("C.O.D.", 5.25);
		album.addSong("Breaking The Rules", 5.32);
		album.addSong("Night Of The Long Knives", 5.12);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("You Can't Do It Right", playList);
		albums.get(0).addToPlayList("Holy Man", playList);
		albums.get(0).addToPlayList("Speed King", playList); // Does not exist.
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(8, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(24, playList); // There is no track 24.

		play(playList);
	}
	
	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
				case 0:
					System.out.println("Playlist complete.");
					quit = true;
					break;
				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the playlist.");
						forward = false;
					}
					break;
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("We are at the start of the playlist");
						forward = true;
					}
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now replaying " + listIterator.previous().toString());
							forward = false;
						} else {
							System.out.println("We are at the start of the list.");
						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						} else {
							System.out.println("We have reached the end of the list.");
						}
					}
					break;
				case 4:
					printList(playList);
					break;
				case 5:
					printMenu();
					break;
				case 6:
					if(playList.size() > 0) {
						listIterator.remove();
						if(listIterator.hasNext()) {
							System.out.println("Now playing " + listIterator.next());
						} else if(listIterator.hasPrevious()) {
							System.out.println("Now playing " + listIterator.previous());
						}
					}
					break;
 			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" + 
				 "1 - to play next song\n" +
				 "2 - to play previous song\n" +
				 "3 - to replay the current song\n" +
				 "4 - list songs in the playlist\n" +
				 "5 - print available actions\n" +
				 "6 - delete current song from playlist");
	}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("===============================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===============================");
	}

}
