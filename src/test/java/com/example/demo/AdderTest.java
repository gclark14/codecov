package com.example.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gabe.clark on 7/5/17.
 */
public class AdderTest {
    Adder adder = new Adder();

    @Test
    public void add_should_return_sum_given_two_integers(){
        assertThat(adder.add(2,2), is(4));
    }
}