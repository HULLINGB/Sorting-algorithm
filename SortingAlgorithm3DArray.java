import java.util.*;

public class SortingAlorithm3DArray{

     public static void main(String []args){
        
			int[][][] array2 = new int[3][3][3];
			int number = 0;
			int space = 0;
			int length = array2.length;
			
			if (array2.getClass().getComponentType().isArray()) {
				System.out.println("This is a multidimensional array");
			}else{
				System.out.println("This is not a multidimensional array");
			}
				String s = "";
			    Random rand = new Random();
			
				for(int a = 0; a < array2.length; a++)
			    {
			        for(int b = 0; b < array2[0].length; b++)
			        {
						for(int c = 0; c < array2[0].length; c++)
						{
							number = rand.nextInt(10);
							array2[a][b][c] = number;
						}
			        }
			    }
			    for(int i = 0; i < array2.length; i++)
			    {
			        for(int j = 0; j < array2[0].length; j++)
			        {
						for(int z = 0; z < array2[0].length; z++)
						{
							s = s + String.valueOf(array2[i][j][z]);
						}
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
						for(int j = 0; j < array2[v].length; j++)
						{
							array2[q][v][j] = array[count];
							count++;
						}
					}
				}

            for(int n = 0; n < array2.length; n++)
            {
                System.out.print("{{");
                for(int k = 0; k < array2[0].length; k++)
                {
					for(int q = 0; q< array2[0].length; q++)
					{
						System.out.print(array2[n][k][q]);
                        if(q < array2[0].length)
						{
							System.out.print(", ");
						}
					}
					System.out.println("}");
                }
                System.out.println("}");
            }
     }
}