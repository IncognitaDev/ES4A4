#language: pt
  Funcionalidade: Calc
    Caso usuario entrar com dois valores Com o objetivo de obter um resultado

    Cenario: Somar
      Dado que eu escolha somar
      Quando eu preencho o primeiro número com o valor '1'
      E eu preencio o segundo número com o valor '1'
      Entao eu devo receber como resposta '2'