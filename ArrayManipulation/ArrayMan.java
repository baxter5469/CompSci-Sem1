import java.util.Arrays;
import java.util.Random;
public class ArrayMan
{
	public static void main(String[] args)
	{
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int randomNum = rand.nextInt(101);
        int randomNum1 = rand.nextInt(101);
        int randomNum2 = rand.nextInt(101);
        int randomNum3 = rand.nextInt(101);
        int randomNum4 = rand.nextInt(101);
        int randomNum5 = rand.nextInt(101);
        int randomNum6 = rand.nextInt(101);
        int randomNum7 = rand.nextInt(101);
        int randomNum8 = rand.nextInt(101);
        int randomNum9 = rand.nextInt(101);
        int[] randomArray;
        randomArray = new int[]{randomNum,randomNum1,randomNum2,randomNum3,randomNum4,randomNum5,randomNum5,randomNum6,randomNum7,randomNum8,randomNum9};
        String array = Arrays.toString(randomArray);
        System.out.println("Initial Random Array: " + array);
        int arrayLng = randomArray.length;
        int currentSmallest = 100;
        int arrayNum = 0;
        int arrayTotal = 0;
        for (int i = 0; i < arrayLng; i++) {
            arrayNum = randomArray[i];
            if (arrayNum < currentSmallest) {
                currentSmallest = arrayNum;
            }
            arrayTotal += randomArray[i];
        }
        System.out.println("Smallest Value: " + currentSmallest);
        System.out.println("Sum of the Array: " + arrayTotal);
        int arrayNoSmall = arrayTotal - currentSmallest;
        System.out.println("Sum without the smallest value: " + arrayNoSmall);
        int arrayHigh = randomArray[arrayLng - 1];
        for (int i = arrayLng - 1; i > 0; i--) {
            randomArray[i] = randomArray[i-1];
        }
        randomArray[0] = arrayHigh;
        array = Arrays.toString(randomArray);
        System.out.println("Array Shifted: " + array);
        int tempEven = 0;
        for (int i = 0; i < arrayLng; i++) {
            tempEven = randomArray[i];
            if (tempEven % 2 == 0) {
                randomArray[i] = 0;
                System.out.println(tempEven + "Even Replaced!");
            }
            else {
                System.out.println(tempEven + "passed");
            }
        }
        array = Arrays.toString(randomArray);
        System.out.println("Even Values Replaced: " + array);
    }
}