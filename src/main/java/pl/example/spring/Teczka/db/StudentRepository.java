package pl.example.spring.Teczka.db;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository  extends CrudRepository<StudentRow,Long>
{

}
