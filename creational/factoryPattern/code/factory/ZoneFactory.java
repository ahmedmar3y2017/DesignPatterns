package creational.factoryPattern.code.factory;

import creational.factoryPattern.code.Zone;

public abstract class ZoneFactory {
    public abstract Zone createFactory(String zoneId);
}
