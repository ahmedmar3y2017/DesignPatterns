package problems.interviews.immutable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("a1");
        stringList1.add("b1");

        ImmutableClass immutableClass = new ImmutableClass("ahmed", 20, stringList);

        ImmutableClass immutableClass1 = immutableClass ;


        System.out.println(immutableClass.getStrings());
        stringList.add("c");
        System.out.println(immutableClass.getStrings());
        System.out.println(immutableClass1.getStrings());


    }
}
