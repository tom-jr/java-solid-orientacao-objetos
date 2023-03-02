package br.tom.models;

import br.tom.enums.EnumCargo;
import br.tom.exceptions.ValidacaoException;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Funcionario {

    private String nome;
    private String cpf;
    private EnumCargo enumCargo;
    private BigDecimal salario;
    private LocalDate dataReajusteSalarial;

    public void reajusteSalarial(BigDecimal valorReajuste) {
        BigDecimal percentualReajuste = valorReajuste.divide(this.salario, RoundingMode.HALF_UP);
        System.out.println(percentualReajuste);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste não pode ser superior a 40%");
        }
        this.salario = salario.add(valorReajuste);
        this.dataReajusteSalarial = LocalDate.now();
    }
}
