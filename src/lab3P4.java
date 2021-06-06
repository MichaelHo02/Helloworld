import mathRect.*;
public class lab3P4 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 40);
        Rectangle b = new Rectangle(3.5, 35.9);
        System.out.println(a.width + " " + a.height + " " + a.getArea() + " " + a.getPerimeter());
        System.out.println(b.width + " " + b.height + " " + b.getArea() + " " + b.getPerimeter());
    }
}
