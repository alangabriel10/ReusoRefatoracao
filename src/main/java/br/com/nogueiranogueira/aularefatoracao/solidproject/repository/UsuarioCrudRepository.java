package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

public interface UsuarioCrudRepository {

    Usuario salvar(Usuario usuario);

    void excluir(Usuario usuario);
}