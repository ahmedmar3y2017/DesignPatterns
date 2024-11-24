package problems.Streams;

import java.util.Arrays;

public class OccurrencesOfWword {

    public static void main(String[] args) {

        System.out.println(getOccurrences("ahmed mohamed mohamed ahmed." , "Ahmed"));
    }


    // Return the number of occurrences of word in source
    static int getOccurrences(String source, String word) {
        source = source.replaceAll("\\.", "");
        // Your code goes here.
        return (int) Arrays.asList(source.trim().split(" ")).stream()
                .filter(s -> s.equalsIgnoreCase(word)).count();
    }
}
