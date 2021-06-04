import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {
    public static void main(String[] args) {
    //      question w1
    //        test(); // p1
    //        divisible(); //p2
    //        checkCircle(); // p3
    //        table(); //p4
    //        display(); //p5
    //        pyramid(); // p6

    //        question w2
        }
    public static void test() {
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < num.length; ++i) {
            num[i]= input.nextInt();
        }
        for (int i = 0; i < num.length; ++i) {
            for (int j = i+1; j < num.length; ++j) {
                if (num[i] > num[j]) {
                    num[i] += num[j];
                    num[j] = num[i] - num[j];
                    num[i] = num[i] - num[j];
                }
            }
        }
        for (int i : num) {
            System.out.println(i);
        }
    }

    public static void divisible() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();
        if ((n % 5 == 0) && (n % 6 == 0)) System.out.println(n + " is divisible for 5 and 6");
        else if ((n % 5 == 0) || (n % 6 == 0)) System.out.println(n + " is divisible for 5 or 6");
        else System.out.println(n + " is not divisible for either 5 or 6");
    }

    public static void checkCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first coord2inate");
        Coordinate a = new Coordinate();
        System.out.print("Enter x: ");
        a.x = input.nextFloat();
        System.out.print("Enter y: ");
        a.y = input.nextFloat();
        System.out.print("Enter r: ");
        a.r = input.nextFloat();
        System.out.println("Enter second coordinate");
        Coordinate b = new Coordinate();
        System.out.print("Enter x: ");
        b.x = input.nextFloat();
        System.out.print("Enter y: ");
        b.y = input.nextFloat();
        System.out.print("Enter r: ");
        b.r = input.nextFloat();

        double distance = Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        if (distance <= Math.abs(a.r - b.r))
            System.out.println("circle2 is inside circle1");
        else if (distance <= a.r + b.r)
            System.out.println("circle2 is overlap circle1");
    }

    public static void table() {
        System.out.println("Miles|Kilometers");
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i + "....|...." + i * 1.609);
        }
        System.out.println("Kilometers|Miles");
        for (int i = 20; i <= 65; i+=5) {
            System.out.println(i + "..|.." + i / 1.609);
        }
    }

    public static void display() {
        int count = 0;
        for (int i = 100; i < 200; ++i) {
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
                System.out.print(i + " ");
                ++count;
                if (count % 10 == 0) {
                    System.out.print("\n");
                    count = 0;
                }
            }
        }
    }

    public static void pyramid() {
        char space = ' ';
        System.out.println("Enter number from 1-15");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n; i > 0; --i) {
            for (int z = i - 1; z >= 0; --z) {
                System.out.printf("%4c", space);
            }
            for (int j = n - i + 1; j > 0; --j) {
                System.out.printf("%4d", j);
            }
            for (int h = 2; h <= n - i + 1; ++h) {
                System.out.printf("%4d", h);
            }
            System.out.print("\n");
        }
    }
}
