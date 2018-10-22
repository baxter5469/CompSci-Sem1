import java.util.Scanner;

public class PaintCalc2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int length;
		int width;
		int height;
		int doors;
		int windows;
		final int FEET_PER_GALLON = 300;
		final int FEET_PER_QUART = 75;
		final int QUART_PER_GALLON = 4;
		//Gets Length of wall
		System.out.println("Enter the length: ");
		length = input.nextInt();
		//Gets width of wall
		System.out.println("Enter the width: ");
		width = input.nextInt();
		//Gets height of wall
		System.out.println("Enter the height: ");
		height = input.nextInt();
		//Asks # of Doors
		System.out.println("Enter the number of doors: ");
		doors = input.nextInt();
		//Asks # of Windows
		System.out.println("Enter the number of windows: ");
		windows = input.nextInt();
		// Calculates and prints square feet
		int doorSpace = doors * 21;
		int windowSpace = windows * 12;
		int wallSpace1 = length * height * 2;
		int wallSpace2 = length * width * 2;
		int totalSpace = wallSpace1 + wallSpace2 - doorSpace - windowSpace;
        System.out.println("Total Square feet: " + totalSpace);
        if (totalSpace < 300) {
			System.out.println("if gallons only: 1 gallon");
		}
		else {
			System.out.println("if gallons only: " + (totalSpace / FEET_PER_GALLON));
		}
		int quarts = totalSpace / FEET_PER_QUART;
		int quartGallons = 0;
		quartGallons += quarts / QUART_PER_GALLON;
		int leftoverQuarts = 0;
		leftoverQuarts = quarts % QUART_PER_GALLON;
		if (leftoverQuarts > 0) {
			System.out.println("if quarts are available: " + quartGallons + " gallons " + leftoverQuarts + " quarts");
		}
		else {
			System.out.println("");
		}
	}

}