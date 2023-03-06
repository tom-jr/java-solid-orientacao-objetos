package br.tom.interfaces;

import br.tom.models.Funcionario;

import java.math.BigDecimal;

public interface ReajusteValidacao {

    void validar(Funcionario funcionario, BigDecimal valorReajuste);
}
