package com.example.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gabe.clark on 7/6/17.
 */
public class SubtractorTest {
    Subtractor subtractor = new Subtractor();

    @Test
    public void subtract_should_return_difference_given_two_integers(){
        assertThat(subtractor.subtract(2,2), is(0));
    }
}