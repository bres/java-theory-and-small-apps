package polymorphism.polymorphism_2;

public class Car extends Vehicle{
    @Override
    public void go() {
        super.go();
        System.out.println("|i am a fast car");
    }
}
