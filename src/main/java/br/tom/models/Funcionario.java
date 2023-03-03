package br.tom.models;

import br.tom.enums.EnumCargo;
import lombok.*;

import java.math.BigDecimal;
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

}
