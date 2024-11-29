package problems.interviews.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {


    private final String name;
    private final int age;
    List<String> strings;

    ImmutableClass(final String name, final int age, List<String> strings) {

        this.name = name;
        this.age = age;

        List<String> stringList = new ArrayList<String>();
        stringList.addAll(strings);
        this.strings = stringList;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public List<String> getStrings() {
        return strings;
    }

}
