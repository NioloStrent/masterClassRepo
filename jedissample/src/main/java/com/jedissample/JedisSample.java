package com.jedissample;


import redis.clients.jedis.Jedis;

import java.util.Properties;
import java.util.Set;

import com.properties.ReadPropertiesFileTest;


public class JedisSample 
{
	private Jedis jedis;
	private String redisIP=null;
	private int redisPort=0;
		
	
	// this sets up the connection to the Redis server
	public void connect(String redisIP, int redisPort)
	{
		this.redisIP = redisIP;
		this.redisPort = redisPort;
		
		jedis = new Jedis(redisIP, redisPort);
	}
	
	public Jedis getJedis()
	{
		return( jedis );
	}
	
	public void close()
	{
		jedis.close();
		System.out.println(  "closed jedis connection:" );

	}
	
	// for cloud based redis server this must be done after connecting
	public String auth(String password)
	{
		String retValue = jedis.auth(password);
		System.out.println(  "authenticating retValue:" + retValue);

		return( retValue );
	}
	
	// create data with key=keyPrefix+curCount data=dataPrefix+curCount
	public void createDataWithPrefix( String keyPrefix, String dataPrefix, int entriesToAdd)
	{
		System.out.println(  "creating " + entriesToAdd + " entries ...");
		for ( int i=0; i<entriesToAdd; i++)
		{
			jedis.set( keyPrefix + i, dataPrefix + i);
		} 
		System.out.println(  "creating " + entriesToAdd + " entries DONE");
	}
	
	// get data with key=keyPrefix+curCount where curCount equals to 0 to itemsToGet
	public void displayDataWithPrefix( String keyPrefix, int itemsToGet )
	{
		System.out.println(  "getting " + itemsToGet + " entries ...");
		for ( int i=0; i<itemsToGet; i++)
		{
			String key = keyPrefix + i;
			System.out.println( "read key:[" + key + "] value:" +  jedis.get(key) );
		} 
		System.out.println(  "getting " + itemsToGet + " entries DONE");
	}
	
	// get all keys which match specified prefix
	public Set<String> getKeysWhichMatchPrefix( String keyPrefix )
	{
		System.out.println( "getting keys with keyPrefix:" + keyPrefix + " ...");
		Set<String> keySet = jedis.keys( keyPrefix + "*" );
		System.out.println( "getting keys with keyPrefix:" + keyPrefix + "DONE " + "count:" + keySet.size() + " keys:" + keySet );
		
		return( keySet );
	}
	
	public void delete( Set<String> itemsToDelete)
	{
		System.out.println( "deleting data keys:" + itemsToDelete + "..."  );
		for ( String curKey : itemsToDelete)
		{
			jedis.del(curKey);
		} 
		System.out.println( "deleting data DONE"  );

	}

	
	public static void main( String[] args ) 
	{
		ReadPropertiesFileTest readPropertiesFileTest = new ReadPropertiesFileTest();
		Properties prop = readPropertiesFileTest.readPropertiesFile("credentials.properties");
//		System.out.println("redisip: "+ prop.getProperty("redisip"));
//		System.out.println("redispassword: "+ prop.getProperty("redispassword"));
//		System.out.println("redisport: "+ prop.getProperty("redisport"));
		
		String redisIp = prop.getProperty("redisip");
		int redisPort = Integer.parseInt( prop.getProperty("redisport") );
		String redisPassword = prop.getProperty("redispassword");
		
		JedisSample jedisSample = new JedisSample();
		
		jedisSample.connect( redisIp, redisPort);
		jedisSample.auth(redisPassword); //only needed for redis cloud connection
  		
	    String keyPrefix = "dog:";	
	    String dataPrefix = "cookie:";		
	    int itemsToCreate=100;
	    
	    // create the data
	    jedisSample.createDataWithPrefix(keyPrefix, dataPrefix, itemsToCreate);
	    
	    // display the data with "get"
	    jedisSample.displayDataWithPrefix(keyPrefix, itemsToCreate);
	    
	    // get keys which match the prefix specified
	    Set<String> keySet = jedisSample.getKeysWhichMatchPrefix(keyPrefix);
	    
	    // delete keys from the previous command
	    jedisSample.delete(keySet);
	    
	    // get keys which match the prefix specified, should be empty
	    keySet = jedisSample.getKeysWhichMatchPrefix(keyPrefix);
		
	    //close the jedis connection
		jedisSample.close();
		

		
		
		
	}
	
	
	
}
