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

  int child1 = 2 * (index) + 1;
  int child2 = 2 * (index) + 2;
  int bigger;

  if (size > child2){
    if (data[child1] > data[child2]){
      bigger = child1;
    }
    else bigger = child2;
  }

  else bigger = child1; // no child2 so ...

  while (size > bigger && data[bigger] > data[index]){
    swap(data, bigger, index);

    index = bigger;
    child1 = 2 * (index) + 1;
    child2 = 2 * (index) + 2;

    if (size > child2){
      if (data[child1] > data[child2]){
        bigger = child1;
      }
      else bigger = child2;
    }
    else bigger = child1;
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

*/

private static void pushUp(int[]data,int index){

  int location = (index-1) / 2;


  while(index != 0 && data[index] > data[location]){
    swap(data, index, location);

    index = location;
    location = (index-1)/2;
  }
}


/*
//We will discuss this today:
public static void heapify(int[])
- convert the array into a valid heap. [ should be O(n) ]
*/

  public static void heapify (int[] data){
    for (int index = data.length - 1; index >=0; index--){
      pushDown(data, data.length, index);
    }
  }

/*
public static void heapsort(int[])
- sort the array [ should be O(nlogn) ] :
- converting it into a heap
- removing the largest value n-1 times (remove places at end of the sub-array).

*/

  public static void heapsort (int [] data){
    heapify(data);
    int size = data.length;

    while (size != 1){
      swap(data, 0 , size-1);
      size--;
      pushDown(data,size,0);
    }
  }

}
