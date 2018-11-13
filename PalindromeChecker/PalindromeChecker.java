import java.util.Scanner;
public class PalindromeChecker
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        int usrLngth = 1;
        while (usrLngth > 0) {
        System.out.print("Enter a String: ");
        String usrIn = input.nextLine();
        usrLngth = usrIn.length();
        String reverse = "";
        for (int i = usrLngth - 1; i >= 0; i--) {
            reverse = reverse + usrIn.charAt(i);
        }
        if (usrLngth < 1) {
            System.out.println("Empty line read - Goodbye");
        }
        else if (usrIn.equals(reverse)) {
            System.out.println("This is a palindrome.");
        }
        else {
            System.out.println("This is not a palindrome.");
        }
    }
}
}