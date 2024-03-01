import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uchburchak uchlari koordinatalarini kiriting:");
        System.out.print("A ning x koordinatasi: ");
        double x1 = scanner.nextDouble();
        System.out.print("A ning y koordinatasi: ");
        double y1 = scanner.nextDouble();
        System.out.print("B ning x koordinatasi: ");
        double x2 = scanner.nextDouble();
        System.out.print("B ning y koordinatasi: ");
        double y2 = scanner.nextDouble();
        System.out.print("C ning x koordinatasi: ");
        double x3 = scanner.nextDouble();
        System.out.print("C ning y koordinatasi: ");
        double y3 = scanner.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double perimeter = a + b + c;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Uchburchak perimetri: " + perimeter);
        System.out.println("Uchburchak yuzasi: " + area);

        scanner.close();
    }
}
