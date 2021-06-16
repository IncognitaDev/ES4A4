#language: pt
  Funcionalidade: Cumprimentar
    Caso um usario entrar com seu nome;

    Cenario: Cumprimentar
      Dado que o usuario escolha ser cumprimentado
      Quando ele entrar com nome "Paulo"
      Entao ele deve receber como resposta "Olá, Paulo"
