import java.util.Scanner;
import java.util.Random;

public class password {
    void passwordGen(){

        int options = 0;

        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] chrsNums = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] chrsNum = {"#", "*", "@", "_", "-","a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0","1", "2", "3", "4", "5", "6", "7", "8", "9"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Password option: \n 1: Only Letters \n 2: Numbers only \n 3: Numbers and letters \n 4: Letters, numbers and symbols");

        options = scanner.nextInt();

        if(options == 1){
            System.out.println("Your 8 digit password is: ");

            int chr1 = random.nextInt(52);
            int chr2 = random.nextInt(52);
            int chr3 = random.nextInt(52);
            int chr4 = random.nextInt(52);
            int chr5 = random.nextInt(52);
            int chr6 = random.nextInt(52);
            int chr7 = random.nextInt(52);
            int chr8 = random.nextInt(52);

            System.out.println(characters[chr1] + characters[chr2] + characters[chr3] + characters[chr4] + characters[chr5] + characters[chr6] + characters[chr7] + characters[chr8]);

            options = 0;
        }

        else if(options ==2){
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            int c = random.nextInt(10);
            int d = random.nextInt(10);
            int e = random.nextInt(10);
            int f = random.nextInt(10);
            int g = random.nextInt(10);
            int h = random.nextInt(10);

            System.out.println("Number Password is: ");

            System.out.print(a);
            System.out.print(b);
            System.out.print(c);
            System.out.print(d);
            System.out.print(e);
            System.out.print(f);
            System.out.print(g);
            System.out.print(h);

            options = 0;
        }

        else if(options == 3){
            
            int chrs1 = random.nextInt(61);
            int chrs2 = random.nextInt(61);
            int chrs3 = random.nextInt(61);
            int chrs4 = random.nextInt(61);
            int chrs5 = random.nextInt(61);
            int chrs6 = random.nextInt(61);
            int chrs7 = random.nextInt(61);
            int chrs8 = random.nextInt(61);

            System.out.println(chrsNums[chrs1] + chrsNums[chrs2] + chrsNums[chrs3] + chrsNums[chrs4] + chrsNums[chrs5] + chrsNums[chrs6] + chrsNums[chrs7] + chrsNums[chrs8]);

            options = 0;
        }

        else if(options == 4){
            int chrs1 = random.nextInt(62);
            int chrs2 = random.nextInt(62);
            int chrs3 = random.nextInt(62);
            int chrs4 = random.nextInt(62);
            int chrs5 = random.nextInt(62);
            int chrs6 = random.nextInt(62);
            int chrs7 = random.nextInt(62);
            int chrs8 = random.nextInt(62);

            System.out.println(chrsNum[chrs1] + chrsNum[chrs2] + chrsNum[chrs3] + chrsNum[chrs4] + chrsNum[chrs5] + chrsNum[chrs6] + chrsNum[chrs7] + chrsNum[chrs8]);



            options = 0;
        }
    }
}
