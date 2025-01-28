package propejct.demo.com.example.demo.service;
import propejct.demo.com.example.demo.model.Booking;

import java.util.List;

public interface BookingService {
    public Booking saveBooking(Booking booking);
    public List<Booking> getAllBooking();

}
