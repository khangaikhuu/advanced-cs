package mn.asu.teamBread.repository;

import mn.asu.teamBread.entity.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository  extends CrudRepository<Word, Long> {
    List<Word> findByName(String name);
}
