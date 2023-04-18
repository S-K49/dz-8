package scr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"mama", "tato", "and new me"};
        pairedLetters(word);
    }

    public static void pairedLetters(String[] words) {

        List<String> helpList = new ArrayList<>();

        for(String word: words) {
        char [] characters = char.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();
            for(Character character : characters) {
                if(helpMap.containsKey(character)) {
                Integer value = helpMap.get(character)+1;
                helpMap.put(character, value);
                /*if (helpMap.containsKey(character)){
                    System.out.println(character);*/
                } else{
                    helpMap.put(character, 1);
                }
            }

            boolean isRightWord = true;

            for (Character key: helpMap.keySet()) {
                if (helpMap.get(key) % 2 != 0) {
                    isRightWord = false;
                }
            }
            if(isRightWord) {
                helpList.add(word);
            }
        }

        Set<Character> mySet = new Hashset<>();

        for (String chars: helpList) {
            for (Character character : chars.toCharArray()) {
                mySet.add(character);

            }
        }
    }
}
