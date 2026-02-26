package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenciadorUsuarioService {

    private final List<RegraUsuario> regras;
    private final UsuarioRepository repository;
    private final EmailService emailService;

    public GerenciadorUsuarioService(
            List<RegraUsuario> regras,
            UsuarioRepository repository,
            EmailService emailService) {
        this.regras = regras;
        this.repository = repository;
        this.emailService = emailService;
    }

    public void criarUsuario(UsuarioDTO dto) {
        RegraUsuario regra = regras.stream()
                .filter(r -> r.aceita(dto.tipo()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo inválido"));

        Usuario usuario = regra.criar(dto);
        repository.save(usuario);
        emailService.enviarBoasVindas(usuario.getEmail());
    }
}