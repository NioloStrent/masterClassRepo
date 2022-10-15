package com.keith.timeout;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class Ex22 {

	public static String log;
	
	@Rule
	public TestRule globalTimeout = new Timeout(20);
	
	@Test
	public void test1() throws Exception {
		Thread.sleep(30);
		System.out.println("Finished Test 1");
	}
	
	@Test
	public void test2() throws Exception {
		Thread.sleep(60);
		System.out.println("Finished Test 2");
	}
}
