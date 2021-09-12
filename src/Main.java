import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[100];
        int n = array.length;
        int sum = 0;
        System.out.print("Enter the number of elements you want to store: ");
        n = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n ; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Sum : " + sum);
    }
}
