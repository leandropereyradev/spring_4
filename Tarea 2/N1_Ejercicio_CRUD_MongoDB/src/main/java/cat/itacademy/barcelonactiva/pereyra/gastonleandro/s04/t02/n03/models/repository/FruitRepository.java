package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.repository;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.domains.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, String> {
}
