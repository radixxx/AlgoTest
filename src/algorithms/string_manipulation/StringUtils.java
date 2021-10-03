package algorithms.string_manipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null) return 0;

        int count = 0;
        String vowels = "aeiou";

        for (var ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) count++;
        }

        return count;
    }


    public static String reverse(String str) {
        if (str == null) return "";

        StringBuilder reversed = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null) return "";

        String[] words = sentence.trim().split("");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
/*
        StringBuilder reversed = new StringBuilder();
        for(var i = words.length - 1; i >= 0; i--){
            reversed.append(words[i] + " ");
        return reversed.toString().trim();*/
    }

    public static boolean areRotation(String str1, String str2){

        if(str1 == null || str2 == null) return false;

        return (str1.length() == str2.length() && (str1 + str2).contains(str2));
    }

    public static String removeDuplicates(String str){
        if(str == null) return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();


        for(var ch : str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static char getMaxOccuringChar(String str){

        if(str.isEmpty()) throw new IllegalArgumentException();

        final int ASCII_SIZE = 256;
        int[] freuquence = new int[ASCII_SIZE];
        for(var ch : str.toCharArray()) freuquence[ch]++;

        int max = 0;
        char result = ' ';
        for(var i = 0; i < freuquence.length; i++){
            if(freuquence[i] > max){
                max = freuquence[i];
                result = (char) i;
            }
        }

        return result;
    }

}
