import java.util.*;

public class SortingAlgorithm2{

     public static void main(String []args){
        
            int[] array = new int[7];

            Random rand = new Random();
            for(int i = 0; i < array.length; i++)
            {
              int n = rand.nextInt(10);
              array[i] = n;
            }

			int space = 0;
			for(int x = 0; x < array.length; x++)
            {
                for(int y = 0; y < array.length; y++)
                {
                  if(array[x] < array[y])
                  {
                    space = array[x];
                    array[x] = array[y];
                    array[y] = space;
                  }
                }
            }
                for(int i = 0; i < array.length; i++)
                {
                    System.out.println(array[i]);
                }
				
            //or just...
			//System.out.print(Arrays.toString(array));
		
     }
}