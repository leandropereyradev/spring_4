package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.services;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.domains.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFruitService {

    List<Fruit> addFruits(List<Fruit> fruits);

    Fruit updateFruit(int id, Fruit fruit);

    void deleteFruit(int id);

    Iterable<Fruit> getAllFruits();

    Optional<Fruit> getFruitById(int id);
}

