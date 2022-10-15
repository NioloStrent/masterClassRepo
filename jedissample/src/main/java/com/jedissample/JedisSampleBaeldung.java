package com.jedissample;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.properties.ReadPropertiesFileTest;

import redis.clients.jedis.Jedis;

// This sample is based on link: https://www.baeldung.com/jedis-java-redis-client-library

public class JedisSampleBaeldung 
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
	
	
	public void exampleStrings51()
	{
		String setReturnValue = jedis.set("events/city/rome", "32,15,223,828");
		System.out.println( "setReturnValue:" + setReturnValue );

		String cachedResponse = jedis.get("events/city/rome");
		System.out.println( "cachedResponse:" + cachedResponse );
	}
	

	public void exampleStrings52()
	{
		jedis.lpush("queue#tasks", "firstTask");
		jedis.lpush("queue#tasks", "secondTask");
		jedis.lpush("queue#tasks", "thirdTask");
		jedis.lpush("queue#tasks", "fourthTask");

//		String task = jedis.rpop("queue#tasks");
		List<String> list = jedis.lrange("queue#tasks", 0, -1);
		System.out.println(list);
	}
	
	public void exampleSet53()
	{
		jedis.sadd("nicknames", "nickname#1");
		jedis.sadd("nicknames", "nickname#2");
		jedis.sadd("nicknames", "nickname#3");

		Set<String> nicknames = jedis.smembers("nicknames");
		boolean exists = jedis.sismember("nicknames", "nickname#1");
		if(exists == true) {
			System.out.println(nicknames);
		}
	}
	
	public void exampleHashSet54() 
	{
		jedis.hset("user#1", "name", "Peter");
		jedis.hset("user#1", "job", "politician");
				
		String name = jedis.hget("user#1", "name");
				
		Map<String, String> fields = jedis.hgetAll("user#1");
		String job = fields.get("job");

		System.out.println(jedis.hgetAll("user#1"));
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
		
		JedisSampleBaeldung jedisSample = new JedisSampleBaeldung();
		
		jedisSample.connect( redisIp, redisPort);
		jedisSample.auth(redisPassword); //only needed for redis cloud connection
  		
		jedisSample.exampleStrings51();
//		jedisSample.exampleStrings52();
//		jedisSample.exampleSet53();
//		jedisSample.exampleHashSet54();
		
	}
	
	
	
}
