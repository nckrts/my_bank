package teste;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);

        String opcao = "0";
        while (!opcao.equals("5")) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar moedas");
            System.out.println("2. Remover moedas");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total");
            System.out.println("5. Sair");
            System.out.println("Digite sua opção: ");
            opcao = scanner.next();

            switch (opcao) {
                case "1":
                    Moeda moeda = null;
                    String tipoMoeda = "0";
                    System.out.println("Digite o tipo de moeda: (Dólar, Euro, Real): ");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");

                    while (tipoMoeda == "0") {
                        tipoMoeda = scanner.next();
                        switch (tipoMoeda) {
                            case "1":
                                moeda = new Dolar();
                                break;
                            case "2":
                                moeda = new Euro();
                                break;
                            case "3":
                                moeda = new Real();
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                tipoMoeda = "0";
                                break;
                        }
                    }

                    System.out.println("Quanto deseja adicionar de " + moeda.info() + ": ");
                    moeda.setValor(scanner.nextDouble());

                    cofrinho.adicionar(moeda);
                    System.out.println("Moeda adicionada com sucesso!");
                    break;
                case "2":
                    String tipoRemover = "0";
                    Moeda classeMoeda = null;
                    System.out.println("Digite o tipo de moeda a remover: (Dólar, Euro, Real): ");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");

                    while (tipoRemover == "0") {
                        tipoRemover = scanner.next();
                        switch (tipoRemover) {
                            case "1":
                                classeMoeda = new Dolar();
                                break;
                            case "2":
                                classeMoeda = new Euro();
                                break;
                            case "3":
                                classeMoeda = new Real();
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                tipoRemover = "0";
                                break;
                        }
                    }
                    System.out.println("Digite o valor a ser removido: ");
                    double valor = scanner.nextDouble();
                    cofrinho.remover(classeMoeda, valor);
                    break;
                case "3":
                    List<Moeda> moedas = cofrinho.listar();
                    for (Moeda moedaLista : moedas) {
                        System.out.println("");
                        System.out.println("Tipo: " + moedaLista.info());
                        System.out.println("Valor: " + moedaLista.getValor());
                        System.out.println("");
                    }
                    break;
                case "4":
                    System.out.println(cofrinho.totalConvertidoReal() + " Reais");
                    break;
                case "5":
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}