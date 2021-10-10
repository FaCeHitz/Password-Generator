import java.util.Scanner;

public class PasswordGenerator{
    public static void main(String[] args){

        password passGen = new password();
        pin genPin = new pin();

        Scanner scanner = new Scanner(System.in);

        int option = 0;

        System.out.println("WELCOME TO THIS PASSWORD AND PIN NUMBER GENERATOR");

        while(option < 3){
            
            System.out.println();
            System.out.println("To generate a password, please select 1; For a PIN number, please select 2; To close, press 3");

            option = scanner.nextInt();
            
            if(option == 1){
                passGen.passwordGen();
            }

            else if(option == 2){
                genPin.genPin();
            }

            else if (option > 3){
                option = 0;
                System.out.println("Number has to be between 1 and 3");

            }
        }

        scanner.close();
    }
}
