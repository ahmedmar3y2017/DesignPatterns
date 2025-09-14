package problems.functionalProgramming.FullExample;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.*;
import java.util.function.Function;

public class Example {


    public static void main(String[] args) {

        // function availability Path
        AvailabilityPath availabilityPath = new AvailabilityPath();
        // function inVoice path
        InvoicePath invoicePath = new InvoicePath();

        // create function setConfiguration that return Entry<order , ProcessConfiguration >
        Map.Entry<Order, ProcessConfiguration> orderProcessConfigurationEntry = setConfigurationExample();

        Function<Order, Double> orderDoubleFunction = calcCosttOfOder(orderProcessConfigurationEntry, invoicePath, availabilityPath);

        System.out.println(orderDoubleFunction.apply(orderProcessConfigurationEntry.getKey()));
    }

    private static Function<Order, Double> calcCosttOfOder(Map.Entry<Order, ProcessConfiguration> orderProcessConfigurationEntry, InvoicePath invoicePath, AvailabilityPath availabilityPath) {
        ProcessConfiguration orderProcessConfigurationEntryValue = orderProcessConfigurationEntry.getValue();

        Function<Order, Freight> orderFreightFunction = InvoicePathFunc(orderProcessConfigurationEntryValue, invoicePath);
        Function<Order, ShippingDate> orderShippingDateFunction = availabilityPathFun(orderProcessConfigurationEntryValue, availabilityPath);

        return order1 -> AdjustCost(order1, orderFreightFunction, orderShippingDateFunction);

    }

    private static Double AdjustCost(Order order1, Function<Order, Freight> orderFreightFunction, Function<Order, ShippingDate> orderShippingDateFunction) {

        Freight f = orderFreightFunction.apply(order1);
        ShippingDate s = orderShippingDateFunction.apply(order1);
        double cost = (getDayOfWeek(s.date) == "Monday") ? f.cost + 1000 : f.cost + 500;

        return cost;
    }

    public static String getDayOfWeek(LocalDateTime localDateTime) {
        return localDateTime.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                ;
    }


    private static Function<Order, ShippingDate> availabilityPathFun(ProcessConfiguration processConfiguration, AvailabilityPath availabilityPath) {
        AvailabilityChoice availabilityChoice = processConfiguration.getAvailabilityChoice();
        ShippingDateChoice shippingDateChoice = processConfiguration.getShippingDateChoice();
        // create Function depends on configuration
        Function<Order, Availability> orderAvailabilityFunction = availabilityPath.availabilityFunctions.stream().filter(availabilityChoiceFunctionEntry -> availabilityChoiceFunctionEntry.getKey().equals(availabilityChoice))
                .findAny().orElseGet(() -> availabilityPath.availabilityFunctions.get(0)).getValue();
        Function<Availability, ShippingDate> availabilityShippingDateFunction = availabilityPath.shippingDateFunctions.stream().filter(shippingDateChoiceFunctionEntry -> shippingDateChoiceFunctionEntry.getKey().equals(shippingDateChoice))
                .findAny().orElseGet(() -> availabilityPath.shippingDateFunctions.get(0)).getValue();
        Function<Order, ShippingDate> orderShippingDateFunction = availabilityShippingDateFunction.compose(orderAvailabilityFunction);

        return orderShippingDateFunction;

    }

    private static Function<Order, Freight> InvoicePathFunc(ProcessConfiguration processConfiguration, InvoicePath invoicePath) {
        InvoiceChoice invoiceChoice = processConfiguration.getInvoiceChoice();
        ShippingChoice shippingChoice = processConfiguration.getShippingChoice();
        FreightChoice freightChoice = processConfiguration.getFreightChoice();
        // create Function depends on configuration
        Function<Order, Invoice> orderInvoiceFunction = invoicePath.invoiceFunctions.stream().filter(invoiceChoiceFunctionEntry -> invoiceChoiceFunctionEntry.getKey().equals(invoiceChoice))
                .findAny().orElseGet(() -> invoicePath.invoiceFunctions.get(0)).getValue();
        Function<Invoice, Shipping> invoiceShippingFunction = invoicePath.shippingFunctions.stream().filter(shippingChoiceFunctionEntry -> shippingChoiceFunctionEntry.getKey().equals(shippingChoice))
                .findAny().orElseGet(() -> invoicePath.shippingFunctions.get(0)).getValue();
        Function<Shipping, Freight> shippingFreightFunction = invoicePath.freightFunctions.stream().filter(shippingChoiceFunctionEntry -> shippingChoiceFunctionEntry.getKey().equals(freightChoice))
                .findAny().orElseGet(() -> invoicePath.freightFunctions.get(0)).getValue();

        Function<Order, Freight> orderFreightFunction = shippingFreightFunction.compose(invoiceShippingFunction).compose(orderInvoiceFunction);

        return orderFreightFunction;

    }

