@CadastroFailure
Feature: Cadastro no site Saraiva.com

  @StepOneCadastro
  Scenario: Usuário realiza cadastro no site

    Given Usuário acessa o site no navegador
    Then  clica no botão de cadastro
    Then clica em cadastre-se na segunda página
    And preencha seus dados
    And marque a opção de não receber newsletter
    But não clique na validação de captcha
    And finalize o processo de cadastro
    Then valide que o cadastro não foi concluído