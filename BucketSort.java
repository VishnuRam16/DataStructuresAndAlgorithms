import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BucketSort
{

  private static int hash(int value)
  {
      return value / (int) 10 % 10;
  }

  public static void bucketSort(int[] array)
  {

    List<Integer>[] buckets = new List[10]; //10 as we need to store and sort elements based on their 10's place


    for(int i = 0; i < buckets.length; i++)
    {
        buckets[i] = new ArrayList<Integer>();
    }

    for(int i = 0; i < array.length; i++)
    {
        buckets[hash(array[i])].add(array[i]); // if value is 71, we add 71 to the 7th bucket. 
    }

    for(List bucket: buckets)
    {
        Collections.sort(bucket);
    }

    int j = 0;
    for(int i = 0; i < buckets.length; i++)
    {
      for(int value: buckets[i])
      {
        array[j++] = value;
      }
    }
    
  }
  public static void main(String[] args)
  {
    int[] arr = {65,53,44,42,71,83,98,94};

    bucketSort(arr);

    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }

  }
}
