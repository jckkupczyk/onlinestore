package pl.edu.wszib.jwd.onlinestore.web.mappers;

import pl.edu.wszib.jwd.onlinestore.data.entities.BicycleEntity;
import pl.edu.wszib.jwd.onlinestore.web.models.BicycleModel;

public class BicycleMapper {


    public static BicycleModel toModel(BicycleEntity entity) {
        return new BicycleModel(
                entity.getId(),
                entity.getName(),
                entity.getBrand(),
                entity.getPrice(),
                entity.getImgUrl(),
                entity.getQuantity()
        );
    }
}
