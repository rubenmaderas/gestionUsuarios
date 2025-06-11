package com.practicas.gestionUsuarios.infrastructure.adapters.in;

import com.practicas.gestionUsuarios.domain.model.UserModel;
import com.practicas.gestionUsuarios.domain.port.out.GetUsersPort;
import com.practicas.gestionUsuarios.domain.port.out.SaveUsersPort;
import com.practicas.gestionUsuarios.infrastructure.adapters.out.persistence.h2.entity.UserEntity;
import com.practicas.gestionUsuarios.infrastructure.adapters.out.persistence.h2.repository.UsersReporsitory;
import com.practicas.gestionUsuarios.infrastructure.adapters.out.rest.JsonPlaceholderUserClient;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultSaveUsersPort implements SaveUsersPort {

    private final UsersReporsitory usersReporsitory;

    /**
     * Saves a user model to the data store.
     *
     * @param userModel the user model to save
     * @return the saved user model
     * @throws Exception if an error occurs during saving
     */
    @Override
    public UserModel save(UserModel userModel) throws Exception {

        // Validate the user model
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userModel.getId());
        userEntity.setUsername(userModel.getUsername());
        userEntity.setEmail(userModel.getEmail());

        // Save the user entity to the repository
        usersReporsitory.save(userEntity);

        return userModel;
    }
}
