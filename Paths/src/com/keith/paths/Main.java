package com.keith.paths;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
	
	// https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html
	// https://docs.oracle.com/javase/8/docs/api/java/nio/file/attribute/BasicFileAttributes.html

	public static void main(String[] args) {
		try {
			
//			Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//			Files.createFile(fileToCreate);
//			Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//			Files.createDirectory(dirToCreate);
//			Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
			
//			Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//			Files.createDirectories(dirToCreate);
			
			Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
			long size = Files.size(filePath);
			System.out.println("Size = " + size);
			System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));
			
			BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("Size = " + attrs.size());
			System.out.println("Last modified = " + attrs.lastModifiedTime());
			System.out.println("Created = " + attrs.creationTime());
			System.out.println("Is directory = " + attrs.isDirectory());
			System.out.println("Is regular file = " + attrs.isRegularFile());
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
//		Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
//		printFile(filePath);
//		
//		filePath = Paths.get(".");
//		System.out.println(filePath.toAbsolutePath());
//		
//		Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//		System.out.println(path3.toAbsolutePath());
//		
//		Path path4 = Paths.get("/Volumes/Test/ING", "abcdef", "whatever.txt");
//		System.out.println(path4.toAbsolutePath());
//		
//		filePath = FileSystems.getDefault().getPath("files");
//		System.out.println("Exists = " + Files.exists(filePath));
//		
//		System.out.println("Exists = " + Files.exists(path4));

	}

//	private static void printFile(Path path) {
//		try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//			String line;
//			while((line = fileReader.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch(IOException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
}
