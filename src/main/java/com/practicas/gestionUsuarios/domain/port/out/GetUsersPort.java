package com.practicas.gestionUsuarios.domain.port.out;

import com.practicas.gestionUsuarios.domain.model.UserModel;

import java.util.Optional;

/**
 * Esta interfaz define el puerto de salida para obtener usuarios.
 * Es decir, es la interfaz que se implementará para acceder a los datos de los usuarios.
 *
 */
public interface GetUsersPort {

    /**
     * Método para obtener un usuario por su ID.
     *
     * @param id El ID del usuario a buscar.
     * @return Un Optional que contiene el UserModel si se encuentra, o vacío si no se encuentra.
     * @throws Exception Si ocurre algún error al intentar obtener el usuario.
     */
    Optional<UserModel> getUserById(Long id) throws Exception;
}
