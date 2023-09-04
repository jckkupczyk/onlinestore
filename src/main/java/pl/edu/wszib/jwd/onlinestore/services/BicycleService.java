package pl.edu.wszib.jwd.onlinestore.services;

import org.springframework.stereotype.Service;
import pl.edu.wszib.jwd.onlinestore.data.entities.BicycleEntity;
import pl.edu.wszib.jwd.onlinestore.data.repositories.BicycleRepository;
import pl.edu.wszib.jwd.onlinestore.web.mappers.BicycleMapper;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;

import java.util.List;

@Service
public class BicycleService {

    private final BicycleRepository bicycleRepository;

    public BicycleService(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    public List<BicycleModel> findAll() {
        List<BicycleEntity> entities = bicycleRepository.findAll();

         return entities.stream()
                 .map(BicycleMapper::toModel)
                 .toList();
    }
}
