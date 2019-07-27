Feature: cadastro
	Eu como um usuario da casas bahia
	Quero efetuar o cadastro
	Para realizar compras

#Cenario positivo
Scenario: Efetuar cadastro
    Given Que eu estou na pagina da casas bahia
    When acessar a pagina de cadastro 
    And inserir meus dados
    And clicar em 'Continuar'
    Then ira aparecer a informacao 'Ola Nome'
    
#Cenario Negativo
Scenario: Realizar cadastro errado
    Given Que eu estou na pagina da casas bahia
    When acessar a pagina de cadastro 
    And inserir meus dados incorretos
    And clicar em 'Continuar'
    Then ira aparecer a mensagem 'E-mail ou senha incorretos'