package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.services;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.exceptions.*;
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
        try {
            Optional<Fruit> existingFruit = fruitRepository.findById(id);
            if (existingFruit.isEmpty()) throw new FruitNotFoundException("Fruit with ID " + id + " not found");

            Fruit fruitToUpdate = existingFruit.get();
            fruitToUpdate.setName(fruit.getName());
            fruitToUpdate.setQuantityKilo(fruit.getQuantityKilo());

            return fruitRepository.save(fruitToUpdate);
        } catch (RuntimeException e) {
            throw new FruitUpdateException("Failed to update fruit", e);
        }
    }

    @Override
    @Transactional
    public void deleteFruit(int id) {
        try {
            Optional<Fruit> existingFruit = fruitRepository.findById(id);

            if (existingFruit.isEmpty()) throw new FruitNotFoundException("Fruit with ID " + id + " not found");

            fruitRepository.deleteById(id);

        } catch (RuntimeException e) {
            throw new FruitDeleteException("Failed to delete fruit", e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Fruit> getAllFruits() {
        try {
            return fruitRepository.findAll();

        } catch (RuntimeException e) {
            throw new FruitGetAllException("Failed to retrieve all fruits", e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Fruit> getFruitById(int id) {
        try {
            return fruitRepository.findById(id);

        } catch (RuntimeException e) {
            throw new FruitNotFoundException("Failed to retrieve fruit by ID", e);
        }
    }
}

