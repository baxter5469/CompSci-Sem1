import java.util.Scanner;

import jdk.nashorn.internal.ir.BreakableNode;
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
        String thousRom;
        switch (thousNum) {
            case 1: thousRom = "M";
                    break;
            case 2: thousRom = "MM";
                    break;
            case 3: thousRom = "MMM";
                    break;
            default: thousRom = "";
                    break;
        }
        String hundRom;
        switch (hundNum) {
            case 1: hundRom = "C";
                    break;
            case 2: hundRom = "CC";
                    break;
            case 3: hundRom = "CCC";
                    break;
            case 4: hundRom = "CD";
                    break;
            case 5: hundRom = "D";
                    break;
            case 6: hundRom = "DC";
                    break;
            case 7: hundRom = "DCC";
                    break;
            case 8: hundRom = "DCCC";
                    break;
            case 9: hundRom = "CM";
                    break;
            default: hundRom = "";
                    break;
        }
        String oneRom;
        switch (oneNum) {
            case 1: oneRom = "X";
                    break;
            case 2: oneRom = "XX";
                    break;
            case 3: oneRom = "XXX";
                    break;
            case 4: oneRom = "XL";
                    break;
            case 5: oneRom = "L";
                    break;
            case 6: oneRom = "LX";
                    break;
            case 7: oneRom = "LXX";
                    break;
            case 8: oneRom = "LXXX";
                    break;
            case 9: oneRom = "XC";
                    break;
            default: oneRom = "";
                    break;
        }
        String oneLRom;
        switch (oneMod) {
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
            default: oneLRom = "";
                    break;
        }
        System.out.print(thousRom + hundRom + oneRom + oneLRom);
	}
}