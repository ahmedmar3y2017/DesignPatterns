package problems;

public class WordCount {
    public static void main(String[] args) {

        System.out.println("Number of words : " + count("Ahmed mohamed marey"));
    }

    public static int count(String sentense) {

        return sentense.trim().split(" ").length;
    }

}

