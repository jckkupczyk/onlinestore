package pl.edu.wszib.jwd.onlinestore.web.mappers;

import pl.edu.wszib.jwd.onlinestore.data.entities.BicycleEntity;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;

public class BicycleMapper {


    public static BicycleModel toModel(BicycleEntity entity) {
        return new BicycleModel(entity.getId(), entity.getName(), entity.getBrand(), entity.getPrice(), entity.getImgUrl(), entity.getQuantity(), entity.getColor(), entity.getWeight(), entity.getFrameSize(), entity.getWheelSize(), entity.getNumberOfGears(), entity.getSpecificationUrl());
    }

    public static BicycleEntity toEntity(BicycleModel model) {
        final var entity = new BicycleEntity();

        entity.setName(model.getName());
        entity.setBrand(model.getBrand());
        entity.setPrice(model.getPrice());
        entity.setImgUrl(model.getImgUrl());
        entity.setQuantity(model.getQuantity());
        entity.setColor(model.getColor());
        entity.setWeight(model.getWeight());
        entity.setFrameSize(model.getFrameSize());
        entity.setWheelSize(model.getWheelSize());
        entity.setNumberOfGears(model.getNumberOfGears());
        entity.setSpecificationUrl(model.getSpecificationUrl());

        return entity;
    }
}
