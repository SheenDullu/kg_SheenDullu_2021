package main.java.com.my.kargo;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        //to check the number of arguments being passed
        if (args.length == 2) {
            for (int i = 0; i < 2; i++) {
                args[i] = args[i].toLowerCase().replaceAll("[^a-zA-Z]", "");
            }
            System.out.println(hasOneToOneMapping(args[0], args[1]));
        } else {
            System.out.println("Run this program with 2 command line arguments.");
        }
    }

    public static boolean hasOneToOneMapping(String firstString, String secondString) {
        //for one to one mapping the length of both the strings should match
        if (firstString.length() != secondString.length()) return false;
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < firstString.length(); i++) {
            char character1 = firstString.charAt(i);
            char character2 = secondString.charAt(i);
            if (!mapping.containsKey(character1)) {
                mapping.put(character1, character2);
            }
            if (mapping.containsKey(character1) && !mapping.get(character1).equals(character2)) {
                return false;
            }
        }
        return true;
    }
}

