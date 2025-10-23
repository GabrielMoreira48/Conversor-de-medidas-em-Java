package org.conversor.model;

public class ConversorTemperatura {

    // Fahrenheit -> Celsius
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32)*5/9;
    }

    // Celsius -> Fahrenheit
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius *9/5) +32;
    }

    // Celsius -> Kelvin
    public static double celsiusParaKelvin(double celsius){
        return celsius + 273.15;
    }

    // Kelvin -> Celsius
    public static double kelvinParaCelsius(double kelvin){
        return kelvin - 273.15;
    }

    // Fahrenheit -> Kelvin
    public static double fahrenheitParaKelvin(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinParaFahrenheit(double kelvin){
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
