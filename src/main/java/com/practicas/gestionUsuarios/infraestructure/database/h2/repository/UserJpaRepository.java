package com.practicas.gestionUsuarios.infraestructure.database.h2.repository;

import com.practicas.gestionUsuarios.infraestructure.database.h2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

}