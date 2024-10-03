import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> Bookings;


    public BookingManager() {
        Bookings = new ArrayList<>();
    }

    public List<Booking> getBookings() {
        return Bookings;
    }

    public void setBookings(List<Booking> bookings) {
        Bookings = bookings;
    }

    public String BookingsInfo(){
        String res = "";

        for (Booking booking: Bookings) {
            res = res.concat(  " [Pokoj: " + booking.getRoom().getRoomNumber());
            res = res.concat(  ", Datum od: " + booking.getDateFrom());
            res = res.concat(  ", Datum do: " + booking.getDateTo());
            for (Guest guest: booking.getGuests()){
                res = res.concat(  " [Host: ");
                res = res.concat(  ", Jmeno: " + guest.getName());
                res = res.concat(  ", Prijmeni: " + guest.getSurname());
                res = res.concat(  "]");
            }
            res =res.concat(  "];");
        }

        return res;
    }
}
