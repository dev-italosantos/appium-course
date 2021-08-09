# language: pt

Funcionalidade: Aprender Cucumber
  Como tester do lifeCare
  Eu quero realizar testes automatizados
  Para ter mais agilidade no processo de QA

Cenário: Deve executar especificação
  Dado que criei o arquivo  corretamente
  Quando executá-lo
  Então a especificação deve finalizar com sucesso

  Cenário: Deve incrementar contador
    Dado que o valor do contador seja 15
    Quando eu incrementar em 5
    Então o valor do contador será 20

  Cenário: Deve calcular atraso na entrega
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 dias
    Então a entregar será efetuada em 07/04/2018

  Cenário: Deve calcular atraso na entrega da china
    Dado que a entrega é dia 07/04/2018
    Quando a entrega atrasar em 2 meses
    Então a entregar será efetuada em 07/06/2018

  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Italo dos Santos"
    Dado que o telefone do passageiro é 9000-0000
    Quando  criar os steps
    Então o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    Dado que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1200,23
    Dado que o nome do passageiro é "Andrewn GG"
    Dado que o telefone do passageiro é 9999-9999

#  @ignore
#  Cenário:  Deve negar todos os steps "Dado" dos cenários anteriores
#    Dado que o ticket é CD132
#    Dado que o ticket é AG1365
#    Dado que o valor da passagem é R$ 1.900,23
#    Dado que o nome do passageiro é "Davidson lorem lorem lorem"
#    Dado que o telefone do passageiro é 889-9999
