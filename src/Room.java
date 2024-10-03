public class Room {
    private Integer roomNumber;
    private Integer numOfBeds;
    private Boolean hasBalcony;
    private Boolean hasSeaView;
    private double priceOneNight;

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(Integer numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public Boolean getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public Boolean getHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(Boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public double getPriceOneNight() {
        return priceOneNight;
    }

    public void setPriceOneNight(double priceOneNight) {
        this.priceOneNight = priceOneNight;
    }

    public Room(Integer roomNumber, Integer numOfBeds, Boolean hasBalcony, Boolean hasSeaView, double priceOneNight) {
        this.roomNumber = roomNumber;
        this.numOfBeds = numOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.priceOneNight = priceOneNight;
    }
}
