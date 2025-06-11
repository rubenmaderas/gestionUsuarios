package com.practicas.gestionUsuarios.application.port.in;

import com.practicas.gestionUsuarios.domain.model.UserModel;

import java.util.Optional;

public interface GetUserById {

    Optional<UserModel> getUserById(Long id) throws Exception;
}
