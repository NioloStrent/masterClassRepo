package com.keith.assumptions;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.keith.external.Server;

public class Ex8 {

	Server s;
	
	@Before
	public void startServer() {
		this.s = new Server("192.168.56.101");
		
	}
	
	@Test
	public void runWithServerTest() throws Exception {
		assumeTrue(s.isRunning());
		s.ping();
	}
}
