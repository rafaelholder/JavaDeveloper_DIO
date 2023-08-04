package edu.rafael.primeirasemana;
import java.util.Scanner;

public class Vars {
    

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String primeiroNome, segundoNome;

        System.out.println("Digite seu nome: ");
        primeiroNome = sc.nextLine();
        System.out.println("Sobrenome: ");
        segundoNome = sc.nextLine();

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);//A string
        System.out.println("Nome completo: " + nomeCompleto);

        sc.close();
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome); 
        //Metodo concat() Concatena/junta Strings diferentes
    }


}
