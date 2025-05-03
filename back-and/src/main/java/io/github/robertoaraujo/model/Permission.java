package io.github.robertoaraujo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "permissoes")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpermissao")
    private Long id;

    @Column(name = "nome")
    private String name; // Ex: READ_USER, WRITE_USER
}
