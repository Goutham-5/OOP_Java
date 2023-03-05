
import java.util.*;

class QuickSort {

    static void QSort(String a[], int low, int high){
        int i, j, pivot;
        String temp;
        if(low < high){
            pivot = low;
            i = low+1;
            j = high;
            while (i < j) {
                while (a[i].compareTo(a[pivot]) < 0) {
                    i++;
                }
                while (a[j].compareTo(a[pivot]) > 0) {
                    j--;
                }
                if (i < j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            temp  = a[pivot];
            a[pivot] = a[j];
            a[j] = temp;
            QSort(a, low, j-1);
            QSort(a, j+1, high);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Strings: ");
        int n = sc.nextInt();

        String arr[] = new String[n+1];

        System.out.println("Enter the names ");
        for (int i = 0; i < n+1; i++) {
            arr[i] = sc.nextLine();
            //arr[i] = sc.nextLine();
        }

        QSort(arr,1,n);
        System.out.println("\n__After Quick Sort__\n");
        for(int i=1;i<n+1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}