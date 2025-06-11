package com.practicas.gestionUsuarios.application.usecases;

import com.practicas.gestionUsuarios.application.port.in.GetUserById;
import com.practicas.gestionUsuarios.domain.model.UserModel;
import com.practicas.gestionUsuarios.domain.port.out.GetUsersPort;
import com.practicas.gestionUsuarios.domain.port.out.SaveUsersPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultGetUserById implements GetUserById {

    private final GetUsersPort getUsersPort;
    private final SaveUsersPort saveUsersPort;

    @Override
    public Optional<UserModel> getUserById(Long id) throws Exception {

        Optional<UserModel> user = getUsersPort.getUserById(id);
        saveUsersPort.save(user.orElseThrow(() -> new Exception("Cannot save user with id: " + id)));

        return user;
    }
}
