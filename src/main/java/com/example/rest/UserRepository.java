package com.example.rest;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    Map<String, List<Authorities>> baseAuth = new HashMap<>();

    public UserRepository() {

        baseAuth.put("Nika 321", List.of(Authorities.values()));
        baseAuth.put("Jora 123", List.of(Authorities.READ, Authorities.WRITE));
        baseAuth.put("Lola password", List.of(Authorities.READ));

    }

    public List<Authorities> getUserAuthorities(String user, String password) {

        String identificationParam = user + " " + password;
        return baseAuth.containsKey(identificationParam) ? baseAuth.get(identificationParam) : null;
    }
}