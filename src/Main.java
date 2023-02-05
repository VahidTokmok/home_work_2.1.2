public class Main {
    public static void main(String[] args) {

        Elevator elevator1 = new Elevator("Hyndai", 9);
        Elevator elevator2 = new Elevator("Otis", 12);

        StoreyBuilding storeyBuilding = new StoreyBuilding(5,"Lenin st. 123","Street",
                TypeOfBuilding.RESIDENTIAL);
        System.out.println(storeyBuilding.printInfo());
        storeyBuilding.ventilationSystem();
        System.out.println();

        MultiStoreyBuilding multiStoreyBuilding = new MultiStoreyBuilding(9, "Aitmatov st. 55",
                "Underground", TypeOfBuilding.HOTEL,elevator1);
        System.out.println(multiStoreyBuilding.printInfo());
        multiStoreyBuilding.ventilationSystem("Mechanical");
        System.out.println();

        MultiStoreyBuilding multiStoreyBuilding1 = new MultiStoreyBuilding(13,"Chui av. 163",
                "Street and underground", TypeOfBuilding.BUSINESS_CENTER, elevator2);
        System.out.println(multiStoreyBuilding1.printInfo());
        multiStoreyBuilding1.ventilationSystem("Canal");
    }
}