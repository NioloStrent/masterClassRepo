package com.keith.testsubsets;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.keith.assertions.Ex3;
import com.keith.assertthat.Ex4;
import com.keith.external.Subset;
import com.keith.testwriting.Ex1;
import com.keith.testmethod.Ex2;

@RunWith(Categories.class)
@Categories.IncludeCategory(Subset.class)
//@Categories.ExcludeCategory(Subset.class)
@Suite.SuiteClasses({
        Ex1.class,
        Ex2.class,
        Ex3.class,
        Ex4.class,
})


public class Ex13 {

}
