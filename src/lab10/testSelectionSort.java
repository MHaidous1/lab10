package lab10;
/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    @Test
    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};
        assertArrayEquals(sortedArr, new SelectionSort().basicSelectionSort(arr));
    }

    @Test
    public void testNegative() {
        int[] arr = {-3, -1, -2, -4, -5};
        int[] sortedArr = {-5, -4, -3, -2, -1};
        assertArrayEquals(sortedArr, new SelectionSort().basicSelectionSort(arr));
    }

    @Test
    public void testMixed() {
        int[] arr = {3, -2, 0, 2, -1};
        int[] sortedArr = {-2, -1, 0, 2, 3};
        assertArrayEquals(sortedArr, new SelectionSort().basicSelectionSort(arr));
    }

    @Test
    public void testDuplicates() {
        int[] arr = {3, 3, -2, 2, -2};
        int[] sortedArr = {-2, -2, 2, 3, 3};
        assertArrayEquals(sortedArr, new SelectionSort().basicSelectionSort(arr));
    }
}