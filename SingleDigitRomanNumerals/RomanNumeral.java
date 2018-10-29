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
        String oneLRom;
        switch (romanInt) {
            case 1: oneLRom = "I";
                    break;
            case 2: oneLRom = "II";
                    break;
            case 3: oneLRom = "III";
                    break;
            case 4: oneLRom = "IV";
                    break;
            case 5: oneLRom = "V";
                    break;
            case 6: oneLRom = "VI";
                    break;
            case 7: oneLRom = "VII";
                    break;
            case 8: oneLRom = "VIII";
                    break;
            case 9: oneLRom = "IX";
                    break;
            default: oneLRom = "Invalid positive single digit";
                    break;
        }
        System.out.print("Roman Numeral " + oneLRom);
	}
}