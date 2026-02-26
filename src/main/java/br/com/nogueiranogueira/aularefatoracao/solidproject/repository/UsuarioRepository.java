package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    long countByTipo(String tipoUsuario);
}