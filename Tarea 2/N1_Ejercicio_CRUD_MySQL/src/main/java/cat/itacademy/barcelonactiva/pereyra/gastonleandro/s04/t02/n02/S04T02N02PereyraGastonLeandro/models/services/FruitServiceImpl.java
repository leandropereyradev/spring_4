package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.services;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.exceptions.FruitAddException;
import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.domains.Fruit;
import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements IFruitService {
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    @Transactional
    public List<Fruit> addFruits(List<Fruit> fruits) {
        try {
            List<Fruit> addedFruits = new ArrayList<>();

            for (Fruit fruit : fruits) addedFruits.add(fruitRepository.save(fruit));

            return addedFruits;

        } catch (Exception e) {
            throw new FruitAddException("Failed to add fruits", e);
        }
    }

    @Override
    @Transactional
    public Fruit updateFruit(int id, Fruit fruit) {
        Optional<Fruit> existingFruit = fruitRepository.findById(id);
        if (existingFruit.isEmpty()) throw new FruitNotFoundException("Fruit with ID " + id + " not found");

        Fruit fruitToUpdate = existingFruit.get();
        fruitToUpdate.setName(fruit.getName());
        fruitToUpdate.setQuantityKilo(fruit.getQuantityKilo());

        return fruitRepository.save(fruitToUpdate);
    }

    @Override
    @Transactional
    public void deleteFruit(int id) {
        try {
            Optional<Fruit> existingFruit = fruitRepository.findById(id);

            if (existingFruit.isEmpty()) throw new FruitNotFoundException("Fruit with ID " + id + " not found");

            fruitRepository.deleteById(id);

        } catch (Exception e) {
            System.err.println("Error deleting fruit: " + e.getMessage());
            throw new RuntimeException("Failed to delete fruit", e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Fruit> getAllFruits() {
        try {
            return fruitRepository.findAll();

        } catch (Exception e) {
            System.err.println("Error retrieving all fruits: " + e.getMessage());
            throw new RuntimeException("Failed to retrieve all fruits", e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Fruit> getFruitById(int id) {
        try {
            return fruitRepository.findById(id);

        } catch (Exception e) {
            System.err.println("Error retrieving fruit by ID: " + e.getMessage());
            throw new RuntimeException("Failed to retrieve fruit by ID", e);
        }
    }
}

