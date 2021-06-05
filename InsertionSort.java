import java.util.Scanner;

public class InsertionSort
{
  public static void main(String[] args)
  {
    int[] array = new int[5];
    Scanner s  = new Scanner(System.in);
    System.out.println("Enter values for the array: ");

    for(int i = 0; i< array.length; i++)
    {
        array[i] = s.nextInt();
    }
    s.close();
  
    for(int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++)
    {
      int insertedElement = array[unsortedIndex];
      int i;

      for(i = unsortedIndex; i > 0 && array[i - 1] > insertedElement; i--)
      {
        array[i] = array[i-1];
      }

      array[i] = insertedElement;

    }

    System.out.println("The sorted array is: ");
    for(int i = 0; i < array.length; i++)
    {
      System.out.println(array[i]);
    }


  } 
}
