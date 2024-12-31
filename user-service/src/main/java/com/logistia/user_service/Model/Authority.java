package com.logistia.user_service.Model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Setter @Getter @NoArgsConstructor

public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    public String getAuthority() {
        return name;
    }

    public Authority(String name) {
        this.name = name;
    }
}
