package smallApps.theater;

import java.sql.SQLOutput;

/**
 * pojo class
 */
public class Theater implements  ITheater{
    private String theaterName;
    private int rows;
    private int seatsPerRow;
    private Seat[][] seats;

    public Theater(String theaterName, int rows, int seatsPerRow) {
        this.theaterName = theaterName;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new Seat[rows][seatsPerRow];

        final char ALPHA='A';
        for (int i=0;i<rows;i++){
            for (int j = 0; j < seatsPerRow; j++) {
                Seat seat = new Seat(String.format("%c%02d",(char)(i+ALPHA),j+1));
                seats[i][j]=seat;

            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    /**
     *
     * @param seatNumber aritmos theshs se morfh kefalaio gramma akoloytoymeno  apo 2 pshfia
     * @return  true an ginei to reservation
     * @throws IsReservedException an h thesi einai hdh reserved
     */
    @Override
    public boolean reservedSeat(String seatNumber) throws IsReservedException {
        int row,column;
        if ((seatNumber != null) && (seatNumber.matches("[A-Z]{1}\\d{2}"))) {
            row =seatNumber.charAt(0)-'A';
            column = Integer.parseInt(seatNumber.substring(1));
        } else {
            System.out.println("lathos aritmos thesis");
            return false;
        }
        return (((row >=0 && row<this.rows) && (column >=1) && column <= seatsPerRow) && (seats[row][column-1].reserve()));
    }

    /**
     *
     * @param seatNumber aritmos theshs se morfh kefalaio gramma akoloytoymeno  apo 2 pshfia
     * @return  true an ginei to cancel
     * @throws IsReservedException an h thesi einai hdh nonreserved
     */
    @Override
    public boolean cancelReservation(String seatNumber) throws IsNotReservedException {
        int row,column;
        if ((seatNumber != null) && (seatNumber.matches("[A-Z]{1}\\d{2}"))) {
            row =seatNumber.charAt(0)-'A';
            column = Integer.parseInt(seatNumber.substring(1));
        } else {
            System.out.println("lathos aritmos thesis");
            return false;
        }
        return (((row >=0 && row<this.rows) && (column >=1) && column <= seatsPerRow) && (seats[row][column-1].cancel()));
    }

    /**
     *  ektyponei ta setsNumber kai -r an h thesh einai reserved allios -NR
     */
    @Override
    public void printSeats() {
        System.out.println(this.getTheaterName().toUpperCase());
        for (Seat[] row:seats) {
            for(Seat column:row) {
                System.out.printf("%s%s",column.getSeatNumber(),(column.isReserved() ? "-R " : " -NR "));
            }
            System.out.println();
        }
    }

    private static class Seat implements ISeat {
        private String seatNumber;
        private boolean reserved;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
            //reserved=false
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public void setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

        public void setReserved(boolean reserved) {
            this.reserved = reserved;
        }

        @Override
        public boolean reserve() throws IsReservedException {
            if (!isReserved()) {
                setReserved(true);
                return true;
            } else {
                throw new IsReservedException();
            }
        }

        @Override
        public boolean cancel() throws IsNotReservedException {
            if (isReserved()) {
                setReserved(false);
                return true;
            } else {
                throw new IsNotReservedException();
            }
        }
    }

}