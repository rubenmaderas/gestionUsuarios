package com.practicas.gestionUsuarios.infrastructure.adapters.out.persistence.h2.repository;

import com.practicas.gestionUsuarios.infrastructure.adapters.out.persistence.h2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersReporsitory extends JpaRepository<UserEntity, Long> {

}
