package com.practicas.gestionUsuarios.infraestructure.rest.controller;

import com.practicas.gestionUsuarios.application.usecase.ICreateUserUseCase;
import com.practicas.gestionUsuarios.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("hexagonal/users")
public class UserRestController {

    private final ICreateUserUseCase iCreateUserUseCase;

    @PostMapping("/user")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel) throws Exception {
        UserModel createdUser = iCreateUserUseCase.createUser(userModel);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
