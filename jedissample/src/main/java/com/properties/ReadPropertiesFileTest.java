package com.properties;

import java.io.*;
import java.util.*;


public class ReadPropertiesFileTest {
	public static void main(String args[]) throws IOException {
		ReadPropertiesFileTest readPropertiesFileTest = new ReadPropertiesFileTest();
		Properties prop = readPropertiesFileTest.readPropertiesFile("credentials.properties");
		System.out.println("redisip: "+ prop.getProperty("redisip"));
		System.out.println("redispassword: "+ prop.getProperty("redispassword"));
		System.out.println("redisport: "+ prop.getProperty("redisport"));
	}
	public  Properties readPropertiesFile(String fileName)  {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	
		return prop;
	}
}
