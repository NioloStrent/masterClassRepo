package com.keith.fixtures;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.keith.external.Server;

public class Ex9 {

    Server server;

    @Before

    public void beforeEachTest(){
        System.out.println("I run before each test is run");
        server = new Server("192.168.56.101");
        server.start();
    }



    @Test
    public void test1() {
        assertTrue(server.isRunning());
        System.out.println("Executed test1");
    }


    @Test
    public void test2() {
        assertThat(server.getIP(),is("192.168.56.101"));
        System.out.println("Executed test2");
    }




    @After
    public void AfterEachTest(){

        System.out.println("I run after each test is run");
        server.stop();

    }


}
