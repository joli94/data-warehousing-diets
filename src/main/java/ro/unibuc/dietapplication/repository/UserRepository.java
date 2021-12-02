package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    List<User> findByCityId(Long id);
}
