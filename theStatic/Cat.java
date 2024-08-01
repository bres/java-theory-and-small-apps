package theStatic;

public class Cat {
    String name;
    int age;
    private static int  catCount;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.catCount++; // every time an object is created the counter increase
                         // and we can grub this counter through a static getter
                         // static, so we can apply on a class blueprint
    }

    public static int getCatCount(){
        //System.out.println(age); - Non-static field 'age' cannot be referenced from a static context
        return catCount;
    }

    public  void meow() {
        System.out.println("meowww");
    }
}
