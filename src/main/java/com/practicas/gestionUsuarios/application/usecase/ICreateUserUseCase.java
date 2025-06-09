package com.practicas.gestionUsuarios.application.usecase;

import com.practicas.gestionUsuarios.domain.model.UserModel;

public interface ICreateUserUseCase {
    UserModel createUser(UserModel userModel) throws Exception;
}
