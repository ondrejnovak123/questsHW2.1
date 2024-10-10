import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> bookingList;


    public BookingManager() {
        bookingList = new ArrayList<>();
    }

    public void addBooking(Booking aBooking){
        bookingList.add(aBooking);
    }

    public Object getBooking(int aIndex){
       return bookingList.get(aIndex);
    }

    public List<Booking> getBookings(){
      return bookingList;
    }

    public int getNumberOfWorkingBookings(){
        int pocet = 0;
        for (int i = 0; i < bookingList.size(); i++) {
            if (bookingList.get(i).getTypeOfVacation() == 1)  {
                pocet++;
            }
       }
        return pocet;
    }

    public String printGuestStatistics(){
      int a = 0;
      int b = 0;
      int c = 0;
        for (int i = 0; i < bookingList.size(); i++) {
            switch (bookingList.get(i).getGuests().size()){
                case 0: break;
                case 1: { a++;}
                case 2: { b++;}
                default: { c++;}
            }

        }
        return ("Rezervace 1 host: " + a + "," +
                "Rezervace 2 hoste: " + b + "," +
                "Rezervace 2+ hoste: " + c + ",");
    }

    public int getGuestsCount(Booking aBooking){
        return aBooking.getGuests().size();
    }

    public int getAverageGuests(){
        if (bookingList.isEmpty())  { return -1;}

        int celkpocet = 0;
        for (int i = 0; i < bookingList.size(); i++) {
            celkpocet = getGuestsCount(bookingList.get(i));
        }

        return celkpocet / bookingList.size();
    }

    public List<Booking> getTopNHolidayBookings(){
        List<Booking> tempBooking = new ArrayList<>();
        for (int i = 0; i < bookingList.size(); i++) {
           if (bookingList.get(i).getTypeOfVacation() == 0)  {
             tempBooking.add(bookingList.get(i));
           }
        }
        return tempBooking;
    }

    public void clearBookings(){
      bookingList.clear();
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public String BookingsInfo(){
        String res = "";

        for (Booking booking: bookingList) {
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
