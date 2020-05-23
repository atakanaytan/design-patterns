package builder;

public class HouseBuilder {

    private String province;
    private String district;
    private String neighborhood;

    private int buildYear;
    private int roomNumber;
    private int bathroomNumber;
    private int toiletNumber;
    private int balconyNumber;

    private boolean isDublex;
    private boolean isFurnished;
    private boolean hasParkingLot;
    private boolean hasChildrenPark;
    private boolean hasAircondition;
    private boolean hasPool;

    // Mandatory fields for every houses
    public static HouseBuilder startNormalHouseBuild(String province, String district, String neighborhood,
                                                     int buildYear, int roomNumber){

        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.province = province;
        houseBuilder.district = district;
        houseBuilder.neighborhood = neighborhood;
        houseBuilder.buildYear = buildYear;
        houseBuilder.roomNumber = roomNumber;

        return houseBuilder;
    }

    public static HouseBuilder startHasPoolHouseBuild(String province, String district, String neighborhood,
                                                      int buildYear, int roomNumber){

        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.province = province;
        houseBuilder.district = district;
        houseBuilder.neighborhood = neighborhood;
        houseBuilder.buildYear = buildYear;
        houseBuilder.roomNumber = roomNumber;
        houseBuilder.hasPool = true;

        return houseBuilder;
    }

    public House build(){

        House house = new House();

        house.setProvince(province);
        house.setDistrict(district);
        house.setNeighborhood(neighborhood);

        house.setBuildYear(buildYear);
        house.setRoomNumber(roomNumber);
        house.setBathroomNumber(bathroomNumber);
        house.setToiletNumber(toiletNumber);
        house.setBalconyNumber(balconyNumber);

        house.setDublex(isDublex);
        house.setFurnished(isFurnished);
        house.setHasParkingLot(hasParkingLot);
        house.setHasChildrenPark(hasChildrenPark);
        house.setHasAircondition(hasAircondition);
        house.setHasPool(hasPool);

        return house;
    }


    public HouseBuilder setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
        return this;
    }

    public HouseBuilder setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
        return this;
    }

    public HouseBuilder setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
        return this;
    }

    public HouseBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public HouseBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HouseBuilder setHasParkingLot(boolean hasParkingLot) {
        this.hasParkingLot = hasParkingLot;
        return this;
    }

    public HouseBuilder setHasChildrenPark(boolean hasChildrenPark) {
        this.hasChildrenPark = hasChildrenPark;
        return this;
    }

    public HouseBuilder setHasAircondition(boolean hasAircondition) {
        this.hasAircondition = hasAircondition;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
