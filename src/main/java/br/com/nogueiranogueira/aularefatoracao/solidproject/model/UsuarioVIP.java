package br.com.nogueiranogueira.aularefatoracao.solidproject.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VIP")
public class UsuarioVIP extends Usuario {

    private boolean temCartaoFidelidade;

    public boolean isTemCartaoFidelidade() {
        return temCartaoFidelidade;
    }

    public void setTemCartaoFidelidade(boolean temCartaoFidelidade) {
        this.temCartaoFidelidade = temCartaoFidelidade;
    }

    @Override
    public int getDesconto() {
        return temCartaoFidelidade ? 10 : 0;
    }
}