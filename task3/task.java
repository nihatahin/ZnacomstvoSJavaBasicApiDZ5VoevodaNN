package task3;

import java.util.Arrays;

public class task {
    public static void main(String args[])
    {
        int arr[] = {4, 10, 3, 5, 1};
        System.out.printf("Input array: ");
        System.out.println(Arrays.toString(arr));


        System.out.printf("\nOutput array: ");
        System.out.println(Arrays.toString(sort(arr)));
    }


    public static int[] sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; --i)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; --i)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        return arr;
    }

    public static void heapify(int arr[], int n, int i)
    {
        int cur_max = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[cur_max])
            cur_max = left;

        if (right < n && arr[right] > arr[cur_max])
            cur_max = right;

        if (cur_max != i)
        {
            int swap = arr[i];
            arr[i] = arr[cur_max];
            arr[cur_max] = swap;

            heapify(arr, n, cur_max);
        }
    }

}
