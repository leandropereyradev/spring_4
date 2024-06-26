package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n02.S04T02N02PereyraGastonLeandro.models.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int quantityKilo;

}

