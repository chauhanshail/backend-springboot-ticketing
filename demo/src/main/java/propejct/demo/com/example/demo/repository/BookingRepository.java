package propejct.demo.com.example.demo.repository;
import propejct.demo.com.example.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