    // function that choose configuration that we will worked on
    private static Map.Entry<Order, ProcessConfiguration> setConfigurationExample() {

        ProcessConfiguration processConfiguration = new ProcessConfiguration();
        processConfiguration.setAvailabilityChoice(AvailabilityChoice.AV3);
        processConfiguration.setFreightChoice(FreightChoice.fr2);
        processConfiguration.setInvoiceChoice(InvoiceChoice.Inv1);
        processConfiguration.setShippingChoice(ShippingChoice.Sh1);
        processConfiguration.setShippingDateChoice(ShippingDateChoice.SD1);

        Customer customer = new Customer();

        Order order = new Order();
        order.customer = customer;
        order.date = LocalDateTime.now();
        order.cost = 100;

        Map.Entry<Order, ProcessConfiguration> orderProcessConfigurationEntry = Map.entry(order, processConfiguration);

        return orderProcessConfigurationEntry;
    }


    // function :
    // entities - classes

    public static class ProcessConfiguration {

        public InvoiceChoice invoiceChoice;
        public ShippingChoice shippingChoice;
        public FreightChoice freightChoice;
        public AvailabilityChoice availabilityChoice;
        public ShippingDateChoice shippingDateChoice;

        public InvoiceChoice getInvoiceChoice() {
            return invoiceChoice;
        }

        public void setInvoiceChoice(InvoiceChoice invoiceChoice) {
            this.invoiceChoice = invoiceChoice;
        }

        public ShippingChoice getShippingChoice() {
            return shippingChoice;
        }

        public void setShippingChoice(ShippingChoice shippingChoice) {
            this.shippingChoice = shippingChoice;
        }

        public FreightChoice getFreightChoice() {
            return freightChoice;
        }

        public void setFreightChoice(FreightChoice freightChoice) {
            this.freightChoice = freightChoice;
        }

        public AvailabilityChoice getAvailabilityChoice() {
            return availabilityChoice;
        }

        public void setAvailabilityChoice(AvailabilityChoice availabilityChoice) {
            this.availabilityChoice = availabilityChoice;
        }

        public ShippingDateChoice getShippingDateChoice() {
            return shippingDateChoice;
        }

        public void setShippingDateChoice(ShippingDateChoice shippingDateChoice) {
            this.shippingDateChoice = shippingDateChoice;
        }
    }

    // invoice path class
    public static class InvoicePath {
        List<Map.Entry<InvoiceChoice, Function<Order, Invoice>>> invoiceFunctions;
        List<Map.Entry<ShippingChoice, Function<Invoice, Shipping>>> shippingFunctions;
        List<Map.Entry<FreightChoice, Function<Shipping, Freight>>> freightFunctions;

        InvoicePath() {
            invoiceFunctions = new ArrayList<Map.Entry<InvoiceChoice, Function<Order, Invoice>>>(
                    List.of(Map.entry(InvoiceChoice.Inv1, Example::calcInvoice1)
                            , Map.entry(InvoiceChoice.Inv2, Example::calcInvoice2)
                            , Map.entry(InvoiceChoice.Inv3, Example::calcInvoice3)
                            , Map.entry(InvoiceChoice.Inv4, Example::calcInvoice4)
                            , Map.entry(InvoiceChoice.Inv5, Example::calcInvoice5)

                    )
            );
            shippingFunctions = new ArrayList<Map.Entry<ShippingChoice, Function<Invoice, Shipping>>>(
                    List.of(Map.entry(ShippingChoice.Sh1, Example::calcShipping1)
                            , Map.entry(ShippingChoice.Sh2, Example::calcShipping2)
                            , Map.entry(ShippingChoice.Sh3, Example::calcShipping2)

                    )
            );
            freightFunctions = new ArrayList<Map.Entry<FreightChoice, Function<Shipping, Freight>>>(
                    List.of(Map.entry(FreightChoice.fr1, Example::calcFreightCost1)
                            , Map.entry(FreightChoice.fr2, Example::calcFreightCost2)
                            , Map.entry(FreightChoice.fr3, Example::calcFreightCost3)
                            , Map.entry(FreightChoice.fr4, Example::calcFreightCost4)
                            , Map.entry(FreightChoice.fr5, Example::calcFreightCost5)
                            , Map.entry(FreightChoice.fr6, Example::calcFreightCost6)

                    )
            );
        }


    }

    // availability path class
    public static class AvailabilityPath {
        List<Map.Entry<AvailabilityChoice, Function<Order, Availability>>> availabilityFunctions;
        List<Map.Entry<ShippingDateChoice, Function<Availability, ShippingDate>>> shippingDateFunctions;

        AvailabilityPath() {
            availabilityFunctions = new ArrayList<Map.Entry<AvailabilityChoice, Function<Order, Availability>>>(
                    List.of(
                            Map.entry(AvailabilityChoice.AV1, Example::calcAvailability1),
                            Map.entry(AvailabilityChoice.AV2, Example::calcAvailability2),
                            Map.entry(AvailabilityChoice.AV3, Example::calcAvailability3),
                            Map.entry(AvailabilityChoice.AV4, Example::calcAvailability4)
                    )
            );
            shippingDateFunctions = new ArrayList<Map.Entry<ShippingDateChoice, Function<Availability, ShippingDate>>>(
                    List.of(
                            Map.entry(ShippingDateChoice.SD1, Example::calcShippingDate1),
                            Map.entry(ShippingDateChoice.SD2, Example::calcShippingDate2),
                            Map.entry(ShippingDateChoice.SD3, Example::calcShippingDate3),
                            Map.entry(ShippingDateChoice.SD4, Example::calcShippingDate4),
                            Map.entry(ShippingDateChoice.SD5, Example::calcShippingDate5)
                    )
            );
        }

    }

    // logic functions 

    public static Invoice calcInvoice1(Order o) {
        System.out.println("Invoice 1");
        Invoice invoice = new Invoice();
        invoice.cost = o.cost * 1.1;
        return invoice;
    }

    public static Invoice calcInvoice2(Order o) {
        System.out.println("Invoice 2");
        Invoice invoice = new Invoice();
        invoice.cost = o.cost * 1.2;
        return invoice;
    }

    public static Invoice calcInvoice3(Order o) {
        System.out.println("Invoice 3");
        Invoice invoice = new Invoice();
        invoice.cost = o.cost * 1.3;
        return invoice;
    }

    public static Invoice calcInvoice4(Order o) {
        System.out.println("Invoice 4");
        Invoice invoice = new Invoice();
        invoice.cost = o.cost * 1.4;
        return invoice;

    }

    public static Invoice calcInvoice5(Order o) {
        System.out.println("Invoice 5");
        Invoice invoice = new Invoice();
        invoice.cost = o.cost * 1.5;
        return invoice;
    }

    public static Shipping calcShipping1(Invoice o) {
        System.out.println("Shipping 1");
        Shipping s = new Shipping();
        s.ShipperID = (o.cost > 1000) ? 1 : 2;
        s.cost = o.cost;

        return s;
    }

    public static Shipping calcShipping2(Invoice i) {
        System.out.println("Shipping 2");
        Shipping s = new Shipping();

        s.ShipperID = (i.cost > 1100) ? 1 : 2;
        s.cost = i.cost;

        return s;
    }

    public static Shipping calcShipping3(Invoice i) {
        System.out.println("Shipping 3");
        Shipping s = new Shipping();
        s.ShipperID = (i.cost > 1200) ? 1 : 2;
        s.cost = i.cost;

        return s;
    }

    public static Freight calcFreightCost1(Shipping s) {
        System.out.println("Freight 1");
        Freight f = new Freight();
        f.cost = (s.ShipperID == 1) ? s.cost * 0.25 : s.cost * 0.5;
        return f;
    }

