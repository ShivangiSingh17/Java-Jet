class MaximumPriorityQueue {
  public static int heapSize = 0;
  public static int treeArraySize = 20;
  public static int INF = 100000;

  //function to get right child of a node of a tree
  public static int getRightChild(int A[], int index) {
    if((((2*index)+1) < A.length && (index >= 1)))
      return (2*index)+1;
    return -1;
  }

  //function to get left child of a node of a tree
  public static int getLeftChild(int A[], int index) {
      if(((2*index) < A.length && (index >= 1)))
          return 2*index;
      return -1;
  }

  //function to get the parent of a node of a tree
  public static int getParent(int A[], int index) {
    if ((index > 1) && (index < A.length)) {
      return index/2;
    }
    return -1;
  }

  public static void maxHeapify(int A[], int index) {
    int leftChildIndex = getLeftChild(A, index);
    int rightChildIndex = getRightChild(A, index);

    // finding largest among index, left child and right child
    int largest = index;

    if ((leftChildIndex <= heapSize) && (leftChildIndex>0)) {
      if (A[leftChildIndex] > A[largest]) {
        largest = leftChildIndex;
      }
    }

    if ((rightChildIndex <= heapSize && (rightChildIndex>0))) {
      if (A[rightChildIndex] > A[largest]) {
        largest = rightChildIndex;
      }
    }

    // largest is not the node, node is not a heap
    if (largest != index) {
      int temp;
      //swapping
      temp = A[largest];
      A[largest] = A[index];
      A[index] = temp;
      maxHeapify(A, largest);
    }
  }

  public static void buildMaxHeap(int A[]) {
    for(int i=heapSize/2; i>=1; i--) {
      maxHeapify(A, i);
    }
  }

  public static int maximum(int A[]) {
    return A[1];
  }

  public static int extractMax(int A[]) {
    int maxm = A[1];
    A[1] = A[heapSize];
    heapSize--;
    maxHeapify(A, 1);
    return maxm;
  }

  public static void increaseKey(int A[], int index, int key) {
    A[index] = key;
    while((index>1) && (A[getParent(A, index)] < A[index])) {
      int temp;
      temp = A[getParent(A, index)];
      A[getParent(A, index)] = A[index];
      A[index] = temp;
      index = getParent(A, index);
    }
  }

  public static void decreaseKey(int A[], int index, int key) {
    A[index] = key;
    maxHeapify(A, index);
  }

  public static void insert(int A[], int key) {
    heapSize++;
    A[heapSize] = -1*INF;
    increaseKey(A, heapSize, key);
  }

  public static void printHeap(int A[]) {
    for(int i=1; i<=heapSize; i++) {
      System.out.println(A[i]);
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    int A[] = new int[treeArraySize];
    buildMaxHeap(A);

    insert(A, 20);
    insert(A, 15);
    insert(A, 8);
    insert(A, 10);
    insert(A, 5);
    insert(A, 7);
    insert(A, 6);
    insert(A, 2);
    insert(A, 9);
    insert(A, 1);

    printHeap(A);

    increaseKey(A, 5, 22);
    printHeap(A);

    decreaseKey(A, 1, 13);
    printHeap(A);

    System.out.println(maximum(A));
    System.out.println("");
    System.out.println(extractMax(A));
    System.out.println("");

    printHeap(A);

    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
    System.out.println(extractMax(A));
  }
}