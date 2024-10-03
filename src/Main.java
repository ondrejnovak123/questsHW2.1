import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvorak", LocalDate.of(1995, 5, 5));
        List<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

        guest2.setDateOfBirth(LocalDate.of(1995, 4, 5));

        System.out.println(guest1.getName() + " " + guest1.getSurname() + " (" + guest1.getDateOfBirth() + ")");
        System.out.println(guest2.getName() + " " + guest2.getSurname() + " (" + guest2.getDateOfBirth() + ")");

        Room room1 = new Room(1, 1, true, true, 1000.0);
        Room room2 = new Room(2, 1, true, true, 1000.0);
        Room room3 = new Room(3, 3, false, true, 2400.0);

        Booking booking1 = new Booking(room1, LocalDate.of(2021,7,19) , LocalDate.of(2021,7,26));
        booking1.getGuests().add(guest1);

        Booking booking2 = new Booking(room3, LocalDate.of(2021,9,1) , LocalDate.of(2021,9,14));
        booking2.getGuests().add(guest1);
        booking2.getGuests().add(guest2);


        BookingManager bookingManager = new BookingManager();
        bookingManager.getBookings().add(booking1);
        bookingManager.getBookings().add(booking2);
        System.out.println("Rezervace: " + bookingManager.BookingsInfo());
    }
}