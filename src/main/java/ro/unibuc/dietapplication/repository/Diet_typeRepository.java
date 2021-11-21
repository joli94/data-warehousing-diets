package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Diet_type;

public interface Diet_typeRepository extends JpaRepository <Diet_type, Long> {
}
