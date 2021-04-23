package br.com.repository;

import br.com.model.Peca;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecaRepository extends MongoRepository<Peca, String> {
}
