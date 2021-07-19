package SearchAlgorithms;

public class LinearSearch 
{

  public static int linearSearch(int[] arr, int value)
  {
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == value)
      {
        return i;
      }
    }

    return -1;
  }
  public static void main(String args[])
  {
    int[] array = {10, 20, 5, -10, 12, 4, 0, 24};

    System.out.println("Required element is at index: " +linearSearch(array, 12));
  
  }
}
