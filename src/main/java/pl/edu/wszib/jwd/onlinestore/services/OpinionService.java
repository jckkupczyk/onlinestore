package pl.edu.wszib.jwd.onlinestore.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwd.onlinestore.data.entities.OpinionEntity;
import pl.edu.wszib.jwd.onlinestore.data.repositories.OpinionRepository;
import pl.edu.wszib.jwd.onlinestore.web.mappers.OpinionMapper;
import pl.edu.wszib.jwd.onlinestore.web.models.OpinionModel;

import java.util.List;

@Service
public class OpinionService {

    private final OpinionRepository opinionRepository;
    private final OpinionMapper opinionMapper;


    public OpinionService(OpinionRepository opinionRepository, OpinionMapper opinionMapper) {
        this.opinionRepository = opinionRepository;
        this.opinionMapper = opinionMapper;
    }


    public List<OpinionModel> findAll(){
        List<OpinionEntity>  entities = opinionRepository.findAll();

        return entities.stream()
                .map(OpinionMapper::toModel)
                .toList();
    }

    @Transactional
    public void newOpinion(OpinionModel opinionModel) {

        OpinionEntity opinionEntity = opinionMapper.toEntity(opinionModel);
        opinionRepository.save(opinionEntity);

    }

    public OpinionModel getById(Long opinionId) {
        OpinionEntity opinionEntity = opinionRepository.findById(opinionId).orElseThrow(EntityNotFoundException::new);
        return OpinionMapper.toModel(opinionEntity);
    }


}