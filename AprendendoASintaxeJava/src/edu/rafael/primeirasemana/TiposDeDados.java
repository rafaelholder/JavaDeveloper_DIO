package edu.rafael.primeirasemana;

public class TiposDeDados {
    
    public static void main(String[] args) {
        // int, byte, short, long, double, boolean, char
        int idade = 20;
        int salarioInteiro = 2500;
        double salarioFracionado = 2.500 * 1000;
        double pi = 3.14;
        float piFloat = 3.14f; //Floats precisam terminar com 'f' para identificar que são floats
        char letra = 'e';

        short numeroShort = 1;
        int numeroInteiro = numeroShort;
        //short numeroShort_2 = numeroInteiro; // Short não comportam Int

        final double VALOR_PI = 3.14; 
    }
}
