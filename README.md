Calculadora de Viagens ✈️
Aplicação de console em Java que ajuda a calcular o custo total de uma viagem, permitindo comparar destinos e simular descontos por antecedência na compra.

Sobre o projeto
Este projeto foi desenvolvido como parte dos estudos de sintaxe básica em Java, trabalhando:

Estrutura de programa Java (classe principal, método main)

Variáveis, tipos primitivos e String

Estruturas de decisão: if/else e switch

Estruturas de repetição: for e do/while

Arrays (String[] e double[])

Entrada de dados com Scanner

O código foi escrito durante meus estudos do livro “Java – Guia do Programador: Atualizado para Java 16”, de Peter Jandl Jr., especialmente com base no conteúdo do capítulo 2 (Sintaxe Java).

Funcionalidades
Listagem de destinos pré-cadastrados com seus respectivos valores

Menu interativo em console:

Opção para calcular o custo de uma viagem

Opção para comparar destinos e escolher um pacote

Opção para sair da aplicação

Cálculo de:

Custo total da viagem

Custo por pessoa

Custo por dia

Simulação de desconto por antecedência (ex.: 10% para compras com mais de 30 dias de antecedência)

Tecnologias utilizadas
Linguagem: Java

Versão: Java 16+ (compatível com versões superiores)

Entrada de dados: java.util.Scanner

Execução em console (linha de comando ou terminal da IDE)

Como executar
Clonar o repositório:

bash
git clone https://github.com/seu-usuario/calculadora-viagens.git
Entrar na pasta do projeto:

bash
cd calculadora-viagens
Compilar o arquivo:

bash
javac calculadoraViagens/CalculadoraViagens.java
Executar o programa:

bash
java calculadoraViagens.CalculadoraViagens
Estrutura do código
CalculadoraViagens

main(String[] args): ponto de entrada da aplicação

mostrarMenu(): exibe o menu principal e controla o fluxo com switch

listarDestinos(String[] destinos): mostra a lista de destinos e preços

compararPacote(): exibe os pacotes e permite escolher um destino para cálculo

calcularPacote(): faz o cálculo completo da viagem e do desconto

lerInteiro(String mensagem): leitura de valores inteiros com Scanner

lerDouble(String mensagem): leitura de valores decimais com Scanner

Objetivo de aprendizagem
Este projeto tem foco didático.
Ele foi criado para:

Consolidar o conteúdo de sintaxe Java estudado no capítulo 2 do livro Java – Guia do Programador: Atualizado para Java 16

Praticar construção de menus de console, controle de fluxo e manipulação de arrays

Servir como primeiro projeto de portfólio em Java voltado à área de viagens/turismo

Próximos passos
Algumas ideias de evolução do projeto:

Permitir cadastro dinâmico de novos destinos e preços

Persistir dados em arquivo (salvar e carregar destinos)

Melhorar o tratamento de erros de entrada (valores inválidos)

Internacionalização de mensagens (português/inglês)

