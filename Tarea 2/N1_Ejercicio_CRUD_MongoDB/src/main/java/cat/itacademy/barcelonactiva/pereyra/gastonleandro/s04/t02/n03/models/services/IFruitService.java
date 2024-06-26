package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.services;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.domains.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFruitService {

    List<Fruit> addFruits(List<Fruit> fruits);

    Fruit updateFruit(String id, Fruit fruit);

    void deleteFruit(String id);

    Iterable<Fruit> getAllFruits();

    Optional<Fruit> getFruitById(String id);
}

