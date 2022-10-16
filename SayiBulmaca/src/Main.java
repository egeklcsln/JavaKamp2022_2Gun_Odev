import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sayiBulmaca() ;







    }
    public static void sayiBulmaca(){
        int[] numbers = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        Scanner scan = new Scanner(System.in);

        int ara = scan.nextInt();

        boolean varMı = false ;

        for(int number:numbers){
          if(number==ara){
              varMı =true;
              break;
          }
        }
      if(varMı){
          olumlumesaj(ara);
      }
      else{

          olumsuzmesaj(ara);
      }
      }


    public static void olumlumesaj(int ara) {
        System.out.println(ara + " sayısı mevcuttur.");
    }
    public static void olumsuzmesaj(int ara) {
        System.out.println(ara + " sayısı mevcut değildir.");
    }
}
