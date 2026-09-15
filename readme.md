# Sistema de Gerenciamento de Funcionários e Folha de Pagamento
Aplicação em Java orientada a objetos para folha de pagamento com  cálculo de bonificações e apuração da folha de pagamento da empresa via comando

Funcionalidades

> Cadastro de Funcionários: Permite cadastrar colaboradores nas categorias Gerente, Desenvolvedor e Vendedor, aplicando validação básica de CPF.

> Cálculo de Bonificação: Cada tipo de cargo possui uma regra específica para cálculo de bonificação baseada no salário.

> Registro de Vendas: Atualiza a quantidade de vendas realizadas para colaboradores do cargo Vendedor.

> Listagem da Equipe: Exibe nome, salário, bonificação e remuneração total de cada funcionário.

> Folha de Pagamento: Calcula o somatório total do custo das remunerações da empresa.

## Estrutura do Projeto
 * folha_pagamento
    + ├── Funcionario.java     
    + ├── Gerente.java        
    + ├── Desenvolvedor.java  
    + ├── Vendedor.java      
    + └── Main.java             

##  Como Executar

1. Certifique-se de ter o JDK (Java Development Kit) instalado.

2. Certifique-se de ter a classe utilitária de entrada/saída IO disponível no mesmo diretório.

3. Abra o terminal no diretório do projeto e compile o código:

     1. `javac *.java`


    1. ` java Main `