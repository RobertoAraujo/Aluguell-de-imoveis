package io.github.robertoaraujo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name = "roles")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrole")
    private Long id;

    @Column(name = "nome")
    private String name; // Ex: ADMIN, USER

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_permissoes",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permissao_id")
    )
    private Set<Permission> permissions;
}

