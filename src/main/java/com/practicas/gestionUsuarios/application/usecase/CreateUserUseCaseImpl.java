package com.practicas.gestionUsuarios.application.usecase;


import com.practicas.gestionUsuarios.domain.model.UserModel;
import com.practicas.gestionUsuarios.domain.repository.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements ICreateUserUseCase{

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public UserModel createUser(UserModel userModel) throws Exception {
        return userRepositoryPort.save(userModel);
    }
}
