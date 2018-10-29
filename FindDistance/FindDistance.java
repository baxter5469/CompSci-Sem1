import java.util.Scanner;
import java.lang.Math.*;
public class FindDistance
{
	public static void main(String[] args)
	{
        double houseX,houseY,errandOneX,errandOneY,errandTwoX,errandTwoY,errandOneXDist,errandOneDist,errandTwoDist;
        Scanner input = new Scanner(System.in);
        System.out.println("The House:");
        System.out.print("Enter the x coordinate: ");
        houseX = input.nextInt();
        System.out.print("Enter the y coordinate: ");
        houseY = input.nextInt();
        System.out.println(" ");
        System.out.println("Errand 1:");
        System.out.print("Enter the x coordinate: ");
        errandOneX = input.nextInt();
        System.out.print("Enter the y coordinate: ");
        errandOneY = input.nextInt();
        System.out.println(" ");
        System.out.println("Errand 2:");
        System.out.print("Enter the x coordinate: ");
        errandTwoX = input.nextInt();
        System.out.print("Enter the y coordinate: ");
        errandTwoY = input.nextInt();
        System.out.println(" ");
        errandOneDist = Math.sqrt(Math.pow((errandOneX - houseX),2)+Math.pow((errandOneY - houseY),2));
        errandTwoDist = Math.sqrt(Math.pow((errandTwoX - houseX),2)+Math.pow((errandTwoY - houseY),2));
        System.out.println("Errand 1 distance: " + errandOneDist);
        System.out.println("Errand 2 distance: " + errandTwoDist);
        if (Math.abs(errandOneDist - errandTwoDist) < 0.5) {
            System.out.println("They are similar");
        }
        else {
            if (errandOneDist > errandTwoDist) {
                System.out.println("Errand 1 is farther");
            }
            else {
                
            }
            if (errandOneDist < errandTwoDist) {
                System.out.println("Errand 2 is farther");
            }
            else {
                
            }
        }
        
	}
}