import java.util.Scanner;
public class Test
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean usrCheck = false;
        int usrIn = 0;
        while (usrCheck == false){
        System.out.print("Gimme a positive integer: ");
        if (input.hasNextInt()){
            usrIn = input.nextInt();
            usrCheck = true;
        }
        else{
            System.out.print("Invalid Input!");
            }
        }
        boolean check = false;
        for (int i = 1; i <= usrIn; i++){
            if (i % 3 == 0){
                System.out.print("Fizz");
                check = true;
                if ( i % 4 == 0){
                    System.out.print("Buzz");
                }
            }
            if (i % 4 == 0 && check == false){
                System.out.print("Buzz");
                check = true;
            }
            if (check == false){
                System.out.print(i);
            }
            System.out.println();
            check = false;
        }
}
}