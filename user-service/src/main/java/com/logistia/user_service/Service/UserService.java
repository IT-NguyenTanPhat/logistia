package com.logistia.user_service.Service;

import com.logistia.user_service.Model.Authority;
import com.logistia.user_service.Model.Role;
import com.logistia.user_service.Model.User;
import com.logistia.user_service.Repository.AuthorityRepository;
import com.logistia.user_service.Repository.RoleRepository;
import com.logistia.user_service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service


public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AuthorityRepository authorityRepository;
    public Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }
    public User getUser(long id) throws UsernameNotFoundException {
        return userRepository
                .findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("user"));
    }
    public User update(User user) {
        return userRepository.save(user);
    }

    public Role update(Role role) {
        return roleRepository.save(role);
    }

    public User loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException(username);
        return user;
    }

    public void setRoles(User user, String roleName) throws RoleNotFoundException {
      Role  role =roleRepository.findByName(roleName);
      if(role==null) throw new RoleNotFoundException(roleName);
      user.setRole(role);

    }

    public void setAuthorities(Role role, List<Authority> authorities) {
        role.setAuthorities(authorities);
    }
}
