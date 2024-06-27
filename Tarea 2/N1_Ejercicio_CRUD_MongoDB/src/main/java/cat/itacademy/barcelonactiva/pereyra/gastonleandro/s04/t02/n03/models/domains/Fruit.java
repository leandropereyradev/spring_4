package cat.itacademy.barcelonactiva.pereyra.gastonleandro.s04.t02.n03.models.domains;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.annotation.Collation;

@Setter
@Getter
@Collation
public class Fruit {
    @Id
    private String id;

    private String name;

    private int quantityKilo;

}

