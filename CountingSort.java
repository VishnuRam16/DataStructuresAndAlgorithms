
public class CountingSort 
{
  public static void countingSort(int[] input, int min, int max)
  {
    int[] countArr = new int[10];
    
    for(int i = 0; i < input.length; i++)
    {
      countArr[input[i] - min]++;
    }

     int j = 0;
     for(int i = min; i <= max; i++)
     {
       while(countArr[i - min] > 0)
       {
         input[j++] = i;
         countArr[i - min]--;
       }
     }
  }


  public static void main(String[] args)
  {
     int[] arr = {1,2,8,9,5,6,3,2,4,9,1,7,8};

     countingSort(arr, 1, 10);

     for(int i = 0; i < arr.length; i++)
     {
       System.out.println(arr[i]);
     }
  }
}
