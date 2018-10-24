import java.util.Scanner;
public class FourDigRoman
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number up to 3,999: ");
        int numInput = input.nextInt();
        // divide by 1000
        int thousNum = numInput / 1000;
        // modulus 1000 from numInput
        int hundMod = numInput % 1000;
        // divide by 100
        int hundNum = hundMod / 100;
        // modulus 100
        int tenMod = hundMod % 100;
        // divide by 10
        int oneNum = tenMod / 10;
        // modulus 10
        int oneMod = tenMod % 10;
	}
}