package br.tom.impl;

import br.tom.exceptions.ValidacaoException;
import br.tom.interfaces.ReajusteValidacao;
import br.tom.models.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class RegraPeriodicidade implements ReajusteValidacao {
    @Override
    public void validar(Funcionario funcionario, BigDecimal valorReajuste) {
        Period period = Period.between(funcionario.getDataReajusteSalarial(), LocalDate.now());
        if (period.getMonths() < 6) {
            int aptoEm = 6 - period.getMonths();
            throw new ValidacaoException(String
                    .format("Reajuste não pode ser aplicado em uma marge de tempo inferior a 6 meses.\n Faltam %d mes(es) " +
                            "para o funcionario: %s está apto a um aumento", aptoEm, funcionario.getNome()));
        }
    }
}
