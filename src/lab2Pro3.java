import java.util.Arrays;
import java.util.Scanner;

public class lab2Pro3 {
    public static void main(String[] args) {
        // input
        String[] userArr = userInput();
        // convert to int
        int[] intArr = convertInt(userArr);
        // sort the arr
        Arrays.sort(intArr);
        // compare
        String s = Arrays.toString(intArr);
        String s1 = Arrays.toString(userArr);
        if (s.equals(s1)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }

    }
    static String[] userInput() {
        Scanner input = new Scanner(System.in);
        String userStr = input.nextLine();
        return userStr.split(" ");
    }
    static int[] convertInt(String[] userArr) {
        int[] intArr = new int[userArr.length];
        for(int i = 0; i < userArr.length; ++i) {
            intArr[i] = Integer.parseInt(userArr[i]);
        }
        return intArr;
    }
}
