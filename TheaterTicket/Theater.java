import java.util.*;
public class Theater
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int col = 0;
        int row = 0;
        int[][] x = {{1,2,3,4,5,6,7,8,9,10},
        {10,10,10,10,10,10,10,10,10,10},
        {10,10,10,10,10,10,10,10,10,10},
        {10,10,10,10,10,10,10,10,10,10},
        {10,10,20,20,20,20,20,20,10,10},
        {10,10,20,20,20,20,20,20,10,10},
        {10,10,20,20,20,20,20,20,10,10},
        {20,20,30,30,40,40,30,30,20,20},
        {20,30,30,40,50,50,40,30,30,20},
        {30,40,50,50,50,50,50,50,40,30}};
        int tempRow = 10;
        for (int i = 0; i < 10; i++){
            tempRow--;
            if (i == 0){
                System.out.print("Seat#:");
            }
            if (i != 0){
                System.out.print("Row " + tempRow + ":");
            }
            for (int j = 0; j < 10; j++) {
                if (i == 0){
                    if (j == 8){
                        System.out.printf("%6d",x[i][j]);
                        }
                    if (j != 8){
                        System.out.printf("%6d",x[i][j]);
                        }
                }
                if (i != 0){
                //System.out.print(x[i][j] + " ");
                System.out.printf("%6d",x[i][j]);
                }
            }
            System.out.println();    
            }
        boolean inputCheck = false;
        int usrChange = 0;
        while (inputCheck == false){
            System.out.println("How many tickets are you purchasing?: ");
            if (input.hasNextInt()){
                usrChange = input.nextInt();
                inputCheck = true;
            }
            else {
                System.out.println("Invalid Input!");
            }
        }
        int tempCount = 0;
        int finalCount = 0;
        int tempSeat = 0;
        int numTicketsSold = 0;
        int ticketTotal = 0;
        int tempCheck = 0;
        for (int i = 0; i < usrChange; i++){
            System.out.println("Enter the row of your seat choice: ");
            tempCount = input.nextInt();
            tempCount = 9 - tempCount;
            System.out.println("Enter the seat Number: ");
            tempSeat = input.nextInt();
            tempSeat = tempSeat - 1;
            tempCheck = x[tempCount][tempSeat];
            if (tempCheck == 0){
                System.out.println("seat unavailable");
                i--;
            }
            else {
                ticketTotal += x[tempCount][tempSeat];
                x[tempCount][tempSeat] = 0;
                numTicketsSold++;
            }
        }
        tempRow = 10;
        for (int i = 0; i < 10; i++){
            tempRow--;
            if (i == 0){
                System.out.print("Seat#:");
            }
            if (i != 0){
                System.out.print("Row " + tempRow + ":");
            }
            for (int j = 0; j < 10; j++) {
                if (i == 0){
                    if (j == 8){
                        System.out.printf("%6d",x[i][j]);
                        }
                    if (j != 8){
                        System.out.printf("%6d",x[i][j]);
                        }
                }
                if (i != 0){
                //System.out.print(x[i][j] + " ");
                System.out.printf("%6d",x[i][j]);
                }
            }
            System.out.println();    
            }
        System.out.println("Number of Tickets sold: " + numTicketsSold);
        System.out.println("Amount Due: $" + ticketTotal);
        // String[][] theaterArray = new String[11][11];
        // theaterArray[0] =
        // System.out.println(theaterArray[row][col]);
        // col = 10;
        // for (int i = 0; i < 9; i++){
        //     col--;
        //     theaterArray[row][col] = "Row " + col + ":";
        //     System.out.println(theaterArray[row][col]);
        // }
        }
}