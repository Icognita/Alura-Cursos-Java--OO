package br.com.dio;


import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
 int a, b;
        System.out.println("digite um numero:");
        a =  scan.nextInt();
        System.out.println("digite um numero:");
        b =  scan.nextInt();


        int somar = somar(a, b);
        int subitrair = subitrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);



        System.out.println("somar: " + somar);
        System.out.println("subitrair: "+ subitrair);
        System.out.println("multiplicar: "+ multiplicar);
        System.out.println("dividir: "+ dividir);


    }
       public  static  int somar(int a, int b){
        return  a+b;
            }
            public  static  int subitrair(int a, int b){
        return  a+b;
            }

        public  static  int multiplicar(int a, int b){
        return  a+b;
            }
        public  static  int dividir(int a, int b){
        return  a+b;
            }
}
