package SearchAlgorithms;

public class BinarySearch 
{

  public static int recursiveBinarySearch(int[] arr, int value)
  {
    return recursiveBinarySearch(arr, 0, arr.length, value);
  }

  public static int recursiveBinarySearch(int[] arr, int start, int end, int value)
  {
    if(start >= end)
    {
      return -1;
    }

    int midPoint = (start + end) / 2;
    System.out.println("MidPoint is = "+midPoint);

    if(arr[midPoint] == value)
    {
      return midPoint;
    }
    else if(arr[midPoint] < value)
    {
      return recursiveBinarySearch(arr, midPoint + 1, end, value);
    }
    else
    {
      return recursiveBinarySearch(arr, start, midPoint, value);
    }
    

  }

  public static void main(String[] args)
  {
    int[] array = {1,4,5,8,9,10,12};

    System.out.println("Required element is at position : " +recursiveBinarySearch(array, 10));
  }
}
