package builder.example_1;

public class RealEstateAgent2_Good {

    public static void main(String[] args) {

        House house1 = HouseBuilder.startNormalHouseBuild("New York", " Manhatten",
                "Midtown", 1985, 2 )

                .setBalconyNumber(1)
                .setHasChildrenPark(true)
                .setHasAircondition(true)
                .setDublex(false)
                .build();

        House house2 = HouseBuilder.startHasPoolHouseBuild("California", "Manhatten",
                "Hillside", 1998, 4 )

                .setHasChildrenPark(true)
                .setHasParkingLot(true)
                .build();

        printHouse(house1);

        printHouse(house2);

    }

    private static void printHouse(House house){

        System.out.println();

        System.out.println("House added -> " + house );
    }
}
