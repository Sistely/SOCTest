#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Testar cenários SOC
  Eu quero testar cenários propostos
  A fim de validar informações

  @tag1
  Scenario: Busca no Blog
    Given que esteja no blog da SOC
    When preencher campo de pesquisa
    And pressionar botão de pesquisa
    Then será redirecionado para página contendo resultados da pesquisa

  @tag2
  Scenario: Buscar Credenciado
    Given que esteja no site da SOC
    And clicar no submenu Soluções
    And clicar na opção SOCNET
    When clicar no botão Buscar credenciados
    And preencher filtros de pesquisa
    And clicar no botão de pesquisa
    Then retorna redes credenciadas
    And exibe perfil selecionado

