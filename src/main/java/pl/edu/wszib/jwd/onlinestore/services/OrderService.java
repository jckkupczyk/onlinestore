package pl.edu.wszib.jwd.onlinestore.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.wszib.jwd.onlinestore.data.entities.BicycleEntity;
import pl.edu.wszib.jwd.onlinestore.data.entities.OrderAddressEntity;
import pl.edu.wszib.jwd.onlinestore.data.entities.OrderEntity;
import pl.edu.wszib.jwd.onlinestore.data.repositories.BicycleRepository;
import pl.edu.wszib.jwd.onlinestore.data.repositories.OrderRepository;
import pl.edu.wszib.jwd.onlinestore.web.mappers.OrderAddressMapper;
import pl.edu.wszib.jwd.onlinestore.web.models.OrderAddressModel;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final BicycleRepository bicycleRepository;

    public OrderService(OrderRepository orderRepository, BicycleRepository bicycleRepository) {
        this.orderRepository = orderRepository;
        this.bicycleRepository = bicycleRepository;
    }

    @Transactional
    public Long saveOrder(Long bicycleId, OrderAddressModel orderAddressModel)
    {

        BicycleEntity bicycleEntity = bicycleRepository.findById(bicycleId)
                .orElseThrow(
                        EntityNotFoundException::new);
        OrderAddressEntity orderAddressEntity = OrderAddressMapper.toEntity(orderAddressModel);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBicycleName(bicycleEntity.getName());
        orderEntity.setOrderAddress(orderAddressEntity);
        orderEntity.setPrice(bicycleEntity.getPrice());

        final var savedOrder = orderRepository.save(orderEntity);

        return savedOrder.getId();



    }
}
