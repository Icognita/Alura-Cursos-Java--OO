package loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem o caso seja valor inválido
e continue perguntando
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int nota;
        System.out.println("nota:");
        nota =scan.nextInt();
         while (nota <0 | nota>10){
             System.out.println("nota Invalida! Digite novamente");
             nota =scan.nextInt(nota);

         }
    }
}
