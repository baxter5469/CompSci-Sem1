import java.util.Scanner;
public class MagicSquares
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int usrIn = 0;	
        // validating the input is a number AND is odd.
        while (check == true){
            System.out.print("Enter an odd number: ");
            if (input.hasNextInt()) {
                usrIn = input.nextInt();
                if (usrIn % 2 != 0){
                    check = false;
                }
                else {
                    System.out.println("Not an Odd Number!");
                }
                }
            else {
            System.out.println("Invalid Input!");
                }
            }
        int[][] magicArray = new int[usrIn][usrIn];
        //testing if made past input valid
        // System.out.print("Made it through validation!");
        int num = 1;
        int row = 0;
        int column = usrIn / 2;
        int tempRow = 0;
        int tempCol = 0;
        while (num <= usrIn * usrIn){
            magicArray[row][column] = num;
            num++;
            tempRow = row;
            tempCol = column;
            row -= 1;
            column += 1;
            // checking row value
            // System.out.println("Row Value: " + row);
            if (row == -1){
                row = usrIn - 1;
                }
            if (column == usrIn) {
                column = 0;
                }
            if (magicArray[row][column] != 0){
                row = tempRow + 1;
                column = tempCol;
                if (row == -1){
                    row = usrIn - 1;
                    }
                }   
            }
        int arrayLng = magicArray.length;
        for (int i = 0; i < arrayLng; i++){
            for (int i1 = 0; i1 < arrayLng; i1++){
                System.out.print(magicArray[i][i1] + " ");
                }
            System.out.println();
            }
        }
}