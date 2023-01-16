package eng.tutorial.domain.models;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_pessoa")
@Entity
public class Pessoa extends Modelo {
    private String nome;
    private Integer idade;

    @OneToOne(mappedBy = "pessoa")
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "proprietario_id")
    private List<Carro> carros;

    @ManyToAny(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_contrato_apartamento", 
    joinColumns = {@JoinColumn(foreignKey = @ForeignKey(foreignKeyDefinition = "apartamento_id"))}, 
    inverseJoinColumns = {@JoinColumn(foreignKey = @ForeignKey(foreignKeyDefinition = "pessoa_id"))})
    private List<Apartamento> apartamentos;
}
