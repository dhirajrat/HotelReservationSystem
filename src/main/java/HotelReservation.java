import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

    private List<Hotel> hotelList;

    /**
     *
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
        System.out.println("");
    }
}
