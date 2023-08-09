package edu.rafael.primeirasemana;

public class Metodos {

    
    public static String Imprimir(){
        return "Ola mundo";
    }
    public boolean Aprovar(){
        return true;
    }
    public static void main(String args[]){        
        String msg = Imprimir();
        System.out.println(msg);
        System.out.println(Imprimir());

    }

}
