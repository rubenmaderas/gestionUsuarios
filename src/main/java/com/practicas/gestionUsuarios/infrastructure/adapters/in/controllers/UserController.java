package com.practicas.gestionUsuarios.infrastructure.adapters.in.controllers;

import com.practicas.gestionUsuarios.application.port.in.GetUserById;
import com.practicas.gestionUsuarios.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final GetUserById getUserById;

     @GetMapping("/{id}")
     public ResponseEntity<UserModel> getUserById(@PathVariable Long id) throws Exception {
         return getUserById.getUserById(id)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
     }
}
