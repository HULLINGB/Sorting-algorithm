
public class SortingAlgorithm{

     public static void main(String []args){
        
            int[] array = {4, 5, 4, 1, 4, 6, 0};
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