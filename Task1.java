
/**
 * Задача №1_____________________________________________________________
 * */
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = { 10, 7, 1, 3, 6, 9, 4, 8, 5, 2 };
        int length = array.length;
        System.out.println(Arrays.toString(array));
        sort(array, 0, length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void merge(int array[], int start, int middle, int end) {

        int subarraySize1 = middle - start + 1;
        int subarraySize2 = end - middle;

        int leftArray[] = new int[subarraySize1];
        int rightArray[] = new int[subarraySize2];

        for (int i = 0; i < subarraySize1; ++i)
            leftArray[i] = array[start + i];

        for (int j = 0; j < subarraySize2; ++j)
            rightArray[j] = array[middle + 1 + j];

        int i = 0;
        int j = 0;
        int k = start;

        while (i < subarraySize1 && j < subarraySize2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < subarraySize1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < subarraySize2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void sort(int array[], int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;
            sort(array, start, middle);
            sort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }
}

