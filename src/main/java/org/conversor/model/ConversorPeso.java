package org.conversor.model;

public class ConversorPeso {

    // Quilograma para Grama
    public static double quilogramaPraGrama(double quilograma) {
        return quilograma * 1000;
    }

    // Quilograma para tonelada
    public static double quilogramaParaTonelada(double quilograma) {
        return quilograma / 1000;
    }

    // Quilograma para libra
    public static double quilogramaParaLibra(double quilograma) {
        return quilograma / 2.205;
    }

    // Quilograma para onça
    public static double quilogramaParaOnca(double quilograma) {
        return quilograma * 35.274;
    }

    // Grama para quilograma
    public static double gramaParaQuilograma(double grama) {
        return grama / 1000;
    }

    // Grama para tonelada
    public static double gramaParaTonelada(double grama) {
        return grama / 1000000;
    }

    // Grama para libra
    public static double gramaParaLibra(double grama) {
        return grama / 453.6;
    }
    // Grama para Onça
    public static double gramaParaOnca(double grama){
        return grama/28.35;
    }

    // Tonelada para quilograma
    public static double toneladaParaQuilograma(double tonelada){
        return tonelada/1000;
    }
    // Tonelada para grama
    public static double toneladaParaGrama(double tonelada){
        return tonelada*1000000;
    }
    // Tonelada para libra
    public static double toneladaParaLibra(double tonelada){
        return tonelada*2205;
    }
    // Tonelada para Onça
    public static double toneladaParaOnca(double tonelada){
        return tonelada*35270;
    }

    // Libra para quilograma
    public static double libraParaQuilograma(double libra){
        return libra/2.205;
    }
    // Libra para grama
    public static double libraParaGrama(double libra){
        return libra*453.6;
    }
    // Libra para tonelada
    public static double libraParaTonelada(double libra){
        return libra/2205;
    }
    // Libra para Onça
    public static double libraParaOnca(double libra){
        return libra*16;
    }

    // Onça para quilograma
    public static double oncaParaQuilograma(double onca){
        return onca/35.274;
    }
    // Onça para grama
    public static double oncaParaGrama(double onca){
        return onca*28.35;
    }
    // Onça para tonelada
    public static double oncaParaTonelada(double onca){
        return onca/35270;
    }
    // Onça para libra
    public static double oncaParaLibra(double onca){
        return onca/16;
    }
}
