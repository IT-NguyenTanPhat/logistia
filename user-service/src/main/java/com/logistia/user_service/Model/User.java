package com.logistia.user_service.Model;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import java.util.List;
@Entity
@Table(name="users")
@NoArgsConstructor @Setter @Getter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String status;// active | locked

    private String avatarId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false) // Liên kết với Role
    private Role role;

    @Builder
    public User(Long id, String username, String password, String firstName, String lastName, String status, String avatarId, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.avatarId = avatarId;
        this.role = role; // Gán role vào đây
    }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



}
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<Authority> authorities = new ArrayList<>();
//
//        authorities.addAll(role.getAuthorities());
//
//        return (Collection<? extends GrantedAuthority>) authorities;
//    }


