import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        array[3] = scanner.nextInt();


        for (int j = 0; j < 4; j++) {
            for (int i = 4 - 1; i > j; i--) {
                if (array[i] < array[i - 1]) {
                    int smallNumber = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = smallNumber;
                }
            }
        }
        System.out.println(array[3]);
    }
}

