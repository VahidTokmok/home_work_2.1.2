public final class MultiStoreyBuilding extends StoreyBuilding {
    private Elevator elevator;

    public Elevator getElevator() {
        return elevator;
    }

    public MultiStoreyBuilding(int numberOfFloors, String address, String parking,
                               TypeOfBuilding typeOfBuilding, Elevator elevator) {
        super(numberOfFloors, address, parking, typeOfBuilding);
        this.elevator = elevator;
    }

    @Override
    public String printInfo() {
        return super.printInfo() +
                "\nElevator name: " + elevator.getName() +
                "\nElevator capacity: " + elevator.getCapacity();
    }
}

