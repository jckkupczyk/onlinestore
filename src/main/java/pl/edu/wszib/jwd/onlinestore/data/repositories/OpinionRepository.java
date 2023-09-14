package pl.edu.wszib.jwd.onlinestore.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwd.onlinestore.data.entities.OpinionEntity;

@Repository
public interface OpinionRepository extends JpaRepository<OpinionEntity, Long> {
}

