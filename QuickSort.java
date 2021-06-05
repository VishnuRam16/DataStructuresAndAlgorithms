
public class QuickSort 
{

  public static void quickSort(int[] input, int start, int end)
  {
    if(end - start < 2)
    {
      return;
    }

    int pivotIndex = Partition(input, start, end);
    quickSort(input, start, pivotIndex);
    quickSort(input, pivotIndex + 1, end);
  }

  public static int Partition(int[] input, int start, int end)
  {
    int pivot = input[start];
    int i = start;
    int j = end;

    while(i < j)
    {
      while(i < j && input[--j] >= pivot);
      if(i < j)
      {
        input[i] = input[j];
      }

      while(i < j && input[++i] <= pivot);
      if(i < j)
      {
        input[j] = input[i];
      }
    }
    input[j] = pivot;
    return j;

  }

  public static void main(String[] args)
  {
     int[] arr = {-20, 0, 12, 5, -5, 7, 21, 9};
    
     quickSort(arr, 0, arr.length);

     for(int i = 0; i < arr.length; i++)
     {
       System.out.println(arr[i]);
     }
  }
}
