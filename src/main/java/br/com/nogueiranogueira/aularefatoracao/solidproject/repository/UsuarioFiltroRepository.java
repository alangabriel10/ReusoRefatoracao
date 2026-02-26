package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import java.util.List;

public interface UsuarioFiltroRepository {

    List<Usuario> buscarPorFiltro(String nome, String email);
}