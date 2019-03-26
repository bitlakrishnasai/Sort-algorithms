import java.util.Scanner;

public class quicksort1 {
    public static void main(String[] args) {
        int[] arr  = new int[10];

        System.out.println("Enter the Array to be sorted");

        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }


         int[] a = quickSort(arr,0,arr.length-1);

        System.out.print("The sorted array is ");

        for(int counter=0; counter<arr.length;counter++)
            System.out.print(arr[counter]+" ");
    }
public static int[] quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);

    }return arr;
}
private static int partition(int arr[], int begin, int end) {
int pivot = arr[end];
int i = (begin-1);
for (int j = begin; j < end; j++) {
if (arr[j] <= pivot) {
i++;

int swapTemp = arr[i];
arr[i] = arr[j];
arr[j] = swapTemp;
}
}

int swapTemp = arr[i+1];
arr[i+1] = arr[end];
arr[end] = swapTemp;

return i+1;
    }}