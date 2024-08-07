package lab10;

public class SelectionSort {
    private int temp;

    /** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }
}
