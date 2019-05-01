import java.util.*;
public class MyHeap{
  /*

  //We discussed these 2 methods already:
  private static void pushDown(int[]data,int size,int index)
  - size  is the number of elements in the data array.
  - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
  - precondition: index is between 0 and size-1 inclusive
  - precondition: size is between 0 and data.length-1 inclusive.
  private static void pushDown(int[] data,int size,int index) {

  */
  private static void pushDown(int[] data,int size,int index) {
  if (size % 2 == 0 && 2*index+1 == size-1) {
    if (data[index] < data[2*index+1]) {
      swap(data,index,2*index+1);
      return; // do nothing
    }
  }
  }

  private static void swap(int[] data, int idx1, int idx2) {
   int temp = data[idx2];
   data[idx2] = data[idx1];
   data[idx1] = temp;
 }

/*
private static void pushUp(int[]data,int index)
- push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
- precondition: index is between 0 and data.length-1 inclusive.

//We will discuss this today:
public static void heapify(int[])
- convert the array into a valid heap. [ should be O(n) ]

public static void heapsort(int[])
- sort the array [ should be O(nlogn) ] :
- converting it into a heap
- removing the largest value n-1 times (remove places at end of the sub-array).

*/

}
