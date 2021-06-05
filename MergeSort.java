
public class MergeSort 
{

public static void Partition(int[] input, int start, int end)
{
  if(end - start < 2) 
  {
    return;
  }

  int mid = (start + end)/2;

  Partition(input, start, mid);
  Partition(input, mid, end);

  Merge(input, start, mid, end);
}

public static void Merge(int[] input, int start, int mid, int end)
{
  if(input [mid - 1] <= input[mid])
  {
    return;
  }

  int i = start;
  int j = mid;
  int temp = 0;

  int[] tempArr = new int[end - start];
  while(i < mid && j < end)
  {
    tempArr[temp++] = input[i] <= input[j] ? input[i++] : input[j++];
  }

    System.arraycopy(input, i, input, start + temp, mid - i);
    System.arraycopy(tempArr, 0, input, start, temp);

}
  public static void main(String[] args)
  {
      int[] arr = { 24, 17, -5, -10, 0, 6, 12, 46, -12};

      Partition(arr, 0, arr.length);

      for(int i = 0; i < arr.length; i++)
      {
        System.out.println(arr[i]);
      }
  }
  
}
