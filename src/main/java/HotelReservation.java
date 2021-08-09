import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

    private List<Hotel> hotelList;

    /**
     * Creating New HotelList Of Hotels when Hotel Reservation call
     */
    public HotelReservation() {
        this.hotelList = new ArrayList<>();
    }

    /**
     * add Hotel Method
     * @param hotel
     */
    public void add(Hotel hotel) {
        this.hotelList.add(hotel);
        System.out.println("Hotel "+hotel.hotelName+" Added");
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
