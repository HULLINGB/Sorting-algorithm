import java.util.*;

public class SortingAlgorithm3DArray{

     public static void main(String []args){
                                   Arraylist<String> list = new Arraylist<>();
                                   int dimensionLength = 3;
int dimensionLength2 = 3;
int dimensionLength3 = 3;
                                   int numOfDimensions = 3;
			int[][][] arrayMain = new int[dimensionLength][dimensionLength2][dimensionLength3];
                                   int[] array = new int[dimensionLength * dimensionLength];
                                  int[] array2 = new int[dimensionLength * dimensionLength2];
                                  int[] array3 = new int[dimensionLength * dimensionLength2 * dimensionLength3];
                                  int[] array4 = new int[dimensionLength * dimensionLength2 * dimensionLength3 * numOfDimensions];                     int[] arrayTrack =  new int[dimensionLength * dimensionLength2];
int[] arrayTrack2 =  new int[dimensionLength * dimensionLength2 * dimensionLength3];
                                  int[] arrayHolder =  new int[dimensionLength * dimensionLength2 * dimensionLength3];
                                  int[] arrayHolder2 =  new int[dimensionLength * dimensionLength2 * dimensionLength3];
			int number = 0;
			int space = 0;
			int length = array.length;
			if (array2.getClass().getComponentType().isArray()) {
				System.out.println("This is a multidimensional array");
			}else{
				System.out.println("This is not a multidimensional array");
			}
			    Random rand = new Random();
				for(int a = 0; a < array2.length; a++)
			    {
			        for(int b = 0; b < array[0].length; b++)
			        {
						for(int c = 0; c < array[0].length; c++)
						{
							number = rand.nextInt(10);
							arrayMain[a][b][c] = number;
						}
			        }
			    }
                                       int i = 0;
                                        for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength2; b++)
                                          {
                                         for(int c = 0; c < dimensionLength3; c++)
                                         {
                                               list[i] = arrayMain[a][b][c].toString();
                                               i++;
                                               }
                                               }
}
                                               i = 0;
                                               for(int a = i; a < list.size(); a++)
                                              {
                                              i = x;
                                               char[] char = list.get(a).toCharArray();
                                               for(int b = 0; b < list.size(); b++)
                                               {
                                                  if(char[b] == ‘,’)
                                                 {
                                                       array[i] = str;
                                                       str = “”;
                                                       i++;
                                                       for(int c = b; c < list.size(); c++)
                                                      {
                                                          if(char[c] == ‘,’)
                                                          {
                                                          i = 0;
                                                          array2[i] = str;
                                                          str = “”;
                                                                for(int d = c; d < list.size(); d++)
                                                               {
                                                          if(char[d] == ‘,’)
                                                          {
                                                          i = 0;
                                                          array3[i] = str;
                                                          str = “”;
                                                         }
                                                          str = str + char[d];
                                                         }
                                                         }
                                                          str = str + char[c];
                                                         }
                                                    }
                                               str = str + char[b];
                                               }
                                             x++;
                                            }
                                            i = 0;
				for(int a = 0; a < array.length; a++)
				{
					for(int b = 0; b < array.length; b++)
					{
						if(array[a] < array[b])
						{
						space = array[a];
						array[a] = array[b];
						array[b] = space;
                                                                      arrayTrack[i] = b;
                                                                      i++;
						}
					}
				}
                                               for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder[a] = array2[arrayTracker[a]];
                                                    arrayHolder2[a] = array3[arrayTracker[a]];
                                               }
                                              for(int a = 0; a < array2.length; a++)
                                              {
                                                    array2[a] = arrayHolder[a];
                                                    array3[a] = arrayHolder2[a];
                                               }
                                               for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder[a] = 0;
                                                    arrayHolder2[a] = 0;
                                                    arrayTracker[a] = 0;
                                               }
                                               i = 0;
                                               for(int a = 0; a < array2.length; a++)
				{
					for(int b = 0; b < array2.length; b++)
					{
						if(array2[a] < array2[b])
						{
						space = array2[a];
						array2[a] = array2[b];
						array2[b] = space;
                                                                      arrayTrack2[i] = b;
                                                                      i++;
						}
					}
				}	
                                              for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder2[a] = array3[arrayTracker2[a]];
                                               }
                                              for(int a = 0; a < array2.length; a++)
                                              {
                                                    array3[a] = arrayHolder2[a];
                                               }
                                               for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder2[a] = 0;
                                                    arrayTracker2[a] = 0;
                                               }
                                               i = 0;	
                                               for(int a = 0; a < array3.length; a++)
				{
					for(int b = 0; b < array3.length; b++)
					{
						if(array3[a] < array3[b])
						{
						space = array3[a];
						array3[a] = array3[b];
						array3[b] = space;
                                                                      arrayTrack2[i] = b;
                                                                      i++;
						}
					}
				}	
                                              for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder2[a] = array3[arrayTracker[a]];
                                               }
                                              for(int a = 0; a < array2.length; a++)
                                              {
                                                    array3[a] = arrayHolder2[a];
                                               }
                                              i = 0;
                                               for(int a = 0; a < array4.length; a++)
                                               {
                                                        array4[i] = array[a];
                                                        i++;
                                                        array4[i] = array2[a];
                                                        i++;
                                                        array4[i] = array3[a];
                                                        i++;
                                               }
                                               i = 0;
                                               for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength2; b++)
                                          {
                                         for(int c = 0; c < dimensionLength3; c++)
                                         {
                                               arrayMain[a][b][c] = array4[i];
                                               i++;
                                               }
                                               }
}
                                               System.out.println("{{");
            for(int a = 0; a < array.length; a++)
            {
                System.out.print("{");
                for(int b = 0; b < array[0].length; b++)
                {
					for(int c = 0; c < array[0].length; c++)
					{
						System.out.print(array[a][b][c]);
                        if(c < array[0].length - 1)
						{
							System.out.print(", ");
						}
						
					}
					
					   System.out.print("}");
					   if(b < array[0].length - 1)
					   {
					        System.out.print(",{");
					   }
				}
				System.out.print("}");
				if(a < array.length - 1)
				{
				    System.out.print(",{");
				}
            }
            System.out.println("}");
     }
}
}
}