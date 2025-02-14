package org.launchcode.java.studios.countingcharacters;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args){
        HashMap<Character, Integer> listItems = new HashMap<>();
        String sampleQuote = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there.";
        char[] charactersInString = sampleQuote.toCharArray();

        for (char characters : charactersInString){
            if (listItems.containsKey(characters)){
                listItems.put(characters, listItems.get(characters) + 1);
            } else {
                listItems.put(characters, 1);
            }
        }

        for (Map.Entry<Character, Integer> oneChar : listItems.entrySet()) {
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }

    }
}
