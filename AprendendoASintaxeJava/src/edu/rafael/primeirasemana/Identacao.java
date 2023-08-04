package edu.rafael.primeirasemana;
import java.util.Scanner;

public class Identacao {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para acessar a media do aluno: ");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                MediaFinalAluno();
            default:
                System.out.println("Opção invalida");
        } 
        
        sc.close();
    }

    public static void MediaFinalAluno(){
        Scanner sc = new Scanner(System.in);
        double nota_1, nota_2, nota_3;
        
        System.out.println("Digite as 3 notas do aluno(Com Decimais):");
        nota_1 = sc.nextDouble();
        nota_2 = sc.nextDouble();
        nota_3 = sc.nextDouble();
        
        double mediaFinal = (nota_1 + nota_2 + nota_3) / 3;

        if(mediaFinal > 7) 
            System.out.println("Aprovado. Parabens!");
        else 
            System.out.println("Reprovado. Tente melhor ano que vem.");
        
        sc.close();
    }
}
