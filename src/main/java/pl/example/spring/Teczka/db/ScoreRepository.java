package pl.example.spring.Teczka.db;

import org.springframework.data.repository.CrudRepository;

public interface ScoreRepository extends CrudRepository<ScoreRow, Long> {

}
