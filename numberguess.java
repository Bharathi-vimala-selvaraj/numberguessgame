import java.security.SecureRandom;
import java.util.*;
public class github {
    public static void main(String[] args) {
        Random rand=new Random();
        int r=rand.nextInt(100)+1;
        int trycount=0;
        while(true) {
            System.out.println("enter your guess(1-100)");
            trycount++;
            Scanner sc = new Scanner(System.in);
            int p = sc.nextInt();
            if (p == r) {
                System.out.println("Correct!You Win");
                System.out.println("It took you "+trycount+" tries to win");
                break;
            } else if (r > p) {
                System.out.println("The number is higher,guess again");

            } else {
                System.out.println("The number is lower,guess again");
            }
        }
    }
}

