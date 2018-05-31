package com.example.password_validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    private Validator v;
    @Before
    public void beforeEachTest(){
        v = new Validator();
    }

    @After
    public void afterEachTest(){}

    @Test
    public void allUpper(){
        assertFalse(v.testPassword("PASSWORD"));
    }

    @Test
    public void allLower(){
        assertFalse(v.testPassword("password"));
    }

    @Test
    public void tooShort(){
        assertFalse(v.testPassword("pass"));
    }

    @Test
    public void allRight(){
        assertTrue(v.testPassword("PassWords"));
    }
}