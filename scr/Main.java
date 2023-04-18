import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] firstSet = new String[]{"mama", "tato", "and new me"};
        pairedLetters(firstSet);
    }

    public static void pairedLetters(String[] firstSet) {

        List<String> helpList = new ArrayList<>();

        for(String char: firstSet) {
        char [] characters = char.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();
            for(Character character : characters) {
                if(helpMap.containsKey(character)) {
                Interger value = helpMap.get(character)+1;
                helpMap.put(character, value);
                /*if (helpMap.containsKey(character)){
                    System.out.println(character);*/
                } else{
                    helpMap.put(character, 1);
                }
            }

            boolean isRightWord = true;

            for (Character key: helpMap.keySet()) {
                if (helpMap.get(key) %2 != 0) {
                    isRightWord = false;
                }
            }
            if(isRightWord) {
                helpList.add(firstSet);
            }
        }

        Set<Character> mySet = new Hashset<>();

        for (String firstSet: helpList) {
            for (Chracter chracter : firstSet.toCharArray()) {
                mySet.add(character);

            }
        }
    }
}
