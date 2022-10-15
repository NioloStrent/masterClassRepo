package com.keith.external;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.DoubleSummaryStatistics;

public class IsNotANumber extends TypeSafeMatcher {

    public void describeTo(Description description) {description.appendText("not a number");}

    @Factory public static Matcher notANumber() {return new IsNotANumber();}

    @Override
    protected boolean matchesSafely(Object o) {

        Double number = (Double) o;
        return number.isNaN();
    }
}