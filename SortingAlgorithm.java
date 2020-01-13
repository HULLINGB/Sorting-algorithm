import java.util.*;





public class SortingAlgorithm
{


      public static void main(String[] args)
      {
            int[] array = new int[10];

            Random rand = new Random();
            for(int i = 0; i < array.length; i++)
            {
              int n = rand.nextInt(10);
              array[i] = n;
            }

            int j = 9;
            int space = 0;
            for(int i = 0; i < array.length; i++)
            {
                for(int x = 0; x < j; x++)
                {
                  if(array[j] < array[x])
                  {
                    space = array[j];
                    array[j] = array[x];
                    array[x] = space;

                  }

                }
                j--;

            }



              System.out.print(Arrays.toString(array));












      }








}
