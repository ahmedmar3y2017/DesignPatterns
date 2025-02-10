package problems;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ttt {

    public static void main(String[] args) {


        // -------------- problem 1 ------- ( getMinimumCost ) for pixel ------------

        // ------------- problem 2 ( getStatForRequests )
        /*
        *
        *
        *
        *
STDIN                           FUNCTION
-----                           --------
1                          ?    m = 1
4                          ?    database[] size n = 4
0 tezox www.google.com     ?    database = ["0 tezox www.google.com", "0 rrakl www.facebook.com", "0 crona www.hackerrank.com", "0 hckrk www.hackerrank.com"]
0 rrakl www.facebook.com
0 crona www.hackerrank.com
0 hckrk www.hackerrank.com
2                          ?    requests[] size q = 2
rrakl                      ?    requests = ["rrakl", "crona"]
crona



output
request , num of user
www.facebook.com 1
www.hackerrank.com 2

        *
        *
        * */
//        getMinimumCost();

        System.out.println(getStatForRequests(1, Arrays.asList("0 tezox www.google.com", "0 rrakl www.facebook.com", "0 crona www.hackerrank.com", "0 hckrk www.hackerrank.com"),

                Arrays.asList("rrakl", "crona")));
    }

    public static List<List<String>> getStatForRequests(int m, List<String> database, List<String> requests) {
        // Write your code here

        List<List<String>> result = new ArrayList<>();
        for (String request : requests) {
            Optional<String> any = database.stream().filter(string -> string.contains(request)).findAny();
            any.ifPresent(string -> {
                String[] split = string.split(" ");
                String requestUrl = split[2];
                long count = database.stream().filter(string1 -> string1.contains(requestUrl)).count();

                result.add(Arrays.asList(requestUrl, String.valueOf(count)));
            });
        }

        return result;
    }

    public static long getMinimumCost(List<List<Integer>> pixelIntensity) {
        // Write your code here

        Integer[][] array = pixelIntensity.stream()
                .map(l -> l.stream().toArray(Integer[]::new))
                .toArray(Integer[][]::new);

        int totalcost = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                // start from row 2
                if (i > 0) {
                    int cost = 0;

                    if (array[i][j] <= array[i - 1][j]) {
                        // add
                        cost += (array[i - 1][j] - array[i][j]) + 1;
                        totalcost += cost;
                        array[i][j] = array[i][j] + cost;
                    }

                }

            }
        }

        return totalcost;
    }


}
