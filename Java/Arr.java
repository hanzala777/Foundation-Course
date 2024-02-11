import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum: " + sum);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
            min = Math.min(arr[i], min);
//            if(arr[i] > max){
//                max = arr[i];
//            }
            max = Math.max(arr[i], max);
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
}

