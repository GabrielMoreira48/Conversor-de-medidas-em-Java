package org.conversor;


import org.conversor.service.ConversorService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        ConversorService conversor = new ConversorService();

        int opcao;
        do {
            System.out.println("=== Conversor de Unidades ===");
            System.out.println("1- Temperatura");
            System.out.println("2- Comprimento");
            System.out.println("3- Peso");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = imput.nextInt();

            switch (opcao){
                case 1: conversor.menuTemperatura(imput);
                case 2: conversor.menuComprimento(imput);
                case 3: conversor.menuPeso(imput);
                case 0:
                    System.out.println("Saindo...!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (opcao != 0);
    }
}
