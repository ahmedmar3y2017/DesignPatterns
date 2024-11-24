package creational.builderPattern;

public class main {

    public static void main(String[] args) {

        WeatherModel build = new WeatherModelBuilder().setHumidity(100).setWindSpeed(200).setTemperature(300).build();

        System.out.println(build.getHumidity());
        System.out.println(build.getTemperature());
        System.out.println(build.getWindSpeed());

    }
}
