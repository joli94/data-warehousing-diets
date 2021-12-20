package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.User;
import ro.unibuc.dietapplication.repository.UserRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findByCityId(Long id) { return userRepository.findByCityId(id); }

    public boolean existsByUsername(String username) { return userRepository.existsByUsername(username); }

    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The user with this id doesn't exist in the database!")
        );
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User update(User user){
        if(userRepository.existsById(user.getId())){
            return userRepository.save(user);
        } else {
            throw new EntityNotFoundException(String.format("There is no user with id=%s in the database!", user.getId().toString()));
        }
    }
}
