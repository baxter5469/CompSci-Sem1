import java.util.Scanner;
public class R65
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int usrIn = input.nextInt();
        int sum = 0;
        int sum1 = 0;
        int squareSum = 0;
        int sum2 = 0;
        for (int evenNum = 2;evenNum<=usrIn;evenNum = evenNum+2) {
            sum = sum + evenNum;
        }
        System.out.println("The sum of all even numbers between 2 and " + usrIn + ": " + sum);
        for (int squareNum = 0;squareNum<=usrIn;squareNum = squareSum*squareSum) {
            sum1 += squareNum;
            squareSum++;
        }
        System.out.println("The sum of all squares between 1 and " + usrIn + ": " + sum1);
        System.out.print("Enter another positive integer larger than " + usrIn + ": ");
        int usrIn2 = input.nextInt();
        int oddNumUsr = ((usrIn2 - usrIn)+ 2) / 2;
        for (int oddNum = usrIn;oddNumUsr>0;oddNum = oddNum+2){
            sum2 = sum2 + oddNum;
            oddNumUsr--;
        }
        System.out.println("The sum of all odd numbers between " + usrIn + " and " + usrIn2 + " : " + sum2);
        int oddDigitCounter = 0;
        String usrIn1 = String.valueOf(usrIn);
        for (int i = 0; i < usrIn1.length(); i++) {
            char c = usrIn1.charAt(i);
            if ((c-'0') % 2 == 1)
            {
                oddDigitCounter += (c-'0');
            }
        }
        System.out.print("The sum of all odd digits of " + usrIn + " : " + oddDigitCounter);
    }
}