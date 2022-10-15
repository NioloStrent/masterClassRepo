package com.keith.classrule;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.keith.external.Server;
import com.keith.testmethod.Ex2;
import com.keith.testwriting.Ex1;

@RunWith(Suite.class)
@Suite.SuiteClasses({Ex1.class, Ex2.class})
public class Ex23 {
	
	public static Server myServer = new Server("192.168.1.1.");
	
	@ClassRule
	public static ExternalResource resource = new ExternalResource() {
		@Override
		protected void before() throws Throwable {
			myServer.start();
		}
		
		@Override
		protected void after( ) {myServer.stop();}
	};
}
