package smallApps.house;

public class Main {
    public static void main(String[] args) {

        Property[] properties = new Property[4];

        properties[1]=new House(1,2000,100,100);
        properties[2]=new House(2,1500,150,500);
        properties[3]=new Parking(3,100,500,20);

        Property maxIncome=properties[1];
        for (int i = 1; i <3 ; i++) {
            if (properties[i].calculateIncome()>maxIncome.calculateIncome()) {
                maxIncome=properties[i];
            }
        }
        System.out.println("max income property is:" +maxIncome + "and is: " +maxIncome.calculateIncome());
    }
}