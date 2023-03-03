package br.tom.sevices;

import br.tom.exceptions.ValidacaoException;
import br.tom.models.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {
    public void reajusteSalarial(BigDecimal valorReajuste, Funcionario funcionario) {
        BigDecimal percentualReajuste = valorReajuste.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        System.out.println(percentualReajuste);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste não pode ser superior a 40%");
        }
        funcionario.setSalario(funcionario.getSalario().add(valorReajuste));
        funcionario.setDataReajusteSalarial(LocalDate.now());
    }

}
