package io.github.robertoaraujo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity(name = "usuarios")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "sobrenome")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String password;
    @OneToOne
    @JoinColumn(name = "fk_endereco_user", referencedColumnName = "idendereco")
    private Address address;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Phone> phones;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_roles",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;
}