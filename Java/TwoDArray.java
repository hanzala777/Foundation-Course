import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First matrix: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter First matrix: ");
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        System.out.println("Sum is: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
