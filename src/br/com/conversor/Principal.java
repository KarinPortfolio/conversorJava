package br.com.conversor;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
         ConverteMoeda converter = new ConverteMoeda();

        while (true) {
            System.out.println("\n\n********** Mini-conversor de Moedas **********");
            System.out.println("1. Converter Dólar para Peso Argentino");
            System.out.println("2. Converter Peso Argentino para Dólar");
            System.out.println("3. Converter Dólar para Real");
            System.out.println("4. Converter Real para Dólar");
            System.out.println("5. Converter Dólar para Peso Colombiano");
            System.out.println("6. Converter Peso Colombiano para Dólar");
            System.out.println("0. Sair");
            System.out.println("********** Escolha uma opção **********");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Digite o valor: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    converter.modifica("USD", "ARS", amount);
                    break;
                case 2:
                    converter.modifica("ARS", "USD", amount);
                    break;
                case 3:
                    converter.modifica("USD", "BRL", amount);
                    break;
                case 4:
                    converter.modifica("BRL", "USD", amount);
                    break;
                case 5:
                    converter.modifica("USD", "COP", amount);
                    break;
                case 6:
                    converter.modifica("COP", "USD", amount);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
