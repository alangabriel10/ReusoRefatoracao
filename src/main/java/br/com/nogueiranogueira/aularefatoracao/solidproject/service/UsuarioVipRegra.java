package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioVipRegra implements RegraUsuario {

    @Override
    public boolean aceita(String tipo) {
        return "VIP".equals(tipo);
    }

    @Override
    public Usuario criar(UsuarioDTO dto) {
        if (dto.idade() < 18) {
            throw new IllegalArgumentException("Usuário VIP deve ser maior de idade");
        }
        return new Usuario(dto.nome(), dto.email(), "VIP");
    }
}