# Open-Closed Principle

    "Entidade de software(classes módulos, funções, etc) devem estar abertas para extensão, porem fechadas para
    modificação"

Devemos fazer o designer de nosso codigo de tal maneira que ele seja um modulo extendivel. Assim deixando a modi-
ficação apenas em casos realmentes necessario. Com a programação orientada a interface já estamos aplicando esse
principio, vendo que muitos codigos que tendiam a ficar juntos e trazendo sempre mudanças para apenas uma classes
fora separados de forma coesa e logica. E deixando-os bem estaveis já que interfaces usam assinaturas que muito
raramente tem sua assinatura modificada. E caso seja, tem a propagração em todas as implementações.
