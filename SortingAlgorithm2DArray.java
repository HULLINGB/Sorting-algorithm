import java.util.*;

public class Sorting2DArray{

     public static void main(String []args){
        
			int[][] array2 = { { 1, 2, 3, 4 , 0, 0, 1}, 
			                    { 3, 4, 5, 6, 5, 4, 1 } };
			int number = 0;
			int c = array2[0].length - 2;
			int space = 0;
			
			if (array2.getClass().getComponentType().isArray()) {
				System.out.println("This is a multidimensional array");
			}else{
				System.out.println("This is not a multidimensional array");
			}
				
				String s = "";
			    
			    for(int y = 0; y < array2.length; y++)
			    {
			        for(int z = 0; z < array2[0].length; z++)
			        {
			            s = s + String.valueOf(z);
			        }
			    }
				int[] array = new int[s.length()];
				for (int i = 0; i < s.length(); i++)
				{
					array[i] = s.charAt(i) - '0';
				}
				
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


				int count = 0;
				for(int q = 0; q < array2.length; q++)
				{
					for(int v = 0; v < array2[q].length; v++)
					{
						array2[q][v] = array[count];
						count++;
					}
				}

            for(int n = 0; n < array2.length; n++)
            {
                System.out.print("{{");
                for(int k = 0; k < array2[0].length; k++)
                {
                    System.out.print(array2[n][k]);
                    if(k < array2[0].length - 1)
                    {
                        System.out.print(", ");
                    }
                }
                System.out.println("}");
            }
            System.out.println("}");
		
     }
}