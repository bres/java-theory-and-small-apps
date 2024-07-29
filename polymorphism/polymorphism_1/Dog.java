package polymorphism.polymorphism_1;

public class Dog extends AnimalSounds{
    public void sound() {
        System.out.println("the dog says :woof wooof");
    }
    //method overloading-polymorphism
    public void sound(String emotion) {
        System.out.println("the dog says i am "+emotion);
        super.Sound(); //going up to the parent class and execute sound() as it is in the parent formation
    }
}
