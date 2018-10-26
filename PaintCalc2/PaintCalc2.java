import java.util.Scanner;
import java.lang.Math.*;
public class PaintCalc2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double height;
		int doors;
		int windows;
		final int FEET_PER_GALLON = 300;
		final int FEET_PER_QUART = 75;
		final int QUART_PER_GALLON = 4;
		//Gets Length of wall
		System.out.println("Enter the length: ");
		length = input.nextDouble();
		//Gets width of wall
		System.out.println("Enter the width: ");
		width = input.nextDouble();
		//Gets height of wall
		System.out.println("Enter the height: ");
		height = input.nextDouble();
		//Asks # of Doors
		System.out.println("Enter the number of doors: ");
		doors = input.nextInt();
		//Asks # of Windows
		System.out.println("Enter the number of windows: ");
		windows = input.nextInt();
		// Calculates and prints square feet
		double doorSpace = doors * 21;
		double windowSpace = windows * 12;
		double wallSpace1 = length * height * 2;
		double wallSpace2 = height * width * 2;
		double totalSpace = wallSpace1 + wallSpace2 - doorSpace - windowSpace;
        System.out.println("Total Square feet: " + totalSpace);
        if (totalSpace < 300) {
			System.out.println("if gallons only: 1 gallon");
		}
		else {
			System.out.println("if gallons only: " + (totalSpace / FEET_PER_GALLON));
		}
		double totalGal1 = totalSpace / FEET_PER_GALLON;
		double totalGal = Math.ceil(totalGal1);
		double leftoverSpace1 = totalSpace / FEET_PER_QUART;
		double leftoverSpace = Math.ceil(leftoverSpace1);
		if (totalSpace % FEET_PER_QUART != 0) {
			leftoverSpace++;
		}
		if (leftoverSpace > 0) {
			System.out.println("if quarts are available: " + totalGal + " gallons " + leftoverSpace + " quarts");
		}
		else {
			System.out.println("if quarts are available: " + leftoverSpace + " quarts");
		}
	}

}