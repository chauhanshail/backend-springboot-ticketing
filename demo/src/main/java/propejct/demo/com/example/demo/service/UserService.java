package propejct.demo.com.example.demo.service;

import propejct.demo.com.example.demo.model.User;
import java.util.Optional;
public interface UserService {
    /**
     * Sign up a new user.
     *
     * @param user The user object from the request
     * @return The saved user
     */
    User signUpUser(User user);

    /**
     * Login a user by checking email and password.
     *
     * @param email    user's email
     * @param password user's password
     * @return An Optional containing the matching User if found, otherwise empty
     */
    Optional<User> loginUser(String email, String password);

    /**
     * Retrieve user by ID.
     *
     * @param userId The ID of the user
     * @return An Optional containing the User if found
     */
    Optional<User> getUserById(Long userId);
}
