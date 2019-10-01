import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base length. ");
        double base = in.nextDouble();
        in.nextLine();

        System.out.print("Enter the height of the triangle. ");
        double height = in.nextDouble();
        in.nextLine();

        double area = (base * height) / 2;

        System.out.printf("%s %.1f %s %.1f %s %.1f %s", "The area of a triangle with a height and base of", height,  "and", base, "is", area, ".");

        in.close();
    }
}
