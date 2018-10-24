import java.util.Scanner;
public class RomanNumeral
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        String romNum = "Roman Numeral";
        int romanInt;
        System.out.print("Enter a positive single digit integer: ");
        romanInt = input.nextInt();
        if (romanInt % 100 == 1) {
            System.out.print(romNum + " I");
        }
        if (romanInt % 100 == 2) {
            System.out.print(romNum + " II");
        }
        if (romanInt % 100 == 3) {
            System.out.print(romNum + " III");
        }
        if (romanInt % 100 == 4) {
            System.out.print(romNum + " IV");
        }
        if (romanInt % 100 == 5) {
            System.out.print(romNum + " V");
        }
        if (romanInt % 100 == 6) {
            System.out.print(romNum + " VI");
        }
        if (romanInt % 100 == 7) {
            System.out.print(romNum + " VII");
        }
        if (romanInt % 100 == 8) {
            System.out.print(romNum + " VIII");
        }
        if (romanInt % 100 == 9) {
            System.out.print(romNum + " IX");
        }
	}
}