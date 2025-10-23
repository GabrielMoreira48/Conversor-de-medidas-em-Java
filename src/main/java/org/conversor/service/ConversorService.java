package org.conversor.service;

import org.conversor.model.ConversorTemperatura;
import org.conversor.model.ConversorComprimento;
import org.conversor.model.ConversorPeso;
import java.util.Scanner;

public class ConversorService {

    public void menuTemperatura (Scanner imput) {
        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("1 - Celsius → Fahrenheit");
        System.out.println("2 - Fahrenheit → Celsius");
        System.out.println("3 - Celsius → Kelvin");
        System.out.println("4 - Kelvin → Celsius");
        System.out.println("5 - Fahrenheit → Kelvin");
        System.out.println("6 - Kelvin → Fahrenheit");
        System.out.print("Escolha a opção: ");
        int op = imput.nextInt();

        System.out.println("Digite o valor: ");
        double valor = imput.nextDouble();

        double resultado = switch (op) {
            case 1 -> ConversorTemperatura.celsiusParaFahrenheit(valor);
            case 2 -> ConversorTemperatura.fahrenheitParaCelsius(valor);
            case 3 -> ConversorTemperatura.celsiusParaKelvin(valor);
            case 4 -> ConversorTemperatura.kelvinParaCelsius(valor);
            case 5 -> ConversorTemperatura.fahrenheitParaKelvin(valor);
            case 6 -> ConversorTemperatura.kelvinParaFahrenheit(valor);
            default -> Double.NaN;
        };

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opção invalida");
        }
    }

        public void menuComprimento (Scanner imput) {

            System.out.println("=== Conversor de Comprimento ===");
            System.out.println("1 - Metros → Centímetros");
            System.out.println("2 - Metros → Quilômetros");
            System.out.println("3 - Metros → Polegadas");
            System.out.println("4 - Metros → Pés");
            System.out.println("5 - Centímetros → Metros");
            System.out.println("6 - Centímetros → Quilômetros");
            System.out.println("7 - Centímetros → Polegadas");
            System.out.println("8 - Centímetros → Pés");
            System.out.println("9 - Quilômetros → Metros");
            System.out.println("10 - Quilômetros → Centímetros");
            System.out.println("11 - Quilômetros → Polegadas");
            System.out.println("12 - Quilômetros → Pés");
            System.out.println("13 - Polegadas → Metros");
            System.out.println("14 - Polegadas → Centímetros");
            System.out.println("15 - Polegadas → Quilômetros");
            System.out.println("16 - Polegadas → Pés");
            System.out.println("17 - Pés → Metros");
            System.out.println("18 - Pés → Centímetros");
            System.out.println("19 - Pés → Quilômetros");
            System.out.println("20 - Pés → Polegadas");
            System.out.print("Escolha a opção: ");
            int op = imput.nextInt();

            System.out.println("Digite o valor: ");
            double valor = imput.nextDouble();

            double resultado = switch (op) {
                case 1 -> ConversorComprimento.metroParaCentimetro(valor);
                case 2 -> ConversorComprimento.metroParaQuilometro(valor);
                case 3 -> ConversorComprimento.metroParaPolegadas(valor);
                case 4 -> ConversorComprimento.metroParaPe(valor);
                case 5 -> ConversorComprimento.centimetroParaMetros(valor);
                case 6 -> ConversorComprimento.centimetroParaQuilometos(valor);
                case 7 -> ConversorComprimento.centimetoparaPolegadas(valor);
                case 8 -> ConversorComprimento.centimetosParaPes(valor);
                case 9 -> ConversorComprimento.quilometrosParaMetros(valor);
                case 10 -> ConversorComprimento.quilometrosParaCentimetros(valor);
                case 11 -> ConversorComprimento.quilometrosParaPolgadas(valor);
                case 12 -> ConversorComprimento.quilometrosParaPes(valor);
                case 13 -> ConversorComprimento.polegadasParaMetros(valor);
                case 14 -> ConversorComprimento.polegadasParaCentimetros(valor);
                case 15 -> ConversorComprimento.polegadasParaQuilometros(valor);
                case 16 -> ConversorComprimento.polegadasParaPes(valor);
                case 17 -> ConversorComprimento.pesParaMetros(valor);
                case 18 -> ConversorComprimento.pesParaCentimetros(valor);
                case 19 -> ConversorComprimento.pesParaQuilometos(valor);
                case 20 -> ConversorComprimento.pesParaPolegadas(valor);
                default -> Double.NaN;
            };
            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opção inválida");
            }
        }
    public void menuPeso(Scanner input) {

        System.out.println("=== Conversor de Peso ===");
        System.out.println("1 - Quilograma → Grama");
        System.out.println("2 - Quilograma → Tonelada");
        System.out.println("3 - Quilograma → Libra");
        System.out.println("4 - Quilograma → Onça");
        System.out.println("5 - Grama → Quilograma");
        System.out.println("6 - Grama → Tonelada");
        System.out.println("7 - Grama → Libra");
        System.out.println("8 - Grama → Onça");
        System.out.println("9 - Tonelada → Quilograma");
        System.out.println("10 - Tonelada → Grama");
        System.out.println("11 - Tonelada → Libra");
        System.out.println("12 - Tonelada → Onça");
        System.out.println("13 - Libra → Quilograma");
        System.out.println("14 - Libra → Grama");
        System.out.println("15 - Libra → Tonelada");
        System.out.println("16 - Libra → Onça");
        System.out.println("17 - Onça → Quilograma");
        System.out.println("18 - Onça → Grama");
        System.out.println("19 - Onça → Tonelada");
        System.out.println("20 - Onça → Libra");
        System.out.print("Escolha a opção: ");
        int op = input.nextInt();

        System.out.print("Digite o valor: ");
        double valor = input.nextDouble();

        double resultado = switch (op) {
            case 1 -> ConversorPeso.quilogramaPraGrama(valor);
            case 2 -> ConversorPeso.quilogramaParaTonelada(valor);
            case 3 -> ConversorPeso.quilogramaParaLibra(valor);
            case 4 -> ConversorPeso.quilogramaParaOnca(valor);
            case 5 -> ConversorPeso.gramaParaQuilograma(valor);
            case 6 -> ConversorPeso.gramaParaTonelada(valor);
            case 7 -> ConversorPeso.gramaParaLibra(valor);
            case 8 -> ConversorPeso.gramaParaOnca(valor);
            case 9 -> ConversorPeso.toneladaParaQuilograma(valor);
            case 10 -> ConversorPeso.toneladaParaGrama(valor);
            case 11 -> ConversorPeso.toneladaParaLibra(valor);
            case 12 -> ConversorPeso.toneladaParaOnca(valor);
            case 13 -> ConversorPeso.libraParaQuilograma(valor);
            case 14 -> ConversorPeso.libraParaGrama(valor);
            case 15 -> ConversorPeso.libraParaTonelada(valor);
            case 16 -> ConversorPeso.libraParaOnca(valor);
            case 17 -> ConversorPeso.oncaParaQuilograma(valor);
            case 18 -> ConversorPeso.oncaParaGrama(valor);
            case 19 -> ConversorPeso.oncaParaTonelada(valor);
            case 20 -> ConversorPeso.oncaParaLibra(valor);
            default -> Double.NaN;
        };

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opção inválida");
        }
    }

}

