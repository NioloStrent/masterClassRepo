package com.keith.inputoutputnio;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import com.keith.inputoutput.Location;

// https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html

public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {
		
		Path locPath = FileSystems.getDefault().getPath("locations_big.txt");
		Path dirPath = FileSystems.getDefault().getPath("directions_big.txt");
		try (BufferedWriter locFile = Files.newBufferedWriter(locPath);
				BufferedWriter dirFile = Files.newBufferedWriter(dirPath)) {
			
			for(Location location: locations.values()) {
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
				for(String direction : location.getExits().keySet()) {
					if(!direction.equalsIgnoreCase("Q")) {
						dirFile.write(location.getLocationID() + "," + direction + " ," + 
							location.getExits().get(direction) + "\n");
					}
				}
			}
			
		} catch(IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

	static {

		try (ObjectInputStream locFile = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("locations.dat")))) {
			boolean eof = false;
			while (!eof) {
				try {
					Location location = (Location) locFile.readObject();
					System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
					System.out.println("Found " + location.getExits().size() + " exits ");

					locations.put(location.getLocationID(), location);
				} catch (EOFException e) {
					eof = true;
				}
			}
		} catch (InvalidClassException e) {
			System.out.println("InvalidClassException " + e.getMessage());
		} catch (IOException io) {
			System.out.println("IO Exception" + io.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException " + e.getMessage());
		}
	}

	@Override
	public void clear() {
		locations.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}

	@Override
	public Location get(Object key) {
		return locations.get(key);
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@Override
	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {

	}

	@Override
	public Location remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public int size() {
		return locations.size();
	}

	@Override
	public Collection<Location> values() {
		return locations.values();
	}
}