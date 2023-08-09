package edu.rafael.primeirasemana;

public class Operadores {
    
    public static void main(String[] args) {
        int num_1 = 1, num_2 = 2;
        String result = num_1 == num_2 ? "Os dois são iguais" : "nao sao iguais";
        System.out.println(result);


        //Comparação de Objetos e Valores tipados
        String nome_1 = "Rafael";
        String nome_2 = new String("Rafael");
        System.out.println(nome_1.equals(nome_2));
        System.out.println(nome_1 == nome_2);

        if(nome_1 == "Rafael" && nome_2 == "Rafael")
            System.out.println("Certo");
    }
}
