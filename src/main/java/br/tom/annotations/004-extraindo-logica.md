# Extraindo logica de reajuste salarial

Para que possamos aplicar o conceito de coesão, criamos uma class Funcionario que está bem coesa com seus
atributos, porem adicionamos um método que fragiliza a coesão da class. Que é o método de reajusteSalarial. Esse
método tem regra de negocio, onde se o reajuste for acima de 40% do salario atual do Funcionario o mesmo despará 
um erro de validação. Notemos que a qualquer momento que essa regra mudar deveremos alterar diretamente na class
Funcionario, o que não se é uma boa pratica. Outra questão é que se uma nova regra precisar ser add nos vamos
implementa-la inline no proprio método da class. Deixando assim a classe aberta para alteração constante a cada
nova regra adicionada. 
Okay, ja vimos o quanto pode ser prejudicial para nossa coesão ter regra de negocios na class retirando nossa
querida coesão.

Na segunda parte conseguimos perceber a alteração que realizamos na Funcionario extraimos o método e o add em
uma nova classe chamada de reajusteService para que lá ficasse desposta a regra para reajuste de salario assim
quando existir a necessidade de uma nova regra ou de que a regra seja alterada, essa alteração não afete a class
pessoa a toda mudança necessaria.
Lembrando que ainda existe mais ações que podemos aplicar para melhora ainda mais o codigo e vamos as realizar.
