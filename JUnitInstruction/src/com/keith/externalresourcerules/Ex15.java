package com.keith.externalresourcerules;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import com.keith.external.Server;


public class Ex15 {

        Server server;

        @Rule
        public ExternalResource resource = new ExternalResource() {
                @Override
                protected void before() throws Throwable {
                        System.out.println("I run before any test is run");
                        server = new Server("192.168.56.101");
                        server.start();
                };

                @Override
                protected void after() {
                        System.out.println("I run after the test is run");
                        server.stop();
                };
        };




        @Test
        public void test1() {
                assertTrue(server.isRunning());
                System.out.println("Executed test");
        }


}
