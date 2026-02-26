package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioComumRegra implements RegraUsuario {

    @Override
    public boolean aceita(String tipo) {
        return "COMUM".equals(tipo);
    }

    @Override
    public Usuario criar(UsuarioDTO dto) {
        return new Usuario(dto.nome(), dto.email(), "COMUM");
    }
}