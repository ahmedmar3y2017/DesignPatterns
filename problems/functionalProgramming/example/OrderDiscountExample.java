package problems.functionalProgramming.example;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderDiscountExample {

    static class Order {
        double discount;
        double quantity;
        double unitPrice;

        public Order(int discount, double quantity, double unitPrice) {
            this.discount = discount;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public Order(double quantity, double unitPrice) {
            this.discount = 0;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

    }

    static List<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        orders.add(new Order(100, 100));
        orders.add(new Order(200, 200));
        orders.add(new Order(300, 300));
        List<Order> finalOrderDiscount = orders.stream().map(
                order -> getOrderWithDiscount(order, getRules())
        ).collect(Collectors.toList());

        finalOrderDiscount.stream().forEach(order -> {

            System.out.println(order.discount + " " + order.quantity + " " + order.unitPrice);
        });
    }

    // function get order and list of roles -> loop over roles and check if qlaified -> calculate discount then sort and get less 3 discount and get avg
    private static Order getOrderWithDiscount(Order order, List<AbstractMap.SimpleEntry<Function<Order, Boolean>, Function<Order, Double>>> rules) {

        double orderDiscount = rules.stream().filter(functionFunctionSimpleEntry -> functionFunctionSimpleEntry.getKey().apply(order))
                .map(functionFunctionSimpleEntry -> functionFunctionSimpleEntry.getValue().apply(order))
                .sorted().limit(3).mapToDouble(Double::doubleValue).average().orElse(0.0);

        Order orderWithDiscount = new Order(order.quantity, order.unitPrice);
        orderWithDiscount.discount = orderDiscount;
        return orderWithDiscount;


    }


    // create function rules <Function<Order,Boolean> , Function<Order,Double>
    public static List<AbstractMap.SimpleEntry<Function<Order, Boolean>, Function<Order, Double>>> getRules() {

        List<AbstractMap.SimpleEntry<Function<Order, Boolean>, Function<Order, Double>>> rulesList =
                new ArrayList<AbstractMap.SimpleEntry<Function<Order, Boolean>, Function<Order, Double>>>();

        Function<Order, Boolean> orderBooleanFunctionA = OrderDiscountExample::isQualifiedA;
        Function<Order, Double> orderDoubleFunctionA = OrderDiscountExample::A;
        Function<Order, Boolean> orderBooleanFunctionB = OrderDiscountExample::isQualifiedB;
        Function<Order, Double> orderDoubleFunctionB = OrderDiscountExample::B;
        Function<Order, Boolean> orderBooleanFunctionC = OrderDiscountExample::isQualifiedC;
        Function<Order, Double> orderDoubleFunctionC = OrderDiscountExample::C;
        rulesList.add(new AbstractMap.SimpleEntry(orderBooleanFunctionA, orderDoubleFunctionA));
        rulesList.add(new AbstractMap.SimpleEntry(orderBooleanFunctionB, orderDoubleFunctionB));
        rulesList.add(new AbstractMap.SimpleEntry(orderBooleanFunctionC, orderDoubleFunctionC));

        return rulesList;

    }

    public static boolean isQualifiedA(Order order) {

        return true;
    }

    public static double A(Order order) {

        return 5;
    }
    public static boolean isQualifiedB(Order order) {

        return true;
    }

    public static double B(Order order) {

        return 5;
    }
    public static boolean isQualifiedC(Order order) {

        return true;
    }

    public static double C(Order order) {

        return 10;
    }
}
