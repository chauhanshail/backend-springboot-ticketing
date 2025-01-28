package propejct.demo.com.example.demo.controller;

import propejct.demo.com.example.demo.model.User;
import propejct.demo.com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * POST endpoint to sign up a user.
     * URL: POST /api/users/signup
     */
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        // In production, add validations and handle exceptions
        User savedUser = userService.signUpUser(user);
        return ResponseEntity.ok(savedUser);
    }

    /**
     * POST endpoint to login a user.
     * URL: POST /api/users/login
     */
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        Optional<User> userOpt = userService.loginUser(user.getEmail(), user.getPassword());
        if (userOpt.isPresent()) {
            return ResponseEntity.ok(userOpt.get());
        } else {
            return ResponseEntity
                    .status(401)  // Unauthorized
                    .body("Invalid email or password");
        }
    }

    /**
     * GET endpoint to retrieve user by ID.
     * URL: GET /api/users/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long id) {
        Optional<User> userOpt = userService.getUserById(id);
        if (userOpt.isPresent()) {
            return ResponseEntity.ok(userOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
