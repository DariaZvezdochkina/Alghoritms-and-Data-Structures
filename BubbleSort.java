package mainor;

public class BubbleSort {
    
    public static Integer [] arrayToSort = new Integer[]{1, 4, 78, 5, 69, 298, 45, 37, 1, 0};

    public static boolean less(Comparable thisValue, Comparable thatValue) {
        return thisValue.compareTo(thatValue) < 0;
    }

    public static void exchange(Comparable[] array, int indexFrom, int indexTo) {
        Comparable temp = array[indexFrom];
        array[indexFrom] = array[indexTo];
        array[indexTo] = temp;
    }

    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("  ");
        }
        System.out.println("    End of array");
    }
    
    public static void main(String[] args) {
        var five = 5;
        var six = 6;
        System.out.println(less(5, 6));
        System.out.println(arrayToSort.toString());
        BubbleSort ob = new BubbleSort();
        ob.printArray(arrayToSort);
        ob.bubbleSort(arrayToSort);
        System.out.println("Sorted array");
        

        var arrayLength = arrayToSort.length;
        printArray(arrayToSort);

        for (int i = 1; i < arrayLength; i++) { 
            int min = i;
            for (int internalIndex = i; internalIndex > 0 && less(arrayToSort[internalIndex], arrayToSort[internalIndex - 1]); internalIndex--) {
                exchange(arrayToSort, internalIndex, internalIndex - 1);
            }
        }
    }

    public static void bubbleSort (Integer[] arrayToSort) {
        int n = arrayToSort.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
    }
}
