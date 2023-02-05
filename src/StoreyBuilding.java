public class StoreyBuilding extends Building {

    public StoreyBuilding(int numberOfFloors, String address, String parking,
                          TypeOfBuilding typeOfBuilding) {
        super(numberOfFloors, address, parking, typeOfBuilding);
    }

    public final void ventilationSystem(){
        System.out.println("Natural ventilation system");
    }
    public void ventilationSystem(String system){
        System.out.println(system + " ventilation system");
    }
}

