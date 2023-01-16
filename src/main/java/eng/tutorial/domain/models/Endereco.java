package eng.tutorial.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_endereco")
@Entity
public class Endereco extends Modelo{
    private String bairro;
    private String rua;
    private Integer numero;

    @OneToOne
    private Pessoa pessoa;
}
