package com.keith.verifier;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

import com.keith.external.Rectangle;

public class Ex18 {


    double area;


    @Rule
    public Verifier verifier = new Verifier() {
        @Override
        protected void verify() {
            assertEquals(area,12,0);
        }
    };

    @Test
    public void testCondition(){

        Rectangle rectangle = new Rectangle(4,3);

        double area = rectangle.getArea();



    }}
