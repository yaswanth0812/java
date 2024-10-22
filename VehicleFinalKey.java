final class caar {
    private String model;

    public caar(String model){
        this.model = model;
    }

    public final String getModel(){
        return model;
    }
}


public class VehicleFinalKey {
    public static void main(String[] args) {
        caar car = new caar("Tesla Cyborg");
        System.out.println("CarModel:" + car.getModel());

    }

}