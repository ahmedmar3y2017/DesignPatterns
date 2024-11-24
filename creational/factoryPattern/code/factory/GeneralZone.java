package creational.factoryPattern.code.factory;

import creational.factoryPattern.code.EgyptZone;
import creational.factoryPattern.code.UsZone;
import creational.factoryPattern.code.Zone;

public class GeneralZone extends ZoneFactory {
    @Override
    public Zone createFactory(String zoneId) {

        switch (zoneId) {

            case "US":
                return new UsZone();

            default:
                return new EgyptZone();
        }

    }
}
