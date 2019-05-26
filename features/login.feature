Feature: login
	Eu como um usuário do submarino	
	Quero efetuar o login
	Para acessar minhas informacoes

#Cenario positivo
Scenario: Efetuar login
    Given Que eu estou na pagina do submarino
    When acessar a pagina de login 
    And inserir meus dados
    And clicar em 'Continuar'
    Then ira aparecer a informacao 'Ola Nome'
    
#Cenario Negativo
Scenario: Realizar login errado
    Given Que eu estou na pagina do submarino
    When acessar a pagina de login 
    And inserir meus dados incorretos
    And clicar em 'Continuar'
    Then ira aparecer a mensagem 'E-mail ou senha incorretos'
    
