package problems.interviews.common;

import java.util.*;

public class Anagrams_7 {

    public static void main(String[] args) {

        System.out.println(isAnagram("ahmed", "demha"));
        System.out.println(isAnagram("hmed", "hmed"));
        System.out.println(isAnagramBySet("ahmed", "demha"));
        System.out.println(isAnagramBySet("hmed", "lmed"));


    }

    // 1
    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        char[] charArray = first.toCharArray();
        char[] charArray1 = second.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        if (Arrays.equals(charArray, charArray1)) {
            return true;
        }
        return false;

    }

    // 2 by set
    public static boolean isAnagramBySet(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] charArray = first.toCharArray();
        char[] charArray1 = second.toCharArray();
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i < first.length(); i++) {

            set.add(charArray[i]);
            set1.add(charArray1[i]);
        }

        return set.equals(set1);
    }
}
