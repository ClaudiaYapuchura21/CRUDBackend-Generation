package com.farmacia10.farmacia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia10.farmacia.model.Usuario;

//Construção da comunicação da API com a base de dados
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {	
	public Optional<Usuario> findByUsuario(String usuario);
}
