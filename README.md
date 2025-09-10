💰 Sistema de Controle de Gastos (SCG)

Este projeto é uma aplicação Java console-based que ajuda o usuário a registrar seus gastos mensais, analisar a relação entre receitas e despesas e oferecer sugestões para um melhor controle financeiro.

📌 Funcionalidades

Cadastro de um usuário com nome e receita mensal.

Registro de múltiplos gastos, incluindo:

Nome do gasto

Quantidade de vezes no mês

Valor por ocorrência

Cálculo automático:

Total de gastos

Percentual dos gastos sobre a receita

Saldo restante

Análise de cada gasto registrado (essencial, supérfluo ou a analisar).

Alerta se os gastos ultrapassarem 70% da receita mensal.

Sugestões de como reduzir despesas e planejar melhor as finanças.

🛠 Tecnologias Utilizadas

Java SE 8+

Scanner (java.util.Scanner) para entrada de dados via terminal

Programação orientada a objetos (POO)

▶️ Como Executar o Projeto
1. Pré-requisitos

Instalar o Java JDK 8+

Configurar o PATH do Java no sistema

Ter uma IDE (ex: VS Code, IntelliJ IDEA, Eclipse) ou compilar pelo terminal

2. Clonar o repositório
git clone https://github.com/seu-usuario/controle-de-gastos-java.git
cd controle-de-gastos-java

3. Compilar o projeto

No diretório src, execute:

javac main/com/SCG/app/Main.java

4. Executar o programa
java main.com.SCG.app.Main

🔄 Fluxo do Programa

O usuário informa:

Nome

Receita mensal

O sistema permite o lançamento de um ou mais gastos.

Cada gasto é analisado:

Essencial (ex: aluguel, comida, transporte)

Supérfluo (ex: balada, delivery, eletrônicos)

A analisar (quando não se enquadra nas categorias anteriores)

O programa exibe:

Total de gastos lançados

Percentual em relação à receita

Saldo restante

Se os gastos ultrapassarem 70% da receita, o sistema emite um alerta financeiro com recomendações.

O usuário escolhe:

Adicionar mais gastos

Reiniciar com outro usuário

Encerrar o programa

📊 Exemplo de Uso
Nome do usuário: Rafael
Receita mensal: 3000

Com o que é gasto: Aluguel
Quantas vezes você gasta com isso no mês?: 1
Valor gasto por cada vez: 1200

--- Resultado ---
Usuário: Rafael
Receita: R$ 3000,00
Gasto lançado: Aluguel = R$ 1200,00
Análise: Gasto aceitável. Essencial para o dia a dia.
Total gasto até agora: R$ 1200,00
Percentual do total gasto sobre a receita: 40,00%
Saldo restante: R$ 1800,00

O que deseja fazer agora?
1 - Continuar adicionando gastos
2 - Reiniciar com outro usuário
3 - Encerrar programa
Escolha:
