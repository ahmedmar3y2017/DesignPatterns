package creational.factoryPattern.code;

import creational.factoryPattern.code.factory.GeneralZone;
import creational.factoryPattern.code.factory.ZoneFactory;

public class main {

    public static void main(String[] args) {
        ZoneFactory generalZone = new GeneralZone();

        Zone us = generalZone.createFactory("US");
        Zone eg = generalZone.createFactory("EG");


        System.out.println(eg.getName() + " " + eg.getOffset());
        System.out.println(us.getName() + " " + us.getOffset());
    }
}
