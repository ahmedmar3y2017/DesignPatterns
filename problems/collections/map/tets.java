package problems.collections.map;

import java.util.*;

public class tets {

    public static void main(String[] args) {

        Guest marey = new Guest("Marey", 30);
        Guest gamal = new Guest("gamal", 50);

        Room room1 = new Room(1, "room1");
        Room room2 = new Room(2, "room2");

        Map<Room, Guest> map = new HashMap<Room, Guest>();

        map.put(room1, marey);
        map.put(room2, gamal);

        System.out.println(map.get(new Room(1, "room1")));
        System.out.println(map.get(room2));

        // switch room1 -> gamal , room
        Guest newGuest = map.put(room2, map.remove(room1));
        map.put(room1, newGuest);


        System.out.println(map.get(new Room(1, "room1")));
        System.out.println(map.get(room2));

        // iteration
        Set<Map.Entry<Room, Guest>> entries = map.entrySet();

        for (Map.Entry entry : entries) {

            Room room = (Room) entry.getKey();

            Guest guest = (Guest) entry.getValue();

            System.out.println("Key : " + room.getName() + " , value : " + guest.getName());
        }
        // using streams
        entries.stream().forEach(System.out::println);


        // comparable
        List<Room> rooms = new ArrayList<>();
        Room room50 = new Room(50, "room50");
        Room room70 = new Room(70, "room70");
        Room room60 = new Room(60, "room60");

        rooms.add(room50);
        rooms.add(room70);
        rooms.add(room60);
        rooms.add(new Room(2, "room50"));

        System.out.println(" -------------- comparable -------------");
        System.out.println(rooms);


        // method 1 - > comprable interface
        // Collections.sort(rooms );
        // method 2 - > comprable interface
        // rooms.sort(Comparator.naturalOrder());

        // custom comparator - > comparator interface
        rooms.sort(Room.comparatorCustom);
        System.out.println(" After -------------- comparable -------------");

        System.out.println(rooms);

        // binary search

        int i = Collections.binarySearch(rooms, room60, Room.comparatorCustom);
        System.out.println("Binary search index : " + i);

        // min
        String name = Collections.min(rooms).getName();
        System.out.println("Min Name : " + name);
        // max
        String nameMax = Collections.max(rooms).getName();
        System.out.println("Max Name : " + nameMax);

    }
}
