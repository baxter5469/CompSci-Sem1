import java.util.Scanner;
public class R64
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int usrIn = input.nextInt();
        int usrPow = 0;
        int usrPow1 = 0;
        int usrPow2 = 1;
        int usrPow3 = 1;
        System.out.print("Squares less than " + usrIn + ": ");
        while (usrPow*usrPow < usrIn) {
            usrPow1 = usrPow*usrPow;
            System.out.print(usrPow1 + " ");
            usrPow++;
        }
        usrPow2 = usrIn / 10;
        usrPow3 = usrPow2;
        System.out.println("/nTens less than " + usrIn + ": ");
        while (usrPow3 > 1) {
            usrPow2 = usrIn / 10;
            usrPow3--;
            System.out.print(usrPow3 + "0 ");
        }
        int numPowersof2;
        int exponent = 0;
        int nextPowOf2 = 1;
        System.out.println("Powers of two less than " + usrIn + ": ");
        while (nextPowOf2 < usrIn) {
            System.out.print(nextPowOf2 + " ");
            nextPowOf2 = nextPowOf2*2;
            exponent++;
        }
	}
}