import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private Room room;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private Integer typeOfVacation; // 0 - osobni, 1 - pracovni

    public Booking(Room room, LocalDate dateFrom, LocalDate dateTo) {

        this.guests = new ArrayList<>();
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }



    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(Integer typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

}
