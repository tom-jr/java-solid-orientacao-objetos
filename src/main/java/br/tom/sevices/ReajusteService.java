package br.tom.sevices;

import br.tom.exceptions.ValidacaoException;
import br.tom.models.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class ReajusteService {
    public void reajusteSalarial(BigDecimal valorReajuste, Funcionario funcionario) {
        BigDecimal percentualReajuste = valorReajuste.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste não pode ser superior a 40%");
        }


        Period period = Period.between(funcionario.getDataReajusteSalarial(), LocalDate.now());
        if (period.getMonths() < 6) {
            int aptoEm = 6 - period.getMonths();
            throw new ValidacaoException(String
                    .format("Reajuste não pode ser aplicado em uma marge de tempo inferior a 6 meses.\n Faltam %d mes(es) " +
                            "para o funcionario: %s está apto a um aumento", aptoEm, funcionario.getNome()));
        }

        funcionario.setSalario(funcionario.getSalario().add(valorReajuste));
        funcionario.setDataReajusteSalarial(LocalDate.now());
    }

}
