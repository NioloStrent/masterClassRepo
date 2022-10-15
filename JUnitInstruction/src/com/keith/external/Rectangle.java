package com.keith.external;

import java.util.Date;
import java.util.List;

import java.util.ArrayList;

/**
 * Created by swethakolalapudi on 11/28/16.
 */
public class Rectangle {

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    double length;
    double breadth;

    public Rectangle(double length,double breadth){

         setLength(length);
         setBreadth(breadth);
     }


    public double getArea(){
        return  this.length * this.breadth;
    }

    public Double[] getDimensions(){

        Double[] dimensions = new Double[2];
        dimensions[0] = this.length;
        dimensions[1] = this.breadth;
        return dimensions;
    }

    public Double getAspectRatio(){

        if (this.breadth==0.0){
            return Double.NaN;
        }
        else {
        return this.length/this.breadth;}
    }



    public String whoAmI(){

        return "I am a Rectangle";
    }

}
