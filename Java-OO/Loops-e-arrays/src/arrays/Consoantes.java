package arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);///imput receber numero

        String[] consoantes =new String[6];// criando um objeto

        int quatidadeConsoates=0;

        int count=0;
        do {
            System.out.println("Letra:");
            String letra = scan.next(); // i
            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] =letra;
            quatidadeConsoates++;
            }
         count++;
        }while  (count < consoantes.length);
        System.out.println("consoantes: ");
        for ( String consoate:consoantes){
            if ( consoate!= null)
            System.out.println(consoate + "\n" +" ");
        }
        System.out.println("quatidade de consoante: " +quatidadeConsoates);
        System.out.println(consoantes.length);


    }
}
