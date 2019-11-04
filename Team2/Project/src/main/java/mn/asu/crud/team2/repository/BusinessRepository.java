package mn.asu.crud.team2.repository;

import mn.asu.crud.team2.entity.BusinessEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessRepository extends CrudRepository<BusinessEntity, Long> {
}