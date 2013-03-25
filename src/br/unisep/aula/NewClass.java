package br.unisep.aula;
import java.util.Scanner;

public class NewClass {
    public static void main (String[] args) {
        String valor = "123";
        
        byte valorByte = Byte.parseByte(valor);
        short valorShort = Short.parseShort(valor);
        int valorInt = Integer.parseInt(valor);
        long valorLong = Long.parseLong(valor);
        float valorFloat = Float.parseFloat (valor);
        double valorDouble = Double.parseDouble (valor);
   
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        
        System.out.println(nome);
    
    
    }
}