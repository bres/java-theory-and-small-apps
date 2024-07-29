package polymorphism.polymorphism_2;

public class Main {
    public static void main(String[] args) {

        // polymorphism = greek word for polu-"many" , morph-"form"
        // The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle =  new Bicycle();
        Boat boat = new Boat();

        //individual running the go() method
//        car.go();
//        bicycle.go();
//        boat.go();

        // create an array to store car,boat,bicycle..which type should be?

//        Car[] racers = {car,bicycle,boat};
//        Boat[] racers = {car,bicycle,boat};
//        Bicycle[] racers = {car,bicycle,boat};

        // they are all vehicles as they extend vehicle
        Vehicle[] racers = {car,bicycle,boat};

        for (Vehicle iterator: racers) {
            iterator.go();
        }

    }
}
