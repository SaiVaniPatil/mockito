package com.intime.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;


import java.util.Arrays;
import java.util.List;


//to write readable tests
public class HamcrestMatchersTest {

    @Test
    public void learning(){
        List<Integer> numbers = Arrays.asList(12,15,45);

        assertThat(numbers,hasSize(3));
        assertThat(numbers,hasItems(12,45));
        assertThat(numbers,everyItem(greaterThan(10)));
        assertThat(numbers,everyItem(lessThan(100)));

        assertThat("",isEmptyString());
        assertThat("ABCD",containsString("BC"));
        assertThat("ABCD",startsWith("ABC"));
    }
    
}
