package com.keith.errorcollector;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.keith.external.Rectangle;

public class Ex17 {



    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void testCondition(){

        Rectangle rectangle = new Rectangle(4,3);

        double area = rectangle.getArea();

//        assertThat(area, equalTo(10));
//        assertThat(area, equalTo(12));

        collector.checkThat(area,equalTo(10));
        collector.checkThat(area,equalTo(12));

    }


}
