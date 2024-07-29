package polymorphism.polymorphism_1;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalSounds animal =  new AnimalSounds();
        Cow cow = new Cow();
        Dog dog = new Dog();
        animal.Sound();
        cow.Sound();
        dog.sound();
        dog.sound("angry");

    }
}
