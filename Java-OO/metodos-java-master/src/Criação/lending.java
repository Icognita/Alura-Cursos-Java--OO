package Criação;

public class lending {
    public  static  int getTwoInstallments(){
        return 2;
    }
    public  static  int getThreeInstallments(){
        return 3;
    }
    public  static  double getRateTwoInstallments(){
        return 0.3;
    }
    public  static  double getRateThreeInstallments(){
        return 0.45;
    }
     public  static  void  calculate(double value, int installments){
        if (installments ==2){
            double valueEnd= value +(value *getRateTwoInstallments());
            System.out.println(" final loan amount in 2 installments: R$ " + valueEnd);
        } else if (installments ==3){
            double valueEnd =value + (value *getRateThreeInstallments());
            System.out.println(" final loan amount in 3 installments: R$ " + valueEnd);
        }else {
            System.out.println("\n" + "number of installments not accepted");
        }
     }
}
