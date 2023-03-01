# Encapsulamento
"Incluir ou proteger alguma coisa em capsula"
 Em nivel de class, encapsulamento significa proteger as prpriedades de infuencias externas a ela. 
Normalmente permitindo que algumas mudanças sejam realizadas apenas mediante a regras que configurarmos
para alteração de qualquer dado de uma class.
De exemplo podemos representar um class ContaBancaria onde setamos suas proprieades como privite assim
evitando acesso direto aos seus atributos. Então o saldo dessa Conta não pode ser alterado a não ser que 
settemos um metodo que defina a regra para alteração do saldo. Que no nosso caso seria um método de 
depoito/saque.

    "Class não encapsuladas permitem a violação de regras de negocio, alem de aumentar o acoplamento"


