package pl.sda.javakrk25.day5.zad_11_house;

import java.util.ArrayList;
import java.util.List;

public class House {
    private Room kitchen;
    private Room bathroom;
    private List<Room> roomList = new ArrayList<>();

    public House(Room kitchen, Room bathroom) {
        this.kitchen = kitchen;
        this.bathroom = bathroom;
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public double totalArea() {
        double area = 0;
        area += kitchen.getArea() + bathroom.getArea();
        for (Room room : roomList) {
            area += room.getArea();
        }
        return area;
    }
}
