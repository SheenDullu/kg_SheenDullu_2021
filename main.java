package main.java.com.my.kargo;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String firstString = args[0];
        String secondString = args[1];
        System.out.println(hasOneToOneMapping(firstString, secondString));
    }

    private static boolean hasOneToOneMapping(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) return false;
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < firstString.length(); i++) {
            char character1 = firstString.charAt(i);
            char character2 = secondString.charAt(i);
            if(!mapping.containsKey(character1)) {
                if (mapping.containsValue(character2)) {
                    return false;
                }
                mapping.put(character1, character2);
            }
            if (mapping.containsKey(character1) && mapping.get(character1) != character2){
                return false;
            }
        }
        return true;
    }
}

