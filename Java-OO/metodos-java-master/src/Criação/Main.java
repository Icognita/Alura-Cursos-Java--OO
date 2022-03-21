package Criação;

public class Main {
    public static void main(String[] args) {
        // calculator
        System.out.println("\n" + "exercise calculator");
        calculator.soma(3,6);
        calculator.subtraction(7,8);
        calculator.multiplication(7,8);
        calculator.division(5,2.5);

         //posts
        System.out.println("\n" + " Posts");
        posts.getPosts(9);
        posts.getPosts(14);
        posts.getPosts(1);
        //lending
        System.out.println( "\n" + "lending");
        lending.calculate(1000,lending.getTwoInstallments());
        lending.calculate(1000,lending.getThreeInstallments());
        lending.calculate(1000,5);










    }

}
