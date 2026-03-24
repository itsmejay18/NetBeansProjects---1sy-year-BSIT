
package exam;
import java.util.*;


public class Exam {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Input Length of an Array");
        int len = sc.nextInt();
        
        int [] numbers = new int [len];
        
        System.out.println("Input Numbers to the Array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array : " + Arrays.toString(numbers));
        sc.nextLine();
        
        System.out.println("Choose a Sorting");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Selection Sort");
        System.out.println("4. Shell Sort");
        System.out.println("5. Merge Sort");
        System.out.println("6. Quick Sort");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1: 
                Bubblesort(numbers);
                System.out.println("Bubble Sort: " + Arrays.toString(numbers));
                break;
            case 2: 
                insertionSort(numbers);
                System.out.println("Insertion Sort: " + Arrays.toString(numbers));
                break;
            case 3:
                selectionSort(numbers);
                System.out.println("Seletion Sort: " + Arrays.toString(numbers));
                break;
            case 4:
                shellSort(numbers);
                System.out.println("Shell Sort: " + Arrays.toString(numbers));
                break;
            case 5:
                sort(numbers);
                System.out.println("Merge Sort: " + Arrays.toString(numbers));
                break;
            case 6:
                quickSort(numbers, 0, numbers.length - 1);
                System.out.println("Quick Sort: " + Arrays.toString(numbers));
                break;
        } 
      }
    
    static void Bubblesort (int [] myArray) {
        
    int n = myArray.length;
    
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - 1 - i; j++) {
            if (myArray[j] > myArray[j + 1]) {
                int temp = myArray[j];
                myArray[j] = myArray [j + 1];
                myArray[j + 1] = temp; 
            }       
        }
    }
    }
    
    static void insertionSort (int [] myArray) {
        
        int n = myArray.length;
        
        for(int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;
            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = key;
        }
    }
    
    static void selectionSort (int [] myArray) {
        
        int n = myArray.length;
        
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (myArray[j] < myArray[minIndex]){
                    minIndex = j;
                }
                int temp = myArray[minIndex];
                myArray[minIndex] = myArray[i];
                myArray[i] = temp;
            }
        }
    }
    
    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    static void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        sort(left);
        sort(right);

        merge(arr, left, right);
    }

    
    static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i++;
    }

}
