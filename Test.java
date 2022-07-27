import java.util.Scanner;
public class Test {
    public static void main(String args[]) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("1: Brute Force \n2: Attaque par dictionnaire");
          int value = sc.nextInt();

          if(value == 1){
            Attack attack1 = new ForceBrute();
            ((ForceBrute) attack1).pwdCrack(); 
          }else{
            Attack attack2 = new Dictionnaire();
            ((Dictionnaire) attack2).pwdCrack();
          }
        }
    }
}