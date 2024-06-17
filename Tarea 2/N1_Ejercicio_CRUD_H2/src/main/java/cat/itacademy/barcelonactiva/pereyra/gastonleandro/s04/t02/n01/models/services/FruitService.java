package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n01.models.services;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n01.models.domains.Fruit;
import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n01.models.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    @Transactional
    public List<Fruit> addFruits(List<Fruit> fruits) {
        List<Fruit> addedFruits = new ArrayList<>();

        for (Fruit fruit : fruits) addedFruits.add(fruitRepository.save(fruit));

        return addedFruits;
    }


    @Transactional
    public Fruit updateFruit(int id, Fruit fruit) {
        try {
            Optional<Fruit> existingFruit = fruitRepository.findById(id);
            if (existingFruit.isEmpty()) return null;

            Fruit fruitToUpdate = existingFruit.get();
            fruitToUpdate.setName(fruit.getName());
            fruitToUpdate.setQuantityKilo(fruit.getQuantityKilo());

            return fruitRepository.save(fruitToUpdate);

        } catch (Exception e) {
            System.err.println("Error updating fruit: " + e.getMessage());
            throw new RuntimeException("Failed to update fruit", e);
        }
    }

    @Transactional
    public boolean deleteFruit(int id) {
        try {
            Optional<Fruit> existingFruit = fruitRepository.findById(id);
            if (existingFruit.isEmpty()) return false;

            fruitRepository.deleteById(id);
            return true;

        } catch (Exception e) {
            System.err.println("Error deleting fruit: " + e.getMessage());
            throw new RuntimeException("Failed to delete fruit", e);
        }
    }

    @Transactional(readOnly = true)
    public Iterable<Fruit> getAllFruits() {
        try {
            return fruitRepository.findAll();

        } catch (Exception e) {
            System.err.println("Error retrieving all fruits: " + e.getMessage());
            throw new RuntimeException("Failed to retrieve all fruits", e);
        }
    }

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

