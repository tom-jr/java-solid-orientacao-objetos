# Extraindo Validações

Adicionando mais uma regra na class Reajuste serviço fica nitido que quanto mais regras de reajuste forem aplicadas,
mais nossa class vai ficando grande e de dificil manutenção. Mais uma vez assim ferindo a coesão.
A class passará ter um crescimento em função de cada nova regra/validação nessaria do sistema. Na Parte dois iremos
aplicar um caminho para que cada nova implementação de re/validação não afete a outra. Deixando cada implementação
independente uma da outra. Isso vai ajudar na manutenção ou ate (exclusão, edição, criação) de uma regra/validação

# Parte II

Iremos usar o desenvolvimento orientado a interface para solucionar nosso problema em questão. Com o uso 
de interface iremos separar as validações cada uma em sua class. Assim a cada nova regra/validação uma nova class
surgirá. Então aplicaremos o conceito de Open/closed principle. Que define um modulo fechada para modificação
e aberta implementação. Caso uma regra seja posta em desuso basta excluir sua implementação facilitando assim 
todo o fluxo.

Nos criaremos uma interface de ValidacaoReajuste com uma assinatura de validar(args) recebendo os 
parametros necessarios. No caso funcionario, valorReajuste. Lembrando que o professor esta sem usar o valorReajuste em 
uma das validações. Isso é uma má pratica. O ideal é separar as regras que não tem o mesmo padrão. :)
