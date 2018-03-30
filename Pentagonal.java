import java.util.Scanner;

public class Pentagonal {
    public static int Hexagon(int n) {
        int pentagonal = n * (3 * n - 1) / 2;
        return pentagonal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = scanner.nextInt();
        int pentagonal = Hexagon(n);
        System.out.println(pentagonal);
    }
}