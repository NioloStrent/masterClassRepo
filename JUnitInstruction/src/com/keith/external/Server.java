package com.keith.external;

import java.io.IOException;


public class Server {

    boolean isRunning;
    String IP ;

    public boolean isRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Server(String IP){
        setIP(IP);
        setIsRunning(false);
    }

    public void start(){
        setIsRunning(true);
    }

    public void stop(){
        setIsRunning(false);
    }

    public String ping() throws IOException{
        if (this.isRunning){
        return "Hello, I'm up!";}
        else throw new IOException("Sorry, the server is not running ");
    }
}
