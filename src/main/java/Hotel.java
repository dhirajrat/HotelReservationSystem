public class Hotel {
    String hotelName;
    int ratesForRegularCustomer;

    /**
     * Constructor For Hotel
     * @param hotelName
     * @param ratesForRegularCustomer
     */
    public Hotel(String hotelName, int ratesForRegularCustomer) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRatesForRegularCustomer() {
        return ratesForRegularCustomer;
    }

    public void setRatesForRegularCustomer(int ratesForRegularCustomer) {
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }
}
