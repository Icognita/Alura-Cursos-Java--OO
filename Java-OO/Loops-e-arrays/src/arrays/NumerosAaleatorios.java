package arrays;

import java.util.Random;

//Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
//Ao final mostre os números e seus sucessores.

public class NumerosAaleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleatórios =new int[20];

        for (int i =0; i<numerosAleatórios.length;i++){
            int numero = random.nextInt(100);
            numerosAleatórios[i]=numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero:numerosAleatórios) {
            System.out.println(numero + "");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for ( int numero:numerosAleatórios) {
            System.out.println((numero-1)+" ");
        }
        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero: numerosAleatórios) {
            System.out.println((numero+1) + "");

        }
    }
}
