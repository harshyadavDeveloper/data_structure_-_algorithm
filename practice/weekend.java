class Main {
    public static void main(String[] args) {
        // bubbleSort();
        // descSelectionSort();
        // newBinarySearch();
        // bubbleSortCount();
        // mergeSortArray();
        // checkArray();
        insertionSort();

    }

    // Task 1: Given {7, 2, 9, 4, 1, 8}, sort it using any one sort of your choice,
    // then binary search for 9 and
    // print its index.
    public static void bubbleSort() {
        int[] arr = { 7, 2, 9, 4, 1, 8 };
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {
            for (int j = 0; j < n - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");

        }
        int tarInd = myBinarySearch(arr, 9);
        System.out.print("Found At: " + tarInd);
    }

    public static int myBinarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int foundIndex = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.print("Found Index at: " + mid);
                foundIndex = mid;
                return foundIndex;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }

        if (foundIndex == -1) {
            System.out.println("Index Not Present");
        }
        return foundIndex;
    }

    // Task: 2 Implement selection sort, but modify it to find the maximum each pass
    // instead of the minimum,
    // building the sorted array in descending order.
    public static void descSelectionSort() {
        int[] arr = { 7, 2, 9, 4, 1, 8 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swapIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[swapIndex]) {
                    swapIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[swapIndex];
            arr[swapIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Given a sorted array {1, 3, 5, 7, 9, 11, 13}, use binary search to find the
    // index where 6 would be inserted
    // if it were added to keep the array sorted (it's not present, so return the
    // position just before the next
    // larger element).
    public static void newBinarySearch() {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
        int insert = 6;
        int target = insert;
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Insert Index At: " + mid);
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        System.out.println("Insert index at: " + start);
    }

    // Task 4: Given {5, 3, 8, 3, 9, 3, 2}, count how many comparisons bubble sort
    // makes in total to fully sort it
    // (add a comparison counter, incrementing once per if check, regardless of
    // whether a swap happens).

    public static void bubbleSortCount() {
        int[] arr = { 5, 3, 8, 3, 9, 3, 2 };
        int count = 0;
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }

            }

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("Count: " + count);
    }

    // Task 5: Merge-sort style thinking (no new syntax, just logic): given two
    // already sorted arrays of different
    // lengths, {1,3,5,7,9} and {2,4,6}, merge them (reuse your Week 2 Day 3 merge
    // logic).

    public static void mergeSortArray() {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6 };
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) { // clean up if some values still remains in arr1 and arr2 gets empty
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) { // vice-versa of above
            merged[k] = arr2[j];
            j++;
            k++;
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    // task 6: Given an array, determine whether it's already sorted in ascending
    // order, without actually sorting
    // it — just a single pass checking neighbors.
    public static void checkArray() {
        int arr[] = { 1, 2, 3, 4, 7, 6 };
        int n = arr.length;
        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) { // n-1 because we are comparing i+1. the question i ask myself is what is the
                                          // maximum values i can have so that i+1 does not go out of bound
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        }
    }

    // task 7: Implement insertion sort but count how many times the while loop's
    // condition is checked in total
    // (not just shifts — every single evaluation of the while condition, true or
    // false).
    public static void insertionSort() {
        int[] arr = { 5, 3, 8, 3, 9, 3, 2 };
        int n = arr.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            boolean condition = true;
            int j = i - 1;
            while (condition) {
                count++;
                condition = j >= 0 && arr[j] > key;
                if (condition) {
                    arr[j + 1] = arr[j];
                    j--;
                }

            }
            arr[j + 1] = key;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("Count: " + count);

    }

}
