package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import org.springframework.stereotype.Service;

@Service
public class SmtpEmailService implements EmailService {

    @Override
    public void enviarBoasVindas(String email) {
        System.out.println("Enviando e-mail de boas-vindas para: " + email);
    }

    public void sendEmail(String email, String assunto, String mensagem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendEmail'");
    }
}