package com.practicas.gestionUsuarios.domain.repository;

import com.practicas.gestionUsuarios.domain.model.UserModel;

public interface UserRepositoryPort {

    UserModel save(UserModel userModel) throws Exception;
}
