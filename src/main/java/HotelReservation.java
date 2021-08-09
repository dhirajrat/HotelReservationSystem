import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

    private List<Hotel> hotelList;

    /**
     * con
     * @param hotelList
     */
    public HotelReservation(List<Hotel> hotelList) {
        this.hotelList = new ArrayList<>();
    }

    /**
     * add Hotel Method
     * @param hotel
     */
    public void add(Hotel hotel) {
        this.hotelList.add(hotel);
    }
}
