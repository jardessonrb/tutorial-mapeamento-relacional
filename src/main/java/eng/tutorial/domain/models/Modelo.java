package eng.tutorial.domain.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class Modelo implements Serializable {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private Long id;

    @CreatedDate
    private LocalDateTime dataCriacao;

    @Version
    private Long versao;
}
