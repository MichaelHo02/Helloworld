import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class lab2Problem2 {
    public static void main(String[] args) {
        // input_string
        String user = inputString();
        // convert to arraylist
        String[] userArr = user.split(" ");
        // count
        HashMap<String, Integer> track = new HashMap<String, Integer>();
        count(userArr, track);
        // display
        display(track);
    }
    static String inputString() {
        Scanner input = new Scanner(System.in);
        String scanStr = input.nextLine();
        return scanStr;
    }
    static void count(String[] userArr, HashMap<String, Integer> track) {
        for (int i = 0; i < userArr.length; ++i) {
            if (track.get(userArr[i]) == null) {
                track.put(userArr[i], 1);
            } else if (track.get(userArr[i]) != null) {
                track.put(userArr[i], track.get(userArr[i]) + 1);
            }
        }
    }
    static void display(HashMap<String, Integer> track) {
        for (String i : track.keySet()) {
            System.out.println(i + " occurs " + track.get(i) + ((track.get(i) < 2)? " time" : " times"));
        }
    }
}