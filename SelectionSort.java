import java.util.Scanner;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr  = new int[10];

        System.out.println("Enter the Array to be sorted");

        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }


        for(int i=0;i<arr.length;i++){
            int[] m=MinValue(arr,i);
            if(arr[i]>m[0]){
               int a =arr[i];
               arr[i]=m[0];
               arr[m[1]]=a;
            }
        }

        System.out.print("The sorted array is ");

        for(int counter=0; counter<arr.length;counter++)
            System.out.print(arr[counter]+" ");

    }
    public static int[] MinValue(int arr[],int j){
        int minvalue = Integer.MAX_VALUE;
        int min_index[]={minvalue,j};
        for (int i = j; i < arr.length; i++) {
            if (arr[i] < minvalue) {
                minvalue = arr[i];
                min_index[0]=minvalue;
                min_index[1]=i;
            }
        }return min_index;
    }
}





