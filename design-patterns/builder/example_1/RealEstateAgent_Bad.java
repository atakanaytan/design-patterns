package builder.example_1;

public class RealEstateAgent_Bad {

    // Not flexible. Can't create constructors for different kind of houses. Not readable
    public static void main(String[] args) {

        House house1 = new House();
        house1.setProvince("Los Angeles");
        house1.setDistrict("San Diego");
        house1.setRoomNumber(3);
        house1.setBuildYear(1996);

        House house2 = new House("Nebraska", "Lincoln", "Downtown", 2008, 3,
                2, 2, 1, true, true, true,
                false, true, false);

        printHouse(house1);

        printHouse(house2);
    }

    private static void printHouse(House house){

        System.out.println();

        System.out.println("House added -> " + house );
    }
}
