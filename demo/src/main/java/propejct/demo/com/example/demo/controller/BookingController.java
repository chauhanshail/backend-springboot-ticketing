package propejct.demo.com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import propejct.demo.com.example.demo.model.Booking;
import propejct.demo.com.example.demo.service.BookingService;
import java.util.List;
@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/add")
    public String add(@RequestBody Booking booking){
        bookingService.saveBooking(booking);
        return "New booking has been added";
    }

    @GetMapping("getAllBooking")
        public List<Booking> getAllBooking(){
        return bookingService.getAllBooking();
    }

}
