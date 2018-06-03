package com.example.password_validator;

public class Validator {
    public String testPassword(String s){
        String upperCase = ".*[A-Z].*";
        String lowerCase = ".*[a-z].*";
        String numbers = ".*[0-9].*";
        String specialChar = ".*[!@#$%^&*(){}|?<>,.].*";

        if (s.length() < 8 || s.length() > 16){
            return "Password has to be 8-16 characters.";
        }else if (!s.matches(upperCase)){
            return "Not Strong!";
        }else if (!s.matches(lowerCase)){
            return "Not Strong!";
        }else if (!s.matches(numbers)){
            return "Not Strong!";
        }else if (!s.matches(specialChar)){
            return "Not Strong!";
        }

        return "Good!";
    }
}
