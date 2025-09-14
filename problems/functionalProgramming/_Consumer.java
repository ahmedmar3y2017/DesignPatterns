package problems.functionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Consumer<Customer> customerConsumer = customer -> {
            System.out.println("customer name : " + customer.name + " phone : " + customer.phone);
        };

        customerConsumer
                .accept(new Customer());

        // Bi Consumer
        BiConsumer<Customer ,  Boolean> customerBiConsumer = (customer1, showNumer) -> {
            System.out.println("customer name : " + customer1.name +

                    " phone : " + (showNumer ?  customer1.phone : "*****"));
        };

        customerBiConsumer
                .accept(new Customer(), false);

    }

     static class Customer {
         String name = "John";
         String phone = "0123456789";

         public Customer() {
         }

         public Customer(String name, String phone) {
             this.name = name;
             this.phone = phone;
         }
     }

}
