package problems.functionalProgramming.Session;

import java.util.AbstractMap;
import java.util.function.Function;

public class OrderDiscountExample {

    static class Order {
        int orderIndex;
        double quantity;
        double unitPrice;

        public Order(int orderIndex, double quantity, double unitPrice) {
            this.orderIndex = orderIndex;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
    }

    public static void main(String[] args) {

        productType type = productType.bavarage;

        Order order = new Order(100, 5.0, 6.0);

//        AbstractMap.SimpleEntry<String, Integer> person =
//                new AbstractMap.SimpleEntry<>("Alice", 30);


//        AbstractMap.SimpleEntry<Double, Double> productParams =  productParamCalc(order.orderIndex);

        // delegate from calc params
        Function<Integer, AbstractMap.SimpleEntry<Double, Double>> productParamsFood = OrderDiscountExample::productParamCalcFood;
        ;
        Function<Integer, AbstractMap.SimpleEntry<Double, Double>> productParamsBavarage = OrderDiscountExample::productParamCalcbavarage;
        ;
        // get product Index function
        Function<Integer, AbstractMap.SimpleEntry<Double, Double>> finalParams = type == productType.food ? productParamsFood : productParamsBavarage;

        double finalDiscount = calculateFinalDiscount(finalParams, order);

        System.out.println("Final Result : " +finalDiscount);


    }

    private static AbstractMap.SimpleEntry<Double, Double> productParamCalcFood(int orderIndex) {
        // ---- Discount factors ----
        // QuantityFactor = 1% per 10 items (max 10%)
        double quantityFactor = Math.min(10, orderIndex * 10 / 10.0);

        // PriceFactor = 1% per $100 (max 10%)
        double priceFactor = Math.min(10, orderIndex * 100 / 100.0);


        return new AbstractMap.SimpleEntry<>(quantityFactor, priceFactor);
    }

    private static AbstractMap.SimpleEntry<Double, Double> productParamCalcbavarage(int orderIndex) {
        // ---- Discount factors ----
        // QuantityFactor = 1% per 10 items (max 10%)
        double quantityFactor = Math.min(10, orderIndex * 20 / 10.0);

        // PriceFactor = 1% per $100 (max 10%)
        double priceFactor = Math.min(10, orderIndex * 300 / 100.0);


        return new AbstractMap.SimpleEntry<>(quantityFactor, priceFactor);
    }

    public static double calculateFinalDiscount(Function<Integer, AbstractMap.SimpleEntry<Double, Double>> productParams,
                                             Order order) {
        double subtotal = order.quantity * order.unitPrice;

        AbstractMap.SimpleEntry<Double, Double> applyEntry = productParams.apply(order.orderIndex);
        // Total discount %
        double discountPercent = applyEntry.getKey() + applyEntry.getValue();

        // Cap discount at 20%
        discountPercent = Math.min(discountPercent, 20);

        // Final price
        double discountAmount = subtotal * (discountPercent / 100.0);
        return discountAmount;

    }

    enum productType {
        food, bavarage
    }
}
