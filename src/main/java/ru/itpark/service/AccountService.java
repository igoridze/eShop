package ru.itpark.service;


import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService
        extends UserDetailsService {

    boolean isAuthenticated();

    boolean hasRole(String authority);

}

