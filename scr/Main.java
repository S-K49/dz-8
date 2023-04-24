package scr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "mama", "papa", "its me"};
        pairedLetters(words);
    }

    public static void pairedLetters(String[] words) {
        List<String> helpList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            while (count == 2) {
                System.out.println(helpList);
                break;
            }
            char[] characters = word.toCharArray();

            Map<Character, Integer> charMap = new HashMap<>();
            for (Character character : characters) {
                if (charMap.containsKey(character)) {
                    Integer value = charMap.get(character) + 1;
                    charMap.put(character, value);
                } else {
                    charMap.put(character, 1);
                }

                boolean isRightWord = true;

                for (Character key : charMap.keySet()) {
                    if (charMap.get(key) % 2 != 0) {
                        isRightWord = false;
                    }
                }
                if (isRightWord) {
                    helpList.add(word);
                    count++;
                }
            }
        }

            Set<Character> uniqueLetters = new HashSet<>();
            for (String uniqueLetter : helpList) {
                for (Character letter : uniqueLetter.toCharArray()) {
                    uniqueLetters.add(letter);
                }
                System.out.println(uniqueLetters);
            }
        }
    }