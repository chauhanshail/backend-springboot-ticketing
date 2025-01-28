package propejct.demo.com.example.demo.repository;

import propejct.demo.com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find by email to facilitate login
    Optional<User> findByEmail(String email);

}
