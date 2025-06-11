package com.practicas.gestionUsuarios.infrastructure.adapters.out.rest;

import com.practicas.gestionUsuarios.domain.model.UserModel;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JsonPlaceholderUserClient {


    private final RestTemplate restTemplate = new RestTemplate();

    public UserModel getUserById(Long id) {
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        return restTemplate.getForObject(url, UserModel.class);
    }
}
