package smallApps.theater;

import java.util.Scanner;

public class TheaterDemo {
    private static Theater theater = new Theater("acropolis",10,12);

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        do {
            showMenu();
            int choice;
            String response =in.nextLine();
            if (response.matches("\\d")) {
                choice = Integer.parseInt(response);
            }else {
                System.out.println("lanthasmenh epilogh");
                continue;
            }
            switch (choice) {
                case 1:
                    manageReservation();
                    break;
                case 2:
                    manageCancellation();
                    break;
                case 3:
                    exit =true;
                    break;
                default:
                    System.out.println("parakalo doste epilogh 1-3");
                    break;
            }

        }while(!exit);
        System.out.println("geia sas");
    }

    public static void manageReservation() {
        try {
            System.out.println("doste aritmo thesis");
            String response = in.nextLine();

            System.out.printf("%sepitixis kataxorhsh\n", theater.reservedSeat(response) ? "" : " mh ");
        } catch (IsReservedException e) {
            System.out.println("h thesh einai reserved");
        } finally {
            theater.printSeats();
        }
    }

    public static void manageCancellation() {
        try {
            System.out.println("doste aritmo thesis");
            String response = in.nextLine();

            System.out.printf("%sepitixis akyrosh\n", theater.cancelReservation(response) ? "" : " mh ");
        } catch (IsNotReservedException e) {
            System.out.println("h thesh einai non-reserved");
        } finally {
            theater.printSeats();
        }
    }
    public static void showMenu() {
        System.out.println("doste mia epilogh");
        System.out.println("1.krathsh thesis");
        System.out.println("2.akyrosh thesis");
        System.out.println("3.exodos");
    }
}
