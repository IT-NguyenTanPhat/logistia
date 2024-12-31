package com.logistia.user_service.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter @NoArgsConstructor

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;



    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "roles_authorities",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "authority_id", referencedColumnName = "id"))
    private List<Authority> authorities;

    @Builder
    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
        this.authorities = new ArrayList<Authority>();
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
