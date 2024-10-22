class animal{
    private String SpeciesName;

    public String getSpeciesName(){
        return SpeciesName;
    }

    public void setSpeciesName(String SpeciesName) {
        this.SpeciesName = SpeciesName;
    }
}

class mammal extends animal{
    private Boolean HasFur;

    public Boolean getHasFur(){
        return HasFur;
    }

    public void setHasFur(Boolean HasFur) {
        this.HasFur = HasFur;
    }
}

class dog extends mammal{
    private String Breed;

    public String getBreed(){
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }
}


public class AnimalBehaviour{
    public static void main(String[] args) {
        dog obj = new dog();

        obj.setSpeciesName("Cannie");
        obj.setHasFur(true);
        obj.setBreed("beagle");

        System.out.println("Species:" + obj.getSpeciesName());
        System.out.println("Has Fur:" + obj.getHasFur());
        System.out.println("Breed:" + obj.getBreed());


    }
}