# Extraindo Validações

Adicionando mais uma regra na class Reajuste serviço fica nitido que quanto mais regras de reajuste forem aplicadas,
mais nossa class vai ficando grande e de dificil manutenção. Mais uma vez assim ferindo a coesão.
A class passará ter um crescimento em função de cada nova regra/validação nessaria do sistema. Na Parte dois iremos
aplicar um caminho para que cada nova implementação de re/validação não afete a outra. Deixando cada implementação
independente uma da outra. Isso vai ajudar na manutenção ou ate (exclusão, edição, criação) de uma regra/validação
