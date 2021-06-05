
public class SelectionSort 
{

  public static void SwapElements(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    if( i == j)
    {
      return;
    }
  }

  public static void main(String[] args)
  {
      int[] array = {2,6,-7,-2,24,13,16,9,0,10};

      for(int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex--)
      {
        int largestElement = 0;
        for(int i = 1; i <= unsortedIndex; i++)
        {
          if(array[i] > array[largestElement])
          {
            largestElement = i;
          }
        }
        SwapElements(array, largestElement, unsortedIndex);
      }

      for(int i = 0; i < array.length; i++)
      {
        System.out.println(array[i]);
      }
  }
  
}
