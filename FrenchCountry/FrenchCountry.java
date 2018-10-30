import java.util.Scanner;
public class FrenchCountry
{
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a French Country: ");
		String usrIn1 = input.nextLine();
		String usrIn = usrIn1.toLowerCase();
		String usrOut;
		char lastChar = usrIn.charAt(usrIn.length() - 1);
		if (usrIn.charAt(0) == 'a' || usrIn.charAt(0) == 'e' || usrIn.charAt(0) == 'i' || usrIn.charAt(0) == 'o' || usrIn.charAt(0) == 'u') {
			usrOut = "L'";
		}
		else if (lastChar == 'e' ) {
			switch (usrIn) {
				case "belize":
				case "cambodge":
					usrOut = "le";
					break;
				case "mexique": usrOut = "le";
				break;
				case "mozambique": usrOut = "le";
				break;
				case "zaire": usrOut = "le";
				break;
				case "zimbabwe": usrOut = "le";
				break;
				default: usrOut = "la";
			}
		}
		else {
			switch (usrIn) {
				case "estats-unis": usrOut = "les";
				break;
				case "pays-bas": usrOut = "les";
				break;
				default: usrOut = "le";
			}
		}
		System.out.println(usrOut + " " + usrIn);
	}
}
