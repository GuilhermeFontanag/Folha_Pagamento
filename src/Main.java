import java.util.*;

public class Main {

    private static String lerTextoValido(String mensagem) {
        while (true) {
            String entrada = IO.readln(mensagem);
            if (entrada == null && !entrada.isBlank()) {
                return entrada.trim();
            }
            IO.println(" -> Entrada inválida! O campo não pode ficar em branco.");
        }
    }

    private static double lerDoubleValido(String mensagem){
    while(true) {
        try {
            String entrada = IO.readln(mensagem);
            double valor = Double.parseDouble(entrada.replace(",","."));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Entrada invalida, o campo deve ser digitado em numero");
        }
    }
    }

    public void main(String[] args) {
        int selecao = 0;
        List<Funcionario> lista_Funcionarios = new ArrayList<>();

        while(true) {
            selecao = Integer.parseInt(IO.readln(String.format("informe qual funcionario o senhor(a) deseja adicionar: %n 1 Gerente %n 2 Desenvolvedor %n 3: vendedor %n 4: mostrar os funcionarios adicionados%n 5: folha de pagamento da empresa %n 6: atualizar metas %n 7: fechar programa")));

            switch (selecao) {
                case 1:

                    String nome_gerente = "";
                    String cpf_gerente = "";
                    double saldo_gerente = 0;

                    //

                    nome_gerente = lerTextoValido( "informe o nome do funcionario por favor:");
                    cpf_gerente = lerTextoValido("informe o cpf do funcionario:");
                    saldo_gerente = lerDoubleValido("informe o salario do funcionario:");

                    Gerente novoGerente = new Gerente(nome_gerente, cpf_gerente, saldo_gerente);
                    lista_Funcionarios.add(novoGerente);
                    break;

                case 2: 
                    String nome_dev;
                    String cpf_dev;
                    double saldo_dev = 0;


                    nome_dev = lerTextoValido("informe o nome do funcionario por favor");
                    cpf_dev = lerTextoValido("informe o cpf do funcionario");
                    saldo_dev = lerDoubleValido("informe o salario do funcionario");

                    Desenvolvedor novoDev = new Desenvolvedor(nome_dev, cpf_dev, saldo_dev);
                    lista_Funcionarios.add(novoDev);
                    break;
                

                case 3: {
                    String nome_vendedor = "";
                    String cpf_vendedor = "";
                    double  saldo_vendedor = 0;
                    String entrada;


                    nome_vendedor= lerTextoValido("informe o nome do funcionario por favor");
                    cpf_vendedor = lerTextoValido("informe o cpf do funcionario");
                    saldo_vendedor = lerDoubleValido(IO.readln("informe o salario do funcionario"));

                    Vendedor novoVendedor = new Vendedor(nome_vendedor, cpf_vendedor, saldo_vendedor);
                    lista_Funcionarios.add(novoVendedor);
                    break;
                }

                case 4: 
                    if (lista_Funcionarios.isEmpty()) {
                        IO.println("sem funcionarios adicionados");
                    }
                    for(Funcionario i : lista_Funcionarios) {
                        IO.println(String.format("nome: " + i.getNome() + "%n saldo: " + i.getHolerite() + "Bonificação: " + i.calcularBonificacao() + "remuneração total" + i.calcularRemuneracaoTotal() + "%n"));
                    }
                    break;
                

                case 5: 
                    double folha_pagamento = 0;
                    for(Funcionario i : lista_Funcionarios) {
                        folha_pagamento += i.calcularRemuneracaoTotal();
                    }
                    IO.println("---- " + folha_pagamento + " ----");
                    break;
                

                case 6: 
                    try {
                        IO.println((String.format("atualizar a meta do Vendedor")));
                        float vendas = 0;
                        vendas = Float.parseFloat(IO.readln("informe o numero de vendas do vendedor:"));

                        for (Funcionario i : lista_Funcionarios) {
                            if (i instanceof Vendedor) {
                                Vendedor g = (Vendedor) i;
                                g.numero_vendas(vendas);
                                IO.println("Meta do vendedor atualizada com sucesso!");
                            }
                        }
                        break;
                    } catch (NumberFormatException e) {
                        IO.println("insira apenas numeros");
                        continue;
                    }
                
                default:
                    IO.println("programa encerrado");

            }
        }
    }
}