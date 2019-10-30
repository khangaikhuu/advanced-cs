package mn.asu.crud.team2.repository;

import mn.asu.crud.team2.entity.ValueCreationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValueCreationRepository xtends CrudRepository<ValueCreationEntity, Long> {
    List<ValueCreationEntity> findByName(String name);
}