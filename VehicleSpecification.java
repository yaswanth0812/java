class vehicle{
    private String make;
    private String model;

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
}

class Cars extends vehicle{
    private int NumberOfDoors;

    public int getNumberOfDoors(){
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int NumberOfDoors){
        this.NumberOfDoors = NumberOfDoors;
    }
}

class Bike extends vehicle{
    private String type;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}

public class VehicleSpecification{
    public static void main(String[] args) {
        Cars car = new Cars();
        Bike bike = new Bike();

        car.setMake("Ford");
        car.setModel("Mustang");
        car.setNumberOfDoors(2);

        bike.setMake("Yamaha");
        bike.setModel("R15V3");
        bike.setType("sports");

        System.out.println("Car Make:" + car.getMake());
        System.out.println("Car model:" + car.getModel());
        System.out.println("NO OF Doors:" + car.getNumberOfDoors());
        System.out.println();
        System.out.println("Bike Make:" + bike.getMake());
        System.out.println("Bike Model:" + bike.getModel());
        System.out.println("Bike Type:" + bike.getType());
    }
}