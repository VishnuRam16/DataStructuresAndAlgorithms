

public class RadixSort 
{

  public static void radixSort(int[] input, int radix, int width)
  {
    for(int i = 0; i < width; i++)
    {
      radixSortIndexWise(input, i, radix);
    }
  }

  public static void radixSortIndexWise(int[] input, int index, int radix)
  {
    int numItems = input.length;
    int[] countArr = new int[radix];

    for(int value: input)
    {
      countArr[getDigit(index, value, radix)]++;
    }

    for(int j = 1; j < radix; j++)
    {
       countArr[j] += countArr[j - 1];
    }

    int[] temp = new int[numItems];
    for(int k = numItems - 1; k >= 0; k--)
    {
      temp[--countArr[getDigit(index, input[k], radix)]] = input[k];  //Inserts rightmost values before left most values as we need to create a stable algorithm. 
    }

    for(int k = 0; k < numItems; k++)
    {
      input[k] = temp[k];
    }
  }

  public static int getDigit(int index, int value, int radix)
  {
    return value / (int) Math.pow(radix, index) % radix;
  }

  public static void main(String[] args)
  {
      int[] arr = { 123, 231, 254, 169, 173, 238};

      radixSort(arr, 10, 3);

      for(int i = 0; i < arr.length; i++)
      {
        System.out.println(arr[i]);
      }
  }

}
