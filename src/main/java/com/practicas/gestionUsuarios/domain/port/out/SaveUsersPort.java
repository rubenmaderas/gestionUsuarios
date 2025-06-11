package com.practicas.gestionUsuarios.domain.port.out;

import com.practicas.gestionUsuarios.domain.model.UserModel;

public interface SaveUsersPort {

    /**
     * Saves a user model to the data store.
     *
     * @param userModel the user model to save
     * @return the saved user model
     * @throws Exception if an error occurs during saving
     */
    UserModel save(UserModel userModel) throws Exception;
}
