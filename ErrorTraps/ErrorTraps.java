import java.util.Scanner;
public class ErrorTraps
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Type a single charter: ");
        String usrInput = input.nextLine();
        String letter;
        char usrInputSingle = usrInput.charAt(0);  
        int usrNum = usrInputSingle;
        if (usrInput.length() < 2 && usrNum > 64 && usrNum < 122) {
                switch (usrNum) {
                        case 65: letter = "Vowel";
                        break;
                        case 69: letter = "Vowel";
                        break;
                        case 73: letter = "Vowel";
                        break;
                        case 79: letter = "Vowel";
                        break;
                        case 85: letter = "Vowel";
                        break;
                        case 97: letter = "Vowel";
                        break;
                        case 101: letter = "Vowel";
                        break;
                        case 105: letter = "Vowel";
                        break;
                        case 111: letter = "Vowel";
                        break;
                        case 117: letter = "Vowel";
                        break;
                        default: letter = "Consontant";
                        break;
                }
                System.out.print(letter);
        }
        else {
                System.out.println("Invalid");
        }
}
}
