package pl.example.spring.Teczka.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface StudentRepository extends CrudRepository<StudentRow,Long>
{

}
