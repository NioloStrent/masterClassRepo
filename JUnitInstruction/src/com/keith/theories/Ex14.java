package com.keith.theories;

import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.keith.external.Rectangle;
import com.keith.external.Square;

@RunWith(Theories.class)
public class Ex14 {
        @DataPoint
        public static Rectangle RECTANGLE = new Rectangle(4,3);
        @DataPoint
        public static Rectangle SQUARE = new Square(4);

        @Theory
        public void testArea(Rectangle rectangle) {

                System.out.println(rectangle.whoAmI());

                assertEquals(rectangle.getLength(), 4, 0);


        }
}
