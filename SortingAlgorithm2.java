import java.util.*;

public class SortingAlgorithm2DArray{

     public static void main(String []args){
                                   Arraylist<String> list = new Arraylist<>();
                                   int dimensionLength = 3;
int dimensionLength2 = 2;
                                   int numOfDimensions = 2;
			int[][] arrayMain = new int[dimensionLength][dimensionLength2];
                                   int[] array = new int[dimensionLength * dimensionLength2];
                                  int[] array2 = new int[dimensionLength * dimensionLength2];
                                  int[] array4 = new int[dimensionLength * dimensionLength2 * numOfDimensions];
                                  int[] arrayTrack =  new int[dimensionLength * dimensionLength2];
                                  int[] arrayHolder =  new int[dimensionLength * dimensionLength2];
        
			int number = 0;
			int space = 0
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
                                               list[i] = arrayMain[a][b].toString();
                                               i++;
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
                                               }
                                              for(int a = 0; a < array2.length; a++)
                                              {
                                                    array2[a] = arrayHolder[a];
                                               }
                                               for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder[a] = 0;
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
                                                                      arrayTrack[i] = b;
                                                                      i++;
						}
					}
				}	
                                              
                    
                                              i = 0;
                                               for(int a = 0; a < array4.length; a++)
                                               {
                                                        array4[i] = array[a];
                                                        i++;
                                                        array4[i] = array2[a];
                                                        i++;
                                                        
                                               }
                                               i = 0;
                                               for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength2; b++)
                                          {
                                               arrayMain[a][b] = array4[i];
                                               i++;
                                               }
            //Print
for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength; b++)
                                          {                                         
                                               System.out.print(arrayMain[a][b] + “, “);
                                               }
System.out.println(“”);
     }
}
}
}

