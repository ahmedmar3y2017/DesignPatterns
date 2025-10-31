package problems.Generics.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestExample {
    public static void main(String[] args) {
//        List<UserProfile> list = new ArrayList<>(Arrays.asList(
//                new UserProfile[]{
//                        new UserProfile(50),
//                        new UserProfile(20),
//
//                }
//
//        ));

        List<UserProfileComplete> list2 = new ArrayList<>(Arrays.asList(
                new UserProfileComplete[]{
                        new UserProfileComplete(50),
                        new UserProfileComplete(20),

                }

        ));

        CollectionCustom<UserProfile> stringCollectionCustom = new CollectionCustom<>();
        stringCollectionCustom.sort(list2);
        System.out.println("Sorted list: " + list2);
    }

    public static class CollectionCustom<T extends Comparable< ? super T>> {

        public void sort(List<? extends T> list) {
            Collections.sort(list);
        }

    }

    public static class UserProfile implements Comparable<UserProfile> {
        private Integer age;

        UserProfile(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public int compareTo(UserProfile o) {
            return this.age.compareTo(o.age);
        }

        @Override
        public String toString() {
            return "UserProfile{" +
                    "age=" + age +
                    '}';
        }
    }

    public static class UserProfileComplete extends UserProfile {

        UserProfileComplete(Integer age) {
            super(age);
        }
    }
    //
    //

}
