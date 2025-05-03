package io.github.robertoaraujo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "apartamento")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idapartamento")
    private Long id;
    @Column(name = "numero")
    private String number;
    @ManyToOne
    @JoinColumn(name = "fk_cliente", referencedColumnName = "idcliente")
    private Client client;
    @OneToOne
    @JoinColumn(name = "fk_endereco_funcionario", referencedColumnName = "idendereco")
    @JsonManagedReference
    private Address address;
}
