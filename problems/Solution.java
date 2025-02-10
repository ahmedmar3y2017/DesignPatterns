package problems;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
    *
    * input :  5
1
2
3
4
6
*
*
3
4
7
4
    *
    * output :
    *
    * */

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
        capacity.sort((a,b) -> a-b);
        //Collections.sort(capacity , Collections.reverseOrder());


        int n = processSize.size();
        int m = capacity.size();

        int time = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            if (index < n && capacity.get(i) >= processSize.get(index)) {
                time++;
                index++;
            }

            if (index == n) {
                break;
            }
        }

        if (index < m) {
            return -1;
        }

        return time;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int processSizeCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> processSize = IntStream.range(0, processSizeCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int capacityCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> capacity = IntStream.range(0, capacityCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());

        int result = Result.getMinimumTime(Arrays.asList(50,30,48,7,16,1,17,15), Arrays.asList(17,13,1,43,50));
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
