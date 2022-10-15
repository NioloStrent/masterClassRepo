package com.keith.expectedexception;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.keith.external.Server;

public class Ex21 {




    @Rule
    public ExpectedException thrown = ExpectedException.none();




    @Test
    public void pingServer() throws Exception{
        Server s = new Server("192.168.156.101");
        thrown.expect(IOException.class);
        s.ping();
    }



}
