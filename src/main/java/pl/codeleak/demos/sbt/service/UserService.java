package pl.codeleak.demos.sbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codeleak.demos.sbt.model.Users;
import pl.codeleak.demos.sbt.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(Users user) {
        user.setRole(1); // Gán vai trò mặc định (1: USER)
        userRepository.save(user);
    }
}
