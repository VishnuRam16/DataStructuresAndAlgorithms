

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
    for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
    {
      temp[--countArr[getDigit(index, input[tempIndex], radix)]] = input[tempIndex];
    }

    for(int tempIndex = 0; tempIndex < numItems; tempIndex++)
    {
      input[tempIndex] = temp[tempIndex];
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
