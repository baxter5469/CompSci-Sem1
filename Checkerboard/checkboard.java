import java.util.Scanner;
public class checkboard
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int usrIn = 0;
        while (check == true){
        System.out.print("Enter a size greater than 1: ");
        if (input.hasNextInt()) {
                usrIn = input.nextInt();
                check = false;
        }
        else {
                System.out.println("Invalid Input!");
        }
        int[][] board = new int[usrIn][usrIn];
        for (int i = 0; i < usrIn; i++){

                for (int i1 = 0; i1 < usrIn; i1++){
                        if (i % 2 == i1 % 2){
                                System.out.print("0 ");
                        }
                        else {
                                System.out.print("1 ");
                        }
                }
                System.out.println(" ");
        }
}
}
}