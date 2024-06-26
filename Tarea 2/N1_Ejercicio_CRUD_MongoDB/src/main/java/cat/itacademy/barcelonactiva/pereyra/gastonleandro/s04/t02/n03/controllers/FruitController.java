package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.controllers;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.domains.Fruit;
import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.services.FruitServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/fruit")
@Slf4j
public class FruitController {

    @Autowired
    private FruitServiceImpl fruitService;

    @PostMapping("/add")
    public ResponseEntity<List<Fruit>> addFruits(@RequestBody List<Fruit> fruits) {
        List<Fruit> addedFruits = fruitService.addFruits(fruits);

        return ResponseEntity.ok(addedFruits);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable String id, @RequestBody Fruit fruit) {
        Fruit updatedFruit = fruitService.updateFruit(id, fruit);

        return ResponseEntity.ok(updatedFruit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        fruitService.deleteFruit(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        Iterable<Fruit> fruitIterable = fruitService.getAllFruits();

        List<Fruit> fruits = StreamSupport.stream(fruitIterable.spliterator(), false)
                .collect(Collectors.toList());

        return ResponseEntity.ok(fruits);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable String id) {
        Optional<Fruit> fruit = fruitService.getFruitById(id);

        return fruit.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}