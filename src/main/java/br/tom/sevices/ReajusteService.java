package br.tom.sevices;

import br.tom.interfaces.ReajusteValidacao;
import br.tom.models.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ReajusteService {

    private final List<ReajusteValidacao> validacaoList;

    public ReajusteService(List<ReajusteValidacao> validacaoList) {
        this.validacaoList = validacaoList;
    }

    public void reajusteSalarial(BigDecimal valorReajuste, Funcionario funcionario) {

        validacaoList.forEach(r -> r.validar(funcionario, valorReajuste));
        funcionario.setSalario(funcionario.getSalario().add(valorReajuste));
        funcionario.setDataReajusteSalarial(LocalDate.now());
    }

}
