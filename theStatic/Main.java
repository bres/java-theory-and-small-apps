package theStatic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat myCat1 = new Cat("nantito",5);
        Cat myCat2 = new Cat("ntorouk",4);

        myCat1.meow();

        /*
        * the Cat class can not meow, only the individual actual cats can meow
        * Generally this is not a cat but a blueprint of what a cat has and what is able to d
        */
        //Cat.meow();

        // I am able to do that because I have declared the method as a static
        System.out.println(Cat.getCatCount());

        //generally i should always access static methods and fields through the class
        //and not from any individual objects
    }
}