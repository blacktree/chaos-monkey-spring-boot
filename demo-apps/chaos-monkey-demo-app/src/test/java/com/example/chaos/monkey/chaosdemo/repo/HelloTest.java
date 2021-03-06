package com.example.chaos.monkey.chaosdemo.repo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Benjamin Wilms
 */
public class HelloTest {

    @Test
    public void checkConstructorGetter() {
        String expectedValueMessage = "test";
        long id = 0;
        Hello helloToTest = new Hello(id, expectedValueMessage);

        assertThat(helloToTest.getMessage(), is(expectedValueMessage));
        assertThat(helloToTest.getId(), is(id));
    }

    @Test
    public void checkSetterGetter() {
        String expectedValueMessage = "test";
        long id = 0;
        Hello helloToTest = new Hello(99, "empty");
        helloToTest.setId(id);
        helloToTest.setMessage(expectedValueMessage);

        assertThat(helloToTest.getMessage(), is(expectedValueMessage));
        assertThat(helloToTest.getId(), is(id));
    }
}