package br.tom.impl;

import br.tom.exceptions.ValidacaoException;
import br.tom.interfaces.ReajusteValidacao;
import br.tom.models.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RegraPorcentagem implements ReajusteValidacao {
    @Override
    public void validar(Funcionario funcionario, BigDecimal valorReajuste) {
        BigDecimal percentualReajuste = valorReajuste.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste não pode ser superior a 40%");
        }
    }
}
