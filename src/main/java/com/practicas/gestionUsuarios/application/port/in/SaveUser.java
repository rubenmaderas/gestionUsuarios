package com.practicas.gestionUsuarios.application.port.in;

import com.practicas.gestionUsuarios.domain.model.UserModel;

public interface SaveUser {

    /**
     * Saves a user model to the data store.
     *
     * @param userModel the user model to save
     * @return the saved user model
     * @throws Exception if an error occurs during saving
     */
    UserModel save(UserModel userModel) throws Exception;
}
