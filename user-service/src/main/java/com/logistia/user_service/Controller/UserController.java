package com.logistia.user_service.Controller;

import com.logistia.user_service.Model.User;
import com.logistia.user_service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.jetbrains.annotations.NotNull;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return new String("User Service is running!");
    }

    @GetMapping(value = { "", "/" })
    public @NotNull
    Iterable<User> getUsers( ) {
        return userService.getAllUsers();
    }

    @GetMapping(value = {"/{id}"})
    public User getUser(@PathVariable Long id) throws UsernameNotFoundException {
        return userService.getUser(id);
    }
    @GetMapping(value = {"/{username}"})
    public UserDetails loadUserByUsername(@PathVariable String username) throws UsernameNotFoundException {
        return (UserDetails) userService.loadUserByUsername(username);
    }


    
}
