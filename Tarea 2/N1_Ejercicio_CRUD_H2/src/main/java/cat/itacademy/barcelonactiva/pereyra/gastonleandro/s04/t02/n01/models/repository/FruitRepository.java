package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n01.models.repository;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n01.models.domains.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
