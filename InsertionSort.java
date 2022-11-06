// Реализовать алгоритм сортировки вставками

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

    static void randArr(int[] array) {

        Random random = new Random();
                 
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }
    }      
    
    static void printArr(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;            
            while (j > 0 && arr[j-1] >= tmp) {
                arr[j] = arr [j - 1];
                j--;
            }
            arr[j] = tmp;
            }
    }
 
    public static void main(String[] args) {

        System.out.print("Enter your array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();

        int[] arr = new int[size];
        randArr(arr);
        System.out.println("Your array:");
        printArr(arr);

        insertSort(arr);
        System.out.println("Your sorted array:");
        printArr(arr);
    }    
}