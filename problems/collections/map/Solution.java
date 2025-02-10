package problems.collections.map;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinimumTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY processSize
     *  2. INTEGER_ARRAY capacity
     */

    public static int getMinimumTime(List<Integer> processSize, List<Integer> capacity) {
        // Write your code here
        if(processSize.size() < 1  )
            return -1 ;

        processSize.sort((a,b) -> a-b);
        Collections.sort(capacity , Collections.reverseOrder());


        int n = processSize.size();
        int m = capacity.size();

        // Step 2: Initialize variables
        int time = 0;
        int index = 0;

        // Step 3: Assign processes to processors
        for (int i = 0; i < m; i++) {
            if (index < n && capacity.get(i) >= processSize.get(index)) {
                time++;  // A processor can take a process
                index++;  // Move to the next process
            }

            // If all processes are assigned, break early
            if (index == n) {
                break;
            }
        }

        // Step 4: Check if all processes are assigned
        if (index < n) {
            return -1;  // Not all processes can be executed
        }

        // Step 5: Return the minimum time required
        return time;

//        int result = 0 ;
//        int i = capacity.size() -1;
//
//        for (Integer integer : processSize) {
//
//            result = Math.max(result,integer+ capacity.get(i));
//
//        }

//        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        int result = Result.getMinimumTime(Arrays.asList(2 , 5 , 3), Arrays.asList(6,2,4));

        System.out.println("getMinimumTime : " + result);
    }
}
