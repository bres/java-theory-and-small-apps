package smallApps.theater;

public interface ITheater {
    boolean reservedSeat(String seatNumber) throws IsReservedException;
    boolean cancelReservation (String seatNumber) throws IsNotReservedException;
    void printSeats();
}
