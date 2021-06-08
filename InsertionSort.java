

public class InsertionSort
{
  public static void insertionSort(int[] input, int numItems)
  {

    if(numItems < 2)
    {
      return;
    }
    
    insertionSort(input, numItems - 1);

    
    int insertedElement = input[numItems - 1];
    int i;

    for(i = numItems - 1; i > 0 && input[i - 1] > insertedElement; i--)
    {
      input[i] = input[i-1];
    }

    input[i] = insertedElement;

    System.out.println("Array when numitems = " +numItems);
    for(i = 0; i < input.length; i++)
    {
      System.out.print(input[i]);
      System.out.print(", ");
    }

    System.out.println(" ");
    System.out.println("----------------------------");

    

    }


  public static void main(String[] args)
  {
    int[] array = {1,6,2,3,9,8,0,4};

    insertionSort(array, array.length);

    // for(int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++)
    // {
    //   int insertedElement = array[unsortedIndex];
    //   int i;

    //   for(i = unsortedIndex; i > 0 && array[i - 1] > insertedElement; i--)
    //   {
    //     array[i] = array[i-1];
    //   }

    //   array[i] = insertedElement;

    // }

    System.out.println("The sorted array is: ");
    for(int i = 0; i < array.length; i++)
    {
      System.out.println(array[i]);
    }


  } 
}
