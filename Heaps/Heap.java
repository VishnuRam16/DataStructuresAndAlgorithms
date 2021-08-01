package Heaps;

public class Heap 
{
  private int[] heap;
  private int size;

  public Heap(int capacity)
  {
    heap = new int[capacity];
  }

  public boolean IsFull()
  {
    return size == heap.length;
  }

  public int GetParent(int index)
  {
    return (index - 1)/2; //Formula to get parent in a MaxHeap using Arrays. Logically we floor the value, but here(Java) its already floored. 
  }

  public void Insert(int value)
  {
    if(IsFull())
    {
      throw new IndexOutOfBoundsException("Heap is Full");
    }
      heap[size] = value;
      SortHeapAbove(size);
      size++;
    
  }

  private void SortHeapAbove(int index)
  {
    int newValue = heap[index];
    while(index > 0 && newValue > heap[GetParent(index)])  //if value added to the heap is greater than its parent, we swap it. 
    {
      heap[index] = heap[GetParent(index)]; 
      index = GetParent(index);
    }

    heap[index] = newValue;
  }

  public boolean IsEmpty()
  {
    return size == 0;
  }

  public int GetChild(int index, boolean left)
  {
    return 2*index + (left ? 1 : 2); //2i + 1 for leftchild, 2i + 2 for rightchild
  }

  public int Delete(int index)
  {
    if(IsEmpty())
    {
      throw new IndexOutOfBoundsException("Heap is Empty");
    }

    int parent = GetParent(index);
    int deletedValue = heap[index];

    heap[index] = heap[size - 1]; //Replace with rightmost value of the heap

    if(index ==0 || heap[index] < heap[parent])
    {
      SortHeapBelow(index, size - 1);
    }
    else
    {
      SortHeapAbove(index);
    }

    size--;
    return deletedValue;
  }

  private void SortHeapBelow(int index, int lastHeapIndex) //Index of the deleted value, Index of rightmost value(Size - 1)
  {
    int replacementChild;
    while(index <= lastHeapIndex)
    {
      
      int leftChild = GetChild(index, true);
      int rightChild = GetChild(index, false);
      if(leftChild <= lastHeapIndex)
      {
        if(rightChild > lastHeapIndex)
        {
          replacementChild = leftChild;
        }
        else
        {
          replacementChild = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
        }

        if(heap[index] < heap[replacementChild])
        {
          int temp = heap[index];
          heap[index] = heap[replacementChild];
          heap[replacementChild] = temp;
        }
        else
        {
          break;
        }

        index = replacementChild;
      }
      else
      {
        break;
      }
    }
  }

  public void DisplayHeap()
  {
    for(int i = 0; i < size; i++)
    {
      System.out.print(heap[i] + ", ");
    }
    System.out.println();
  }
}
