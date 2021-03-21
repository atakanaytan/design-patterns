package builder.example_1;

public class House {

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

    public House() {
    }

    public House(String province, String district, String neighborhood, int buildYear, int roomNumber,
                 int bathroomNumber, int toiletNumber, int balconyNumber, boolean isDublex, boolean isFurnished,
                 boolean hasParkingLot, boolean hasChildrenPark, boolean hasAircondition, boolean hasPool) {

        this.province = province;
        this.district = district;
        this.neighborhood = neighborhood;
        this.buildYear = buildYear;
        this.roomNumber = roomNumber;
        this.bathroomNumber = bathroomNumber;
        this.toiletNumber = toiletNumber;
        this.balconyNumber = balconyNumber;
        this.isDublex = isDublex;
        this.isFurnished = isFurnished;
        this.hasParkingLot = hasParkingLot;
        this.hasChildrenPark = hasChildrenPark;
        this.hasAircondition = hasAircondition;
        this.hasPool = hasPool;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public int getToiletNumber() {
        return toiletNumber;
    }

    public void setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
    }

    public int getBalconyNumber() {
        return balconyNumber;
    }

    public void setBalconyNumber(int balconyNumber) {
        this.balconyNumber = balconyNumber;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasParkingLot() {
        return hasParkingLot;
    }

    public void setHasParkingLot(boolean hasParkingLot) {
        this.hasParkingLot = hasParkingLot;
    }

    public boolean isHasChildrenPark() {
        return hasChildrenPark;
    }

    public void setHasChildrenPark(boolean hasChildrenPark) {
        this.hasChildrenPark = hasChildrenPark;
    }

    public boolean isHasAircondition() {
        return hasAircondition;
    }

    public void setHasAircondition(boolean hasAircondition) {
        this.hasAircondition = hasAircondition;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append(", province='").append(province).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", neighborhood='").append(neighborhood).append('\'');
        sb.append(", buildYear=").append(buildYear);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", bathroomNumber=").append(bathroomNumber);
        sb.append(", toiletNumber=").append(toiletNumber);
        sb.append(", balconyNumber=").append(balconyNumber);
        sb.append(", isDublex=").append(isDublex);
        sb.append(", isFurnished=").append(isFurnished);
        sb.append(", hasParkingLot=").append(hasParkingLot);
        sb.append(", hasChildrenPark=").append(hasChildrenPark);
        sb.append(", hasAircondition=").append(hasAircondition);
        sb.append(", hasPool=").append(hasPool);
        sb.append('}');
        return sb.toString();
    }
}
