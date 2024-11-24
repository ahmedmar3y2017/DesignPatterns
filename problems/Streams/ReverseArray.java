package problems.Streams;


import java.util.*;
import java.util.stream.Collectors;

public class ReverseArray {


    public static void main(String[] args) {

        // reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

//        System.out.println(getAverage(Arrays.asList(7, 17, 13, 19, 5)));

        List<Integer> numbers = Arrays.asList(7, 17, 13, 19, 55);
        int targetSum = 26;

        System.out.println(getIndices(numbers, targetSum));

    }


    // Return the number of occurrences of word in source
    static int[] reverse(int[] arr) {
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr) {
            intList.add(i);
        }

        Collections.reverse(intList);

        intList.forEach(System.out::print);
        return intList.stream().mapToInt(i -> i).toArray();

    }


    // Return the average value of the source list
    static double getAverage(List<Integer> source) {

        double asDouble = source.stream().mapToInt(value -> value).average().getAsDouble();
        System.out.println(asDouble);

        // another solution
        double i = ((double) source.stream().mapToInt(value -> value).sum()) / (double) source.size();
        System.out.println(i);

        // Your code goes here.
        return asDouble;
    }

    // Return the a list of words with 5 or fewer characters
    static List<String> findFiveOrFewer(String source) {
        // Your code goes here.
        String[] split = source.trim().split(" ");
        List<String> collect = Arrays.stream(split).filter(s -> s.length() <= 5).collect(Collectors.toUnmodifiableList());

        return collect;
    }

    // Return the indices of the numbers in the source list that add up to target
    static List<Integer> getIndices(List<Integer> source, int target) {
        // Your code goes here.
        // use hashmap for these <source : source : value : index>

        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < source.size(); i++) {

            // add to map
            hashMap.put(source.get(i), i);

        }
        for (int i = 0; i < source.size(); i++) {

            int data = target - source.get(i);
            if (hashMap.containsKey(data) && hashMap.get(data) != i)
                return Arrays.asList(i, hashMap.get(data));
        }
        //
        return new ArrayList<>();
    }
}
