import java.util.Scanner;
public class E618
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Side Length: ");
        int usrIn = input.nextInt();
        int counter = 1;
        int counter1 = 1;
        for (int numLen = 0;numLen < usrIn; numLen++){
            for (int numOf = 0;numOf< usrIn; numOf++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int numOf2 = 0;numOf2 < usrIn; numOf2++) {
                // check if its top or bottom
                if (counter == 1 || counter == usrIn) {
                    // for (int numOf1 = 0;numOf1 <= usrIn; numOf1++) {
                        System.out.print("*");
                    //}
                }
                // if not top/bottom print middle
                else {
                    if (counter1 == 1 || counter1 == usrIn) {
                        System.out.print("*");
                        counter1++;
                    }                 
                    else {
                        System.out.print(" ");
                        counter1++;
                    }
                }
            }
            counter++;
            counter1 = 1;
            System.out.println("");
        }
    }
}