# Coesão

## Principios da Orientação a Objeto
- Coesão
- Encapsulamento
- Acoplamento

Quando aplicamos os principios de Solid iremos esta trabalhando esses conceitos

## Coesão
"Harmonia entre uma coisa e outra"
Em Orientação a objeto seria hormina em classes. Uma class tem que estar em harmonia com 
seus atributos

Em class coesas seus att fazem sentido com seu nome(sua representação no sistema)
mantendo assim dados(att/métodos) referente a sua resposabilidade
Exemplo de class coesa em Java:
~~~java
import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String cpf;
    private EnumCargo cargo;
    private BigDecimal salario;
    
    public boolean isGerente() {
        return this.cargo.Equals(EnumCargo.GERENTE);
    }
}
~~~

Em class não coesas o sentido de responsabilidade e harmonia vão se afastando da class deixando 
ela confusa e sem sua definição clara e isso pode prejudicar de um modo que faça com que ela cresça 
indefinidadamente. Já que não tem coesão, qualquer nova informação não tem razão para não ser jogada na
class.
Exemplo de class não coesa em Java

~~~java
public class Funcionario {
    private String nome;
    private String cpf;
    private EnumCargo cargo;
    private BigDecimal salario;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    
    private void formatarCpf() {
        //implement
    }

    private void formatarCep() {
        //implement
    }

    private void formatarEndereco() {
        //implement
    }
        
    public boolean isGerente() {
        return this.cargo.Equals(EnumCargo.GERENTE);
    }
}
~~~
"Classes não coesas tendem a crescer indefinidamente, o que as torna dificil de se manter"
