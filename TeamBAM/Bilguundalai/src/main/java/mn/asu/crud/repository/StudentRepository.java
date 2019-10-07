package mn.asu.crud.repository;

import java.util.List;

import mn.asu.crud.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository <Student, Long> {
    List<Student> findByName(String name);
}