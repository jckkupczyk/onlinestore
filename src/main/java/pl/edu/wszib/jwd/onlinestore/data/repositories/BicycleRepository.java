package pl.edu.wszib.jwd.onlinestore.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.onlinestore.data.entities.BicycleEntity;

@Repository
public interface BicycleRepository extends JpaRepository<BicycleEntity, Long> {
}
