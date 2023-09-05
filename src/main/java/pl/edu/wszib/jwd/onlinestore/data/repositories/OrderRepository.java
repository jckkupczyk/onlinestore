package pl.edu.wszib.jwd.onlinestore.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.jwd.onlinestore.data.entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}

