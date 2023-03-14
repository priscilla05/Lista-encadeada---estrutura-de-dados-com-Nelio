package app;


import util.List;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List list = new List();

        int opcao;
        do {

            showMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Digite um numero: ");
                    double value = scanner.nextDouble();
                    list.add(value);
                    break;
                }
                case 2: {
                    System.out.println(list.toString());
                    break;
                }
                case 3: {
                    System.out.println("Fim do programa!");
                    break;
                }
                default:
                    System.out.println("Opçăo inválida!");
            }


        } while (opcao != 3);

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("1 – Inserir elemento na lista");
        System.out.println("2 – Mostrar lista");
        System.out.println("3 - Sair");
    }

}

