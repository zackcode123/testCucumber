#language: pt
Funcionalidade: Aprender Cucumber
  Como aluno 
  Eu quero aprender a utilizar Cucumber 
  Para que eu possa automatizar criterios de aceitação

  Cenário: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Então a especificação deve finalizar com sucesso

  Cenário: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar 3
    Então o valor do contador séra 18

  Cenário: Deve incrementar contador
    Dado que o valor do contador é 40
    Quando eu incrementar 20
    Então o valor do contador séra 60

  Cenário: Deve calcular o prazo de atraso
    Dado que a data de entrega é dia 21/07/2020
    Quando a entrega atrasar 2 dias
    Então a data de entrega sera dia 23/07/2020
