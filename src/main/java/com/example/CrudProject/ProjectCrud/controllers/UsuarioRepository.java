package com.example.CrudProject.ProjectCrud.controllers;

import com.example.CrudProject.ProjectCrud.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long> {
}
