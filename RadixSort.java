

public class RadixSort 
{

  public static void radixSort(String[] input, int radix, int width)
  {
    for(int i = width - 1; i >= 0; i--)
    {
      radixSortIndexWise(input, i, radix);
    }
  }

  public static void radixSortIndexWise(String[] input, int index, int radix)
  {
    int numItems = input.length;
    int[] countArr = new int[radix];

    for(String letter: input)
    {
      countArr[GetIndex(index, letter)]++;
    }

    for(int j = 1; j < radix; j++)
    {
       countArr[j] += countArr[j - 1];
    }

    String[] temp = new String[numItems];
    for(int k = numItems - 1; k >= 0; k--)
    {
      temp[--countArr[GetIndex(index, input[k])]] = input[k];  //Inserts rightmost values before left most values as we need to create a stable algorithm. 
    }

    for(int k = 0; k < numItems; k++)
    {
      input[k] = temp[k];
    }
  }

  public static int GetIndex(int index, String letter)
  {
    return letter.charAt(index)-'a'; // a in ascii is 97, there we subtract to get their respective indexes, example c = 99, index of c = 97-99 = 2. 
  }



  public static void main(String[] args)
  {
      String[] arr = {"bdcfe", "dabcq", "maodd", "abcde", "ccccc"};

      radixSort(arr, 26, 5);

      for(int i = 0; i < arr.length; i++)
      {
        System.out.println(arr[i]);
      }
  }

}
