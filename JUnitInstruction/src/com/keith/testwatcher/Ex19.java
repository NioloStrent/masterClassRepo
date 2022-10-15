package com.keith.testwatcher;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeThat;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class Ex19 {
    private static String watchedLog;

    @Rule
    public TestRule watchman = new TestWatcher() {


        @Override
        protected void succeeded(Description description) {
            watchedLog += description.getDisplayName() + " " + "success!\n";
        }

        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog += description.getDisplayName() + " failed"+ "\n";
        }
        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            watchedLog += description.getDisplayName() + "skipped"+"\n";
        }

    };

    @Test
    public void fails() {
        fail();
    }

    @Test
    public void skips() {
        assumeThat("a", is("b"));
    }

    @Test
    public void succeeds() {
    }



    @After
    public void afterTest(){
        System.out.println(watchedLog);
    }
}