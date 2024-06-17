package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.controllers;

import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.domains.Fruit;
import cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.services.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
    private FruitService fruitService;

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("token", "token-value");

        return headers;
    }

    @PostMapping("/add")
    public ResponseEntity<List<Fruit>> addFruits(@RequestBody List<Fruit> fruits) {
        try {
            List<Fruit> addedFruits = fruitService.addFruits(fruits);
            return new ResponseEntity<>(addedFruits, createHeaders(), HttpStatus.CREATED);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable String id, @RequestBody Fruit fruit) {
        try {
            Fruit updatedFruit = fruitService.updateFruit(id, fruit);

            if (updatedFruit == null) return ResponseEntity.notFound().build();

            return ResponseEntity.ok(updatedFruit);

        } catch (Exception e) {
            log.error("Error updating fruit: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        try {
            boolean isDeleted = fruitService.deleteFruit(id);
            if (!isDeleted) return ResponseEntity.notFound().build();

            return ResponseEntity.noContent().build();

        } catch (Exception e) {
            log.error("Error deleting fruit: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        try {
            Iterable<Fruit> fruitIterable = fruitService.getAllFruits();

            List<Fruit> fruits = StreamSupport.stream(fruitIterable.spliterator(), false)
                    .collect(Collectors.toList());

            return ResponseEntity.ok(fruits);

        } catch (Exception e) {
            log.error("Error getting all fruits: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable String id) {
        try {
            Optional<Fruit> fruit = fruitService.getFruitById(id);
            return fruit.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

        } catch (Exception e) {
            log.error("Error getting fruit by ID: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}