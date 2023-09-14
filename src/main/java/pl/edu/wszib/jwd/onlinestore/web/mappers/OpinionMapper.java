package pl.edu.wszib.jwd.onlinestore.web.mappers;

import org.springframework.stereotype.Component;
import pl.edu.wszib.jwd.onlinestore.data.entities.OpinionEntity;
import pl.edu.wszib.jwd.onlinestore.web.models.OpinionModel;


@Component
public class OpinionMapper {
    public static OpinionEntity toEntity(OpinionModel opinionModel) {
        OpinionEntity opinionEntity = new OpinionEntity();
        opinionEntity.setName(opinionModel.getName());
        opinionEntity.setOpinion(opinionModel.getOpinion());

        return opinionEntity;
    }

    public static OpinionModel toModel(OpinionEntity opinionEntity) {
        OpinionModel opinionModel = new OpinionModel();
        opinionModel.setName(opinionEntity.getName());
        opinionModel.setOpinion(opinionEntity.getOpinion());
        opinionModel.setCreatedAt(opinionEntity.getCreatedAt());

        return opinionModel;
    }
}
