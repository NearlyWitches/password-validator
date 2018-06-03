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
    public void tooShort(){
        assertEquals("Password has to be 8-16 characters.", v.testPassword("pass1@"));
    }

    @Test
    public void tooLong(){
        assertEquals("Password has to be 8-16 characters.", v.testPassword("passWord1@passWord1@passWord1@"));
    }

    @Test
    public void allUpper(){
        assertEquals("Not Strong!", v.testPassword("PASSWORD1@"));
    }

    @Test
    public void allLower(){
        assertEquals("Not Strong!", v.testPassword("password1@"));
    }

    @Test
    public void noNumber(){
        assertEquals("Not Strong!", v.testPassword("passWord@"));
    }

    @Test
    public void noSpecial(){
        assertEquals("Not Strong!", v.testPassword("passWord1"));
    }

    @Test
    public void allRight(){
        assertEquals("Good!", v.testPassword("PassWord1@"));
    }
}