package com.practicas.gestionUsuarios.application.usecases;

import com.practicas.gestionUsuarios.application.port.in.SaveUser;
import com.practicas.gestionUsuarios.domain.model.UserModel;
import com.practicas.gestionUsuarios.domain.port.out.SaveUsersPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultSaveUser implements SaveUser {

    private final SaveUsersPort saveUsersPort;

    /**
     * Saves a user model to the data store.
     *
     * @param userModel the user model to save
     * @return the saved user model
     * @throws Exception if an error occurs during saving
     */
    @Override
    public UserModel save(UserModel userModel) throws Exception {
        return saveUsersPort.save(userModel);
    }
}
