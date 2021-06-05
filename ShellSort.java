import java.util.Scanner;

public class ShellSort 
{
  public static void main(String[] args)
  {
      int[] array = new int[5];
      Scanner s = new Scanner(System.in);
      System.out.println("Enter values of the array: ");

      for(int i = 0; i < array.length; i++)
      {
        array[i] = s.nextInt();
      }
      s.close();
      
      for(int gap = array.length/2; gap > 0; gap/=2)
      {
        for(int i = gap; i < array.length; i++)
        {
          int insertedElement = array[i];
          int j = i;

          while(j >= gap && array[j - gap] > insertedElement)
          {
            array[j] = array[j - gap];
            j-=gap;
          }
          array[j] = insertedElement;
        }
      }

      System.out.println("Sorted Array is: ");
      for(int i = 0; i < array.length; i++ )
      {
        System.out.println(array[i]);
      }
      
      

  }
}
