package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {

    public BubbleSort() {
        super("Bubble Sort", "Slow (O^2)", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        Comparable[]b = (Comparable[]) super.getData();

        for (int i = 0; i < b.length; i++){
            for (int j = 1; j < b.length-1; j++){
                if (b[j - 1].compareTo(b[j])>0){
                    Comparable tmp = b[j-1];
                    b[j-1] = b[j];
                    b[j] = tmp;
                }
            }
        }
    }
}
