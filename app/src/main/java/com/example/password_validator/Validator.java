package com.example.password_validator;

import java.util.regex.Pattern;

public class Validator {
    public boolean testPassword(String s){
        String upperCase = ".*[A-Z].*";
        String lowerCase = ".*[a-z].*";


        if (s.length() < 8){
            return false;
        }else if (!s.matches(upperCase)){
            return false;
        }else if (!s.matches(lowerCase)){
            return false;
        }

        return true;
    }
}
