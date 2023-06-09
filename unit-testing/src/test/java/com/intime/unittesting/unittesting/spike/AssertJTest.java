package com.intime.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


//to write readable tests
public class AssertJTest {

    @Test
    public void learning(){
        List<Integer> numbers = Arrays.asList(12,15,45);

        assertThat(numbers).hasSize(3).contains(12,15)
        .allMatch(x -> x>10).allMatch(x -> x<100).noneMatch(x->x<0);
        


        assertThat("").isEmpty();

        assertThat("ABCDE").contains("BCD").startsWith("AB").endsWith("CDE");

        // assertThat(numbers,hasItems(12,45));
        // assertThat(numbers,everyItem(greaterThan(10)));
        // assertThat(numbers,everyItem(lessThan(100)));

        // assertThat("",isEmptyString());
        // assertThat("ABCD",containsString("BC"));
        // assertThat("ABCD",startsWith("ABC"));
    }


    
    
}
