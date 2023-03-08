# Dependency Inversion Principle
    "Abstrações não devem depender de implementação. Implementações devem depender de abstrações"

A frase é bem clara em sua definição. Abstrações podem ser representadas como as interfaces que ja foram 
explicadas que são bem estaveis em um sistema. Então o principio é que um class que é uma implementação de alguma
solução tenha acoplamento com uma class/interface que seja mais estavel que ela.
Se modulo A se acopla com B. Modulo B tem que ser mais estavel que A. E se B se acopla com C. Logo, C tem que ser
mais estavel que B.