    public static Freight calcFreightCost2(Shipping s) {
        System.out.println("Freight 2");
        Freight f = new Freight();
        f.cost = (s.ShipperID == 1) ? s.cost * 0.28 : s.cost * 0.52;
        return f;
    }

    public static Freight calcFreightCost3(Shipping s) {
        System.out.println("Freight 3");
        Freight f = new Freight();
        f.cost = (s.ShipperID == 1) ? s.cost * 0.3 : s.cost * 0.6;
        return f;
    }

    public static Freight calcFreightCost4(Shipping s) {
        System.out.println("Freight 4");
        Freight f = new Freight();
        f.cost = (s.ShipperID == 1) ? s.cost * 0.35 : s.cost * 0.65;
        return f;
    }

    public static Freight calcFreightCost5(Shipping s) {
        System.out.println("Freight 5");
        Freight f = new Freight();
        f.cost = (s.ShipperID == 1) ? s.cost * 0.15 : s.cost * 0.2;
        return f;
    }

    public static Freight calcFreightCost6(Shipping s) {
        System.out.println("Freight 6");
        Freight f = new Freight();
        f.cost = (s.ShipperID == 1) ? s.cost * 0.1 : s.cost * 0.15;
        return f;
    }

    public static Availability calcAvailability1(Order o) {
        System.out.println("Availability 1");
        Availability a = new Availability();
        a.date = o.date.plusDays(3);
        return a;
    }

    public static Availability calcAvailability2(Order o) {
        System.out.println("Availability 2");
        Availability a = new Availability();
        a.date = o.date.plusDays(2);
        return a;
    }

    public static Availability calcAvailability3(Order o) {
        System.out.println("Availability 3");
        Availability a = new Availability();
        a.date = o.date.plusDays(1);
        return a;
    }

    public static Availability calcAvailability4(Order o) {
        System.out.println("Availability 4");
        Availability a = new Availability();
        a.date = o.date.plusDays(4);
        return a;
    }

    public static ShippingDate calcShippingDate1(Availability o) {
        System.out.println("ShippingDate 1");
        ShippingDate a = new ShippingDate();
        a.date = o.date.plusDays(1);
        return a;
    }

    public static ShippingDate calcShippingDate2(Availability o) {
        System.out.println("ShippingDate 2");
        ShippingDate a = new ShippingDate();
        a.date = o.date.plusDays(2);
        return a;
    }

    public static ShippingDate calcShippingDate3(Availability o) {
        System.out.println("ShippingDate 3");
        ShippingDate a = new ShippingDate();
        a.date = o.date.plusHours(14);
        return a;
    }

    public static ShippingDate calcShippingDate4(Availability o) {
        System.out.println("ShippingDate 4");
        ShippingDate a = new ShippingDate();
        a.date = o.date.plusHours(20);
        return a;
    }

    public static ShippingDate calcShippingDate5(Availability o) {
        System.out.println("ShippingDate 5");
        ShippingDate a = new ShippingDate();
        a.date = o.date.plusHours(10);
        return a;
    }


    // --------------------- entities 
    public static class Customer {

    }

    public static class Order {
        public Customer customer;
        public LocalDateTime date;
        public double cost;

    }

    public static class Invoice {

        public double cost;

        public Invoice() {
            cost = 0;
        }
    }

    public static class Shipping {

        public double cost;
        public int ShipperID;

        public Shipping() {
            cost = 0;
        }
    }

    public static class Freight {
        public double cost;

        public Freight() {
            cost = 0;
        }
    }

    public static class Availability {
        public LocalDateTime date;

        public Availability() {

        }
    }

    public static class ShippingDate {
        public LocalDateTime date;

        public ShippingDate() {
        }
    }

    public enum InvoiceChoice {
        Inv1, Inv2, Inv3, Inv4, Inv5;
//        Inv2 = 1,
//        Inv3 = 2,
//        Inv4 = 3,
//        Inv5 = 4
    }

    public enum ShippingChoice {
        Sh1,
        Sh2,
        Sh3,
    }

    public enum FreightChoice {
        fr1,
        fr2,
        fr3,
        fr4,
        fr5,
        fr6
    }

    public enum AvailabilityChoice {
        AV1,
        AV2,
        AV3,
        AV4
    }

    public enum ShippingDateChoice {
        SD1,
        SD2,
        SD3,
        SD4,
        SD5
    }

}
