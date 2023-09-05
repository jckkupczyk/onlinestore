package pl.edu.wszib.jwd.onlinestore.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    public BicycleModel getById(Long bicycleId) {
        final var entity = bicycleRepository.findById(bicycleId)
                .orElseThrow(EntityNotFoundException::new);

        return BicycleMapper.toModel(entity);
    }
    @Transactional
    public void deleteById(Long bicycleId) {
        bicycleRepository.deleteById(bicycleId);
    }


    @Transactional
    public void createBicycle(BicycleModel bicycleModel) {
        final var entity = BicycleMapper.toEntity(bicycleModel);

        bicycleRepository.save(entity);
    }

    @Transactional
    public void editBicycle(Long bicycleId, BicycleModel bicycleModel) {
        final var entity = bicycleRepository.findById(bicycleId)
                .orElseThrow(EntityNotFoundException::new);

        entity.setName(bicycleModel.getName());
        entity.setBrand(bicycleModel.getBrand());
        entity.setPrice(bicycleModel.getPrice());
        entity.setImgUrl(bicycleModel.getImgUrl());
        entity.setQuantity(bicycleModel.getQuantity());

    }

}
