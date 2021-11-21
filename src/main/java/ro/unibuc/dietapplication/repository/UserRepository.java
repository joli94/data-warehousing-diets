package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.User;

public interface UserRepository extends JpaRepository <User, Long> {
}
