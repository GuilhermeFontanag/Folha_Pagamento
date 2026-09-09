import java.util.*;

public class Main {
    public static void main(String[] args) {
        int selecao = 0;
        List<Funcionario> lista_Funcionarios = new ArrayList<>();

        while(true) {
            selecao = Integer.parseInt(IO.readln(String.format("informe qual funcionario o senhor(a) deseja adicionar: %n 1 Gerente %n 2 Desenvolvedor %n 3: vendedor %n 4: mostrar os funcionarios adicionados%n 5: folha de pagamento da empresa %n 6: atualizar metas %n 7: fechar programa")));

            switch (selecao) {
                case 1:
                    String nome_gerente;
                    String cpf_gerente;
                    float saldo_gerente = 0;

                    //adicionar condição inblank
                    nome_gerente = IO.readln("informe o nome do funcionario por favor:");
                    if (nome_gerente.isBlank()) {
                        System.out.println("nome vazio");
                        nome_gerente = "";
                    }

                    cpf_gerente = IO.readln("informe o cpf do funcionario:");
                    if (cpf_gerente.isBlank() || cpf_gerente.length() != 11) {
                        System.out.println("informe o cpf corretamente");
                        continue;
                    }

                    saldo_gerente = Float.parseFloat(IO.readln("informe o salario do funcionario:"));

                    Gerente novoGerente = new Gerente(nome_gerente, cpf_gerente, saldo_gerente);
                    lista_Funcionarios.add(novoGerente);
                    break;

                case 2: {
                    String nome;
                    String cpf;
                    float saldo = 0;

                    //adicionar condição inblank
                    nome = IO.readln("informe o nome do funcionario por favor");
                    if (nome.isBlank()) {
                        System.out.println("nome vazio");
                        nome = "";
                    }

                    cpf = IO.readln("informe o cpf do funcionario");
                    if (cpf.isBlank() || cpf.length() != 11) {
                        System.out.println("informe o cpf corretamente");
                    }

                    saldo = Float.parseFloat(IO.readln("informe o salario do funcionario"));
                    Desenvolvedor novoDev = new Desenvolvedor(nome, cpf, saldo);
                    lista_Funcionarios.add(novoDev);
                    break;
                }

                case 3: {
                    String nome;
                    String cpf;
                    float saldo = 0;
                    String entrada;

                    //adicionar condição inblank
                    nome = IO.readln("informe o nome do funcionario por favor");
                    if (nome.isBlank()) {
                        System.out.println("nome vazio");
                        nome = "";
                    }

                    cpf = IO.readln("informe o cpf do funcionario");
                    if (cpf.isBlank() || cpf.length() != 11) {
                        System.out.println("informe o cpf corretamente");
                    }

                    saldo = Float.parseFloat(IO.readln("informe o salario do funcionario"));

                    Vendedor novoVendedor = new Vendedor(nome, cpf, saldo);
                    lista_Funcionarios.add(novoVendedor);
                    break;
                }

                case 4: {
                    if (lista_Funcionarios.isEmpty()) {
                        IO.println("sem funcionarios adicionados");
                    }
                    for(Funcionario i : lista_Funcionarios) {
                        IO.println(String.format("nome: " + i.getNome() + "%n saldo: " + i.getHolerite() + "Bonificação: " + i.calcularBonificacao() + "remuneração total" + i.calcularRemuneracaoTotal() + "%n"));
                    }
                    break;
                }

                case 5: {
                    double folha_pagamento = 0;
                    for(Funcionario i : lista_Funcionarios) {
                        folha_pagamento += i.calcularRemuneracaoTotal();
                    }
                    IO.println("---- " + folha_pagamento + " ----");
                    break;
                }

                case 6: {
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
                }
                default:
                    IO.println("programa encerrado");
                    return;
            }
        }
    }
}