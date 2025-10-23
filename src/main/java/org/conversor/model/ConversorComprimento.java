package org.conversor.model;

public class ConversorComprimento {

    // Metros para Centimetros
    public static double metroParaCentimetro(double metro){
        return metro*100;
    }
    // Metro para Quilometro
    public static double metroParaQuilometro(double metro){
        return metro*1000;
    }
    // Metros para Polegadas
    public static double metroParaPolegadas(double metro){
        return metro*39.3701;
    }
    // Metros para Pés
    public static double metroParaPe(double metro){
        return metro*3.28084;
    }

    // Centimetos para Metros
    public static double centimetroParaMetros(double centimetros){
        return centimetros/100;
    }
    // Centimetros para Quilometros
    public static double centimetroParaQuilometos(double centimetos){
        return centimetos/100000;
    }
    // Centimetos para Polegadas
    public static double centimetoparaPolegadas(double centimetos){
        return centimetos/2.54;
    }
    // Centimetos para Pés
    public static double centimetosParaPes(double centimetros){
        return centimetros/30.48;
    }

    // Quilometos para Metros
    public static double quilometrosParaMetros(double quilometos){
        return quilometos*1000;
    }
    // Quilometros para Centimetros
    public static double quilometrosParaCentimetros(double quilometos){
        return quilometos*100000;
    }
    // Quilometros para Polegadas
    public static double quilometrosParaPolgadas(double quilometos){
        return quilometos*39370;
    }
    // Quilometros para Pés
    public static double quilometrosParaPes(double quilometros){
        return quilometros*3281;
    }

    // Polegadas para Metros
    public static double polegadasParaMetros(double polegadas){
        return polegadas/39.37;
    }
    // Polegadas para Centimetros
    public static double polegadasParaCentimetros(double polegadas){
        return polegadas*2.54;
    }
    // Polegadas para Quilometros
    public static double polegadasParaQuilometros(double polegadas){
        return polegadas/39370;
    }
    // Polegadas para Pés
    public static double polegadasParaPes(double polegadas){
        return polegadas/12;
    }

    // Pés para metros
    public static double pesParaMetros(double pes){
        return pes/3.281;
    }
    // Pés para Centimetros
    public static double pesParaCentimetros(double pes){
        return pes*30.48;
    }
    // Pés para quilometros
    public static double pesParaQuilometos(double pes){
        return pes/3281;
    }
    // Pés para polegadas
    public static double pesParaPolegadas(double pes){
        return pes*12;
    }

}
