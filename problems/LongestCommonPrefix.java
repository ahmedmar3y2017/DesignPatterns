package problems;


import java.util.Arrays;

// 1 - sort array for enhance searching
// 2 - get first and last element only for processing
// 3 - get the min length from forst and last element as w need only
// 4 - loop over min length of 2 items if char not matched in two string -> break
// 5 finally substring from 0 to iterator i

/*
* 
* Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings: "geeksforgeeks", "geeks", "geeks" and "geezer".

Input: arr[] = ["apple", "ape", "april"]
Output : "ap"
Explanation: "ap" is the longest common prefix in all the given strings: "apple", "ape" and "april".

Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There’s no common prefix in the given strings.


* */
public class LongestCommonPrefix {


    public static void main(String[] args) {


        System.out.println(getLongestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}));
    }

    public static String getLongestCommonPrefix(String[] strings) {

        Arrays.sort(strings);
        String first = strings[0];
        String last = strings[strings.length - 1];

        int minLength = Math.min(first.length(), last.length());

        int j = 1;
        for (int i = 0; i < minLength; i++) {

            if (first.charAt(i) != last.charAt(i))
                break;
            j++;
        }


        return first.substring(0, j);
    }

}
