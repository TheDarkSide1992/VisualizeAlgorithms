package visualizealgorithms.bll.algorithm.Seartch;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BinarySearch extends GenericAlgorithm {

    public BinarySearch() {
        super("Binary Search", "Sertches in a sortet array", AlgorithmType.SEARCHING);
    }

    @Override
    public void doWork() {
        int[]b = (int[]) super.getData();
        int key = 7;


        binarySearch(b,key,0,b.length);
    }

    public static int binarySearch(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        } else {
            int m = (left + right / 2);
            int value = arr[m];

            if (key == value)
                return m;//base case
            else if (key < value)
                return binarySearch(arr, key, left, m - 1);
            else
                return binarySearch(arr, key, m + 1, right);
        }
    }
}
