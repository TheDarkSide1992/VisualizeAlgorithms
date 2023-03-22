package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class QuickSort extends GenericAlgorithm {

    public QuickSort() {
        super("QuickSort", "It's a quick one (O(n log n ))", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        Comparable[]b = (Comparable[]) super.getData();

        quickSort(b, 0,b.length-1);
    }

    private void quickSort(Comparable arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(Comparable arr[], int begin, int end) {
        Comparable pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                Comparable swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Comparable swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
