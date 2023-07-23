import java.util.Scanner;

public class sample{
    public static void calc(int arr[],int n){

        // Calculate the sum and count of numbers divisible by 3 and even
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }

        // Calculate and display the average
        double average = (double) sum / count;
        System.out.println(average);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n]; 

        for(int i =0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        calc(arr, n);


    }
}