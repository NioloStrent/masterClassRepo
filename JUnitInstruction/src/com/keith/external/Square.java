package com.keith.external;
public class Square extends Rectangle {

    public Square(double side){

        super(side,side);
    }

    @Override
    public String whoAmI(){

        return "I am a Square";
    }

}
