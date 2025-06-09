package com.practicas.gestionUsuarios.infraestructure.database.h2.adapter;

import com.practicas.gestionUsuarios.domain.model.UserModel;
import com.practicas.gestionUsuarios.domain.repository.UserRepositoryPort;
import com.practicas.gestionUsuarios.infraestructure.database.h2.entity.UserEntity;
import com.practicas.gestionUsuarios.infraestructure.database.h2.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;


    @Override
    public UserModel save(UserModel userModel) throws Exception {

        // Convert UserModel to UserEntity
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userModel.getId());
        userEntity.setUsername(userModel.getUsername());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setPassword(userModel.getPassword());

        UserEntity pepe = userJpaRepository.save(userEntity);

        UserModel savedUserModel = new UserModel();
        savedUserModel.setId(pepe.getId());
        savedUserModel.setUsername(pepe.getUsername());
        savedUserModel.setEmail(pepe.getEmail());
        savedUserModel.setPassword(pepe.getPassword());

        return savedUserModel;
    }
}
