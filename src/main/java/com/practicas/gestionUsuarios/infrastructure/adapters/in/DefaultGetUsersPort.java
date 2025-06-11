package com.practicas.gestionUsuarios.infrastructure.adapters.in;

import com.practicas.gestionUsuarios.domain.model.UserModel;
import com.practicas.gestionUsuarios.domain.port.out.GetUsersPort;
import com.practicas.gestionUsuarios.infrastructure.adapters.out.rest.JsonPlaceholderUserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultGetUsersPort implements GetUsersPort {

    private final JsonPlaceholderUserClient jsonPlaceholderUserClient;
    /**
     * Método para obtener un usuario por su ID.
     *
     * @param id El ID del usuario a buscar.
     * @return Un Optional que contiene el UserModel si se encuentra, o vacío si no se encuentra.
     * @throws Exception Si ocurre algún error al intentar obtener el usuario.
     */
    @Override
    public Optional<UserModel> getUserById(Long id) throws Exception {
        return Optional.ofNullable(Optional.of(jsonPlaceholderUserClient.getUserById(id))
                .orElseThrow(() -> new Exception("User not found with id: " + id)));
    }
}
