# Acoplamento

 "Ação de acoplar. Agrupamento aos pares"

A ideaia de acoplar, é quando voce tem dois componentes que estão iterligados entre si causando idependencia
entre o outro.
Acoplamento em si não se é algo ruim. Isso se torna prejudicial quando o acoplamento se torna instável
Lembrando que um codigo mal encapsulado coopera a termos acoplamentos em nossos codigos

Ex de uma acoplamento estavel:
~~~java
class Main {
    Funcionario funcionario = funcionarioDao();
    BigDecimal reajuste = funcionario.getValorTotalRecebidoReajuste();

}
~~~
No exemplo a class que chama a método desconhece a regra de reajuste. Sendo assim a regra pode mudar a vonta-
de que não ira afetar a class 'main'

Em um mal exemplo nos realizamos a implementação em nosso proprio main aumentando acoplamente, pq qualquer
outro lugar que desejar pegar o valor de reajuste precisará fazer sua propria implementação da regra. Sendo
assim teremos codigos repitidos e acoplamento instavel e cheios de implementações cada um ao seu gosto.
O que de longe já cheira muito mal. Isso nos leva ao  reaproveitamento que se torna zero, ja que se 
quisermos reutilizar a regra de reajuste precisaremos implementar ou criar um acoplamento com a class que
implementou. O que teria quase zero de coesão até por que os contexto de construção não são orientado
a reuso.

~~~java
class Main {
    public static void main(String[] args) {
        Funcionario funcionario = funcionarioDao();
        BigDecimal valorTotalReajuste = BigDecimal.ZERO;
        List<Reajuste> reajustes = funcionario.getReajustes();

        for(Reajuste r : reajustes) {
            valorTotalReajuste.sum(valorTotalReajuste.sum(reajustes.getValor));
        }
    }
}
~~~

    "Classes acopladas podem gerar fragilidades nos codigos, o que dificulta sua manutenção"
