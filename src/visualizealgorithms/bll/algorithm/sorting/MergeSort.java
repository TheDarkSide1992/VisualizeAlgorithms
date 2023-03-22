package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class MergeSort extends GenericAlgorithm {
    public MergeSort() {
        super("Merge sort", "divide and congure (O(n log n))", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        Comparable[]b = (Comparable[]) super.getData();

        mergeSort(b, b.length);
    }

    private static void mergeSort(Comparable[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Comparable[] l = new Comparable[mid];
        Comparable[] r = new Comparable[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid].compareTo(a[i]);
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private static void merge(Comparable[] a, Comparable[] l, Comparable[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
