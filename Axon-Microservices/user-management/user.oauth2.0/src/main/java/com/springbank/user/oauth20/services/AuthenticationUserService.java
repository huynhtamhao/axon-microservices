package com.springbank.user.oauth20.services;

import com.springbank.user.oauth20.repositories.AuthenticationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class AuthenticationUserService implements UserDetailsService {

    private final AuthenticationUserRepository authenticationUserRepository;

    @Autowired
    public AuthenticationUserService(AuthenticationUserRepository authenticationUserRepository) {
        this.authenticationUserRepository = authenticationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = authenticationUserRepository.findByUsername(username);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Incorrect Username / Password supplied!");
        }

        var account = user.get().getAccount();

        return User
                .withUsername(username)
                .password(account.getPassword())
                .authorities(account.getRoles())
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();
    }
}
