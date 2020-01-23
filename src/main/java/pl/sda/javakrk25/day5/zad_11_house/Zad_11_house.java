package pl.sda.javakrk25.day5.zad_11_house;

public class Zad_11_house {
    public static void main(String[] args) {

        Room kitchen = new Room(2.3, 3.3);
        Room bathroom = new Room(1.7, 2.2);

        House house = new House(kitchen, bathroom);
        house.addRoom(new Room(4.3, 3.8));
        house.addRoom(new Room(7.5, 5.6));
        house.addRoom(new Room(4, 3.9));

        System.out.println("Total area = " + house.totalArea());


    }

}
