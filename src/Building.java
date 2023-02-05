public abstract class Building {
    private int numberOfFloors;
    private String address;
    private String parking;
    private TypeOfBuilding typeOfBuilding;

    public Building(int numberOfFloors, String address, String parking, TypeOfBuilding typeOfBuilding) {
        this.numberOfFloors = numberOfFloors;
        this.address = address;
        this.parking = parking;
        this.typeOfBuilding = typeOfBuilding;
    }

    public TypeOfBuilding getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String getAddress() {
        return address;
    }


    public String getParking() {
        return parking;
    }

    public String printInfo(){
        return "Address: " + address +
                "\nNumber of floors: " + numberOfFloors +
                "\nType of building: " + typeOfBuilding +
                "\nParking: " + parking;
    }
}

