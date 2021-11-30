package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Diet_type;

@Repository
public interface Diet_typeRepository extends JpaRepository <Diet_type, Long> {
}
