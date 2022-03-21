package basecampos;



public class TipoDeDados {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 =40000;

        //int i1= -10000000000;
        short i2 = 28500;

        long l1 = 10000000000000000L;// muito grande se tirar o L da erro
        long l2 = 28840050005005500L;


        float f1 = 4.5F; //
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 9984d;

        char c1 = 'w'; // usa-se sempre aspas simples para caracterizar um char
        //char c2 ='tw';
        char c3 = '\u0057'; //  unicode

        String st2 = "cicrano";
        String st1 = "fulano";
        String st3 = "ag dgb se se et e knbjbbb &8& 758894389";


        String dt1 = "09/02/1981";



        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c3);
        System.out.println(c1);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }

}