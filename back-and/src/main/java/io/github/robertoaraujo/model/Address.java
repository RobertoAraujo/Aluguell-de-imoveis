package io.github.robertoaraujo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "endereco")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idendereco")
    private Long id;
    @Column(name = "rua")
    private String street;
    @Column(name = "bairro")
    private String district;
    @Column(name = "cidade")
    private String city;
    @Column(name = "uf", columnDefinition = "CHAR")
    private String state;
    @Column(name = "cep")
    private String zipCode;
    @Column(name = "complemento")
    private String complement;
    @Column(name = "numero_conjunto")
    private String jointNumber;
}
