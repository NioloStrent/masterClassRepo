package com.keith.testname;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Ex20 {



    @Rule
    public TestName name = new TestName();


    @Test

    public void test1(){


        System.out.println("Executed "+name.getMethodName());

    }


    @Test

    public void test2(){


        System.out.println("Executed " + name.getMethodName());

    }

}