import java.util.Scanner;
public class PalindromeChecker
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        int usrLngth = 1;
        int palindrome_counter = 0;
        while (usrLngth > 0) {
        System.out.print("Enter a String: ");
        String usrIn = input.nextLine();
        usrLngth = usrIn.length();
        char reverse = 'b';
        char reverse1 = 'b';
        int lastIndex = usrLngth - 1;
        for (int i = (usrLngth / 2) - 1; i >= 0; i--) {
            reverse = usrIn.charAt(i);
            reverse1 = usrIn.charAt(lastIndex - i);
            if (reverse == reverse1) {
                palindrome_counter++;
            }
            else {
                palindrome_counter = 0;
            }
        }
        if (usrLngth < 1) {
            System.out.println("Empty line read - Goodbye");
        }
        else if (palindrome_counter > 1) {
            System.out.println("This is a palindrome.");
        }
        else {
            System.out.println("This is not a palindrome.");
        }
    }
}
}