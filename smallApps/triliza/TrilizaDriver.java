package smallApps.triliza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrilizaDriver {

    public static void main(String[] args) {

        boolean done = false;
        Scanner in = new Scanner(System.in);
        int x,y;
        Triliza triliza = Triliza.createTriliza();
        int i =1;
        int times = 0;

        // oposdhpote mia fora tha paixei o paikths
        do {
            // times++==10 (epithematika) prota ginetai o elegxos kai meta h ayxhsh
            if(++times==10) break; // (prothematika) prota ayxanei kai meta ginetai o elegxos
            System.out.println("paizei o paikths "+i);
            System.out.println("doste thn thesh x,y");
            try { // data validation
                x = in.nextInt();
                y = in.nextInt();

                triliza.setValue(x,y,i);
                triliza.printGrid();
                done = triliza.checkForTriliza();

                i =(done) ? i : (i % 2 ==0)?1:2;
            } catch (InputMismatchException e1) {
                System.out.println("parakalo doste dyo aritmoys");
                in.nextLine();
            } catch (ValueOutOfBoundsException e2) {
                System.out.println("parakalo doste dyo  aritmoys entos orion");
            }

        }while(!done);
        System.out.println("kerdise o paikths" +i);
    }
}
