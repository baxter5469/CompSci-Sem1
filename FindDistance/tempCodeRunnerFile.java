import java.util.Scanner;
public class FindDistance
{
	public static void main(String[] args)
	{
        int houseX,houseY,errandOneX,errandOneY,errandTwoX,errandTwoY;
        Scanner input = new Scanner(System.in);
        System.out.println("The House:");
        System.out.println("Enter the x coordinate: ");
        houseX = input.nextInt();
        System.out.println("Enter the y coordinate: ");
        houseY = input.nextInt();
        System.out.println(" ");
        System.out.println("Errand 1:");
        System.out.println("Enter the x coordinate: ");
        errandOneX = input.nextInt();
        System.out.println("Enter the y coordinate: ");
        errandOneY = input.nextInt();
        System.out.println(" ");
        System.out.println("Errand 2:");
        System.out.println("Enter the x coordinate: ");
        errandTwoX = input.nextInt();
        System.out.println("Enter the y coordinate: ");
        errandTwoY = input.nextInt();
        System.out.println(" ");
        // System.out.println("Errand 1 distance: " + );
        // System.out.println("Errand 2 distance: " + );
        System.out.println(" ");
        System.out.println("is farther");
	}
}