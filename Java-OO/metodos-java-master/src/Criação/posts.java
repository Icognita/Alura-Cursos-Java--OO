package Criação;

public class posts {
    public  static  void getPosts(int hours){
        switch (hours) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                postsGoodMorning();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                postsGodAfternoon();
                break;

            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                postsGoodnight();
                break;
            default:
                System.out.println(" invalid hours ");
                break;

        }
    }
   public  static  void  postsGoodMorning(){
    System.out.println("Good Morning");
   }
    public  static  void  postsGodAfternoon(){
    System.out.println("Good Afternoon");
    }
     public  static  void postsGoodnight( ){
    System.out.println("Good Night");
      }



}
