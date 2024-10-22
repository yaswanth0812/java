class AnimalSS {

    public void makeSound() {
        System.out.println("Animal make a Sound");
    }
}
class DogSS extends AnimalSS {
    public void makeSound(){
        System.out.println("Dogs Barks!");
    }
}

public class AnimalDynamicMethodDispatch {
    static void printSound(AnimalSS a) {
        a.makeSound();
    }

    public static void main(String[] args) {
        AnimalSS myAnimal = new AnimalSS();
        DogSS myDog = new DogSS();

        myAnimal.makeSound();
        myDog.makeSound();
        printSound(myAnimal);
        printSound(myDog);
    }
}