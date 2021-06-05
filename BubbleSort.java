

public class BubbleSort 
{
  public static void SwapElements(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j]; 
    arr[j] = temp;

    if(i == j)
    {
      return;
    }
  }

  public static void main(String[] args)
  {
      int[] array = {-17, 12, 5, 45, 3, 3, -5};

      for(int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex-- )
      {
        for(int i = 0; i < unsortedIndex; i++)
        {
          if(array[i] > array[i+1])
          {
            SwapElements(array, i, i+1);
          }
        }
      }
      for(int i = 0; i < array.length; i++)
      {
        System.out.println(array[i]);
      }

  }
  
}
