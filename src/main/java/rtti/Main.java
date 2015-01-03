package rtti;
/**
 * Created by kot on 12/30/2014.
 */
class Building {
}
class House extends Building{}
public class Main {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        System.out.println(houseType.cast(b));
    }
}
