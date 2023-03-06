package br.tom.main;

import br.tom.enums.EnumCargo;
import br.tom.impl.RegraPeriodicidade;
import br.tom.impl.RegraPorcentagem;
import br.tom.interfaces.ReajusteValidacao;
import br.tom.models.Funcionario;
import br.tom.sevices.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = Funcionario.builder()
                .nome("Naruto Uzumaki")
                .cpf("884.611.826-98")
                .salario(new BigDecimal("1000.000"))
                .enumCargo(EnumCargo.GERENTE)
                .dataReajusteSalarial(LocalDate.now().minusMonths(6))
                .build();

        List<ReajusteValidacao> validacaoList = Arrays.asList(new RegraPorcentagem(), new RegraPeriodicidade());

        new ReajusteService(validacaoList).reajusteSalarial(new BigDecimal("400"), funcionario);
        System.out.println(funcionario);


    }
}
