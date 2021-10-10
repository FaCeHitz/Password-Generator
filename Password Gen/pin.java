import java.util.Random;

public class pin {
    void genPin(){

        Random rand = new Random();

        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int d = rand.nextInt(10);

        System.out.print("PIN number is : ");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);

    }
}
