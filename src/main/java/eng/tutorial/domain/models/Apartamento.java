package eng.tutorial.domain.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_apartamento")
@Entity
public class Apartamento extends Modelo {
    private String nomePredio;
    private Integer numero;

    @ManyToMany(mappedBy = "apartamentos")
    private List<Pessoa> proprietarios;
}
