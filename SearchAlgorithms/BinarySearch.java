package SearchAlgorithms;

public class BinarySearch 
{

  public static int binarySearch(int[] arr, int value)
  {
    int start = 0;
    int end = arr.length;

    while(start < end)
    {
      int midPoint = (start + end) / 2;
      System.out.println("MidPoint is = "+midPoint);

      if(arr[midPoint] == value)
      {
        return midPoint;
      }
      else if(arr[midPoint] < value)
      {
          start = midPoint + 1;
      }
      else
      {
          end = midPoint;
      }
    }

    return -1;

  }

  public static void main(String[] args)
  {
    int[] array = {1,4,5,8,9,10,12};

    System.out.println("Required element is at position : " +binarySearch(array, 9));
  }
}
