package propejct.demo.com.example.demo.model;
import jakarta.persistence.*;
@Entity
@Table(name = "users")  // name of the table in DB
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;        // Primary key, generated automatically

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;
    private String password;

    // Constructors
    public User() {
    }

    public User(String firstName, String lastName, String contactNumber, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters (you can use Lombok @Data or @Getter/@Setter if you prefer)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // WARNING: Never store or transmit raw passwords in production
    // Always use a secure hashing algorithm (e.g., BCrypt) and store only hashes
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
