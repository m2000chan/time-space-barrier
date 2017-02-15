//TimeSpaceBarrier (Kevin Bao & Nikita Borisov & Max Chan)
//APCS2 pd01
//hw #07: what does the data say?
//due: 2017-02-15
//
/*======================================
  class MergeSortTester
  ALGORITHM:
  This is a recursive algorithm, whose base case is recieving a array
  of length one (which it simply returns). If the array is longer than length
  one, then the program will create two arrays that will respectively contain
  the first and second half of the elements the program is attempting to sort.
  It will then call MergeSort on both sub-arrays and use a linear run time merge
  algorithm to combine the two sorted sub-arrays into one sorted array which 
  will be returned.
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(n*logn)
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=1,000,000  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) {
        int[] one = {1};
        int[] ten = new int[10];
        int[] hun = new int[100];
        int[] hunthou = new int[100000];
        for (int x = 0; x < 10; x++){
            ten[x] = (int) (Math.random() * 10);
        }
        for (int x = 0; x < 100; x++){
            hun[x] = (int) (Math.random() * 100);
        }
        for (int x = 0; x < 100000; x++){
            hunthou[x] = (int) (Math.random() * 100000);
        }
        long y = 0;
        long x = System.nanoTime();
        for (int z = 0; z < 1000; z ++){
            MergeSort.sort(one);
        }
        y = System.nanoTime();
        System.out.println("Avg execution time for sort of array with size one (1000 trials): ");
        System.out.println((int) (y - x) / 1000);
        System.out.println(" Nanoseconds");
        
        x = System.nanoTime();
        for (int z = 0; z < 1000; z ++){
            MergeSort.sort(ten);
        }
        y = System.nanoTime();
        System.out.println("Avg execution time for sort of array with size ten (1000 trials): ");
        System.out.println((int) (y - x) / 1000);
        System.out.println(" Nanoseconds");
        
        x = System.nanoTime();
        for (int z = 0; z < 1000; z ++){
            MergeSort.sort(hun);
        }
        y = System.nanoTime();
        System.out.println("Avg execution time for sort of array with size one hundred (1000 trials): ");
        System.out.println((int) (y - x) / 1000);
        System.out.println(" Nanoseconds");
        
        x = System.nanoTime();
        for (int z = 0; z < 1000; z ++){
            MergeSort.sort(hunthou);
        }
        y = System.nanoTime();
        System.out.println("Avg execution time for sort of array with size one hundred thousand (1000 trials): ");
        System.out.println((int) (y - x) / 1000);
        System.out.println(" Nanoseconds");
    
    
    
        

    }//end main

}//end class
