import java.util.Arrays;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(a +"th tern is " +fibo(a));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
