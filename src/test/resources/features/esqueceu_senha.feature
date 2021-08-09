# language: pt

Funcionalidade: Aprender Cucumber
  Como tester do lifeCare
  Eu quero realizar testes automatizados
  Para ter mais agilidade no processo de QA

@test
Cenário: Deve receber token se esqueceu a senha
  Dado que o usuário esteja na página de login
  E que o usuário clicou no botão esqueceu sua senha
  E que o usuário informe o seu email
  Quando o usuário clicar no botão enviar
  Então o token será enviado