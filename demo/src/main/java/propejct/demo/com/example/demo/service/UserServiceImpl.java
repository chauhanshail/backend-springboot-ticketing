package propejct.demo.com.example.demo.service;

import propejct.demo.com.example.demo.model.User;
import propejct.demo.com.example.demo.repository.UserRepository;
import propejct.demo.com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User signUpUser(User user) {
        // In production, check if a user with the same email exists, etc.
        return userRepository.save(user);
    }

    @Override
    public Optional<User> loginUser(String email, String password) {
        Optional<User> existingUserOpt = userRepository.findByEmail(email);
        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            // Compare hashed passwords in real applications.
            if (existingUser.getPassword().equals(password)) {
                return Optional.of(existingUser);
            }
        }
        return Optional.empty();
    }

    @Override


    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }
}
