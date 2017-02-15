# time-space-barrier
  MergeSort algorithm:
  This is a recursive algorithm, whose base case is recieving a array
  of length one (which it simply returns). If the array is longer than length
  one, then the program will create two arrays that will respectively contain
  the first and second half of the elements the program is attempting to sort.
  It will then call MergeSort on both sub-arrays and use a linear run time merge
  algorithm to combine the two sorted sub-arrays into one sorted array which 
  will be returned.
  
  Runtime evaluation:
  For an input of length array of length n, merge sort will have to first create tree of recursive calls by splitting the input arrays into sub-arrays(half the length of the input arrays) and calling merge sort on them. There will be log(n) layers of recursive calls. It will take n time to split an array of length n into two sub arrays of length n/2. At the kth layer, there will be 2^k arrays each of length n/2^k. So the run time needed to create the next layer of sub-arrays will be 2^k(n/2^k)=n. If this is repeated for logn layers, then the runtime of creating the tree of recursive calls will be O(nlogn). When merging sub arrays and condensing the tree of recursive calls back into a single ordered array, the merge method that runs on two subarrays of length n/2 will have  runtime of n. So at the (k+1)th layer, there will be 2^(k+1) arrays each of length n/2^(k+1) and all of them need to be merged into 2^k arrays of length n/2^k. The runtime needed to merge this single layer would be 2^k(n/2^k)=n. If this is repeated for logn layers, then the runtime to merge back into a single sorted array is O(nlogn). So the overall runtime is O(nlogn).

<a href="https://docs.google.com/document/d/1xzQMZdSuBXd9GTVbygGOTw1xXbWF-QZ27ppZoHx5H2I/edit">Data</a>

