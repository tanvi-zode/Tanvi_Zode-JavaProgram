//Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.



import java.util.HashMap;
import java.util.Map;

public class HighestRepeatedLettersWord {
    public static void main(String[] args) {
        String inputString = "This is a sample string with some words having repeated letters like 'success' and 'letters'.";
        String wordWithHighestRepeatedLetters = findWordWithHighestRepeatedLetters(inputString);
        System.out.println("Word with highest repeated letters: " + wordWithHighestRepeatedLetters);
    }

    public static String findWordWithHighestRepeatedLetters(String inputString) {
        String[] words = inputString.split("\\s+");
        String result = "";
        int maxRepeatedLetters = -1;

        for (String word : words) {
            int repeatedLettersCount = countRepeatedLetters(word);
            if (repeatedLettersCount > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLettersCount;
                result = word;
            }
        }

        return maxRepeatedLetters > 1 ? result : "-1";
    }

    public static int countRepeatedLetters(String word) {
        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
        }
        int maxCount = 0;
        for (int count : letterCountMap.values()) {
            if (count > 1 && count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
