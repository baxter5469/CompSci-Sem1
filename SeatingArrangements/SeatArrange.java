import java.util.Scanner;
import java.util.Arrays;
public class SeatArrange
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int usrIn = 0;
        do {
            System.out.print("How many Seats?: ");
            while (!input.hasNextInt()) {
                System.out.println("Not a Valid Number of Seats.");
                input.next();
            }
            usrIn = input.nextInt();
        } while (usrIn < 1);
        System.out.println("Number of Seats added: " + usrIn);
        String[] spaceArray;
        boolean[] spaceArray1;
        spaceArray = new String[usrIn];
        spaceArray1 = new boolean[usrIn];
        for (int i = 0; i < usrIn; i++) {
            spaceArray[i] = "_ ";
            spaceArray1[i] = false;
        }
        for (String i : spaceArray) {
            System.out.print(i);
        }
        int startLngRegion = 0;
        int seatLngRegion = 0;
        int startCurRegion = 0;
        int numSeatsCur = 0;
        int arrayLen = spaceArray.length;
        // spaceArray[arrayLen / 2] = "X ";
        // spaceArray1[arrayLen / 2] = true;
        // System.out.println("");
        // for (String i : spaceArray) {
        //     System.out.print(i);
        // }
        int tempCount = 0;
        boolean xCheck = false;
        for (int i = 0; i < usrIn; i++) {
            // check if spot is true, if not move to next spot. once it hits a true, record location of the true, check if that section is longest. subtract the longest from the location of the true. record that in the longestSectionStart var.
            seatLngRegion = 0;
            startLngRegion = 0;
            tempCount = 0;
            for (int i1 = 0; i1 < usrIn; i1++) {
                if (spaceArray1[i1] == false) {
                    tempCount++;
                    // System.out.println(tempCount);
                }
                if (spaceArray1[i1] == true || i1 == spaceArray.length - 1) { //if you get to a X or the end of row
                    //System.out.println("X or the end of row");
                    if (seatLngRegion < tempCount){ // if the longest region is less then tempCount
                        //System.out.println("\nlongest region is less then tempCount.");
                        seatLngRegion = tempCount; // set longest region to tempCount
                        if (i1 == spaceArray.length - 1 && spaceArray1[i1] == false) {
                            startLngRegion = i1 - seatLngRegion + 1; //find the start location if at end of array
                            //System.out.println("Made it through");
                        }
                        else { // set start location if not at end of array
                            startLngRegion = i1 - seatLngRegion;
                        }
                        tempCount = 0;
                    }
                    tempCount = 0;
                }
                //System.out.println("\n SeatLngRegion: " + seatLngRegion + " StartLNGRegion: " + startLngRegion + " tempCount: " + tempCount);
            }
            int xLoc = seatLngRegion / 2;
            int xPlace = startLngRegion + xLoc;
            //System.out.println("\nXplace: " + xPlace);
            spaceArray[xPlace] = "X ";
            spaceArray1[xPlace] = true;
            System.out.println(" ");
            for (String i2 : spaceArray) {
            System.out.print(i2);
            }
        }
    }
}