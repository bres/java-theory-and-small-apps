package designPatterns.behavioral.strategyEx1;

public class FlyWithWings implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly");

    }
}
