package com.example.password_validator;

public class Validator {
    public boolean testPassword(String s){
        String upperCase = ".*[A-Z].*";
        String lowerCase = ".*[a-z].*";
        String numbers = ".*[0-9].*";
        String specialChar = ".*[!@#$%^&*(){}|?<>,.].*";

        if (s.length() < 8 || s.length() > 16){
            return false;
        }else if (!s.matches(upperCase)){
            return false;
        }else if (!s.matches(lowerCase)){
            return false;
        }else if (!s.matches(numbers)){
            return false;
        }else if (!s.matches(specialChar)){
            return false;
        }

        return true;
    }
}
