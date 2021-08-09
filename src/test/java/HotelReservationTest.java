import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationTest {

    //Create a hotelList and Added a hotel in a list if Hotel added on both passes the test
    @Test
    public void checkingIfHotelIsAdded(){
        Hotel hotel1 = new Hotel("LakeWood",100);
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(hotel1);

        HotelReservation hotelResSystem1 = new HotelReservation();
        hotelResSystem1.add(hotel1);

        Assertions.assertEquals(hotelList,hotelResSystem1.getHotelList());
    }

    //Create a hotelList and Added a hotel in a list if different Hotel added on both fails the test
    @Test
    public void checkingIfHotelIsAddedNegativeTest(){
        Hotel hotel1 = new Hotel("LakeWood",100);
        Hotel hotel2 = new Hotel("Silver",150);
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(hotel1);

        HotelReservation hotelResSystem1 = new HotelReservation();
        hotelResSystem1.add(hotel2);

        Assertions.assertEquals(hotelList,hotelResSystem1.getHotelList());
    }
}
