package com.keith.parameterizedtests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Suite;

import java.util.Arrays;
import java.util.Collection;

import com.keith.external.Rectangle;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class Ex12 {


        @Parameters
        public static Collection<Object[]> data() {
                return Arrays.asList(new Object[][]{
                        {4,0, Double.NaN}, {1, 1, 1}, {2, 1, 2}
                });
        }

        private double lengthInput;

        private double breadthInput;

        private double expectedRatio;

        public Ex12(double lengthInput, double breadthInput,double expectedRatio) {
                this.lengthInput = lengthInput;
                this.breadthInput = breadthInput;
                this.expectedRatio = expectedRatio;
        }


        @Test
        public void testAspectRatio(){

                Rectangle rectangle = new Rectangle(lengthInput,breadthInput);

                System.out.println("Length:"+ lengthInput);
                System.out.println("Breadth:"+ breadthInput);
                System.out.println("Expected Ratio:"+ expectedRatio);

                assertEquals(rectangle.getAspectRatio(), expectedRatio, 0);
        }

    
}
