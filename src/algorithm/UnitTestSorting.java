package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //insertion sort

        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        //Sort sort=new Sort();
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //bubble sort
        //Sort sort=new Sort();
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        //quick sort
        //Sort sort=new Sort();
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.quickSort(unSortedArray,0,unSortedArray.length-1);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //bucket sort
        unSortedArray = new int[]{6,9,2,5,1,0,4};
        sort.bucketSort(unSortedArray,9);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

    }
}
