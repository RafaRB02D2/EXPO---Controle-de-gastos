package main.com.SCG.app;

import main.com.SCG.model.Usuario;
import main.com.SCG.model.Gasto;
import main.com.SCG.util.Validacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean programaAtivo = true;

        while (programaAtivo) {

            System.out.print("\nNome do usuário: ");
            String nome = scanner.nextLine();

            System.out.print("Receita mensal: ");
            double receita = scanner.nextDouble();
            scanner.nextLine();

            Usuario usuario = new Usuario(nome, receita);

            double totalGastos = 0.0;

            boolean continuarGastos = true;

            while (continuarGastos) {

                System.out.print("\nCom o que é gasto: ");
                String nomeGasto = scanner.nextLine();

                System.out.print("Quantas vezes você gasta com isso no mês?: ");
                int vezesMes = scanner.nextInt();
                scanner.nextLine();

                double valorTotalGasto = 0.0;

                if (vezesMes > 0) {

                    System.out.print("Valor gasto por cada vez: ");
                    double valorPorVez = scanner.nextDouble();
                    scanner.nextLine();

                    valorTotalGasto = valorPorVez * vezesMes;
                }

                Gasto gasto = new Gasto(nomeGasto, valorTotalGasto);

                totalGastos += gasto.getValor();

                System.out.println("\n--- Resultado ---");
                System.out.println("Usuário: " + usuario.getNome());
                System.out.printf("Receita: R$ %.2f%n", usuario.getReceita());
                System.out.printf("Gasto lançado: %s = R$ %.2f%n", gasto.getNomegasto(), gasto.getValor());

                String avaliacao = Validacoes.analisarGasto(gasto);
                System.out.println("Análise: " + avaliacao);

                System.out.printf("Total gasto até agora: R$ %.2f%n", totalGastos);

                double percentualTotal = (totalGastos / usuario.getReceita()) * 100;
                System.out.printf("Percentual do total gasto sobre a receita: %.2f%%%n", percentualTotal);

                System.out.printf("Saldo restante: R$ %.2f%n", usuario.getReceita() - totalGastos);

                if (percentualTotal > 70) {

                    System.out.println("\nAtenção: Você já comprometeu mais de 70% da sua receita!");
                    System.out.println("Sugestões para melhorar seu controle financeiro:");
                    System.out.println(
                            "- Reduza gastos desnecessários como lazer excessivo, fast food, delivery, baladas, bebidas ou jogos.");
                    System.out
                            .println("- Tente reservar pelo menos 20% da sua renda para emergências ou investimentos.");
                    System.out.println("- Planeje suas despesas fixas e defina um limite para lazer.");
                }

                System.out.print("\nO que deseja fazer agora?\n" +
                        "1 - Continuar adicionando gastos\n" +
                        "2 - Reiniciar com outro usuário\n" +
                        "3 - Encerrar programa\n" +
                        "Escolha: ");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                if (escolha == 1) {
                    continuarGastos = true;
                }

                else if (escolha == 2) {
                    continuarGastos = false;
                }

                else if (escolha == 3) {
                    continuarGastos = false;
                    programaAtivo = false;
                }

                else {
                    System.out.println("Opção inválida.");
                    continuarGastos = true;
                }
            }
        }

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}