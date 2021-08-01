package Heaps;

public class Main
{
  public static void main(String[] args)
  {
    Heap heap = new Heap(10);

    heap.Insert(79);
    heap.Insert(74);
    heap.Insert(59);
    heap.Insert(67);
    heap.Insert(54);
    heap.Insert(39);
    heap.Insert(51);
    heap.Insert(68);

    heap.DisplayHeap();
    heap.HeapSort();
    heap.DisplayHeap();

    System.out.println("The root is: "+ heap.Peek());

    heap.Delete(3);
    heap.DisplayHeap();



  }
  
}
