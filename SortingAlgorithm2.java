import java.util.*;

public class SortingAlgorithm2DArray{

     public static void main(String []args){
                                   Arraylist<String> list = new Arraylist<>();
                                   int dimensionLength = 3;
int dimensionLength2 = 2;
                                   int numOfDimensions = 2;
			int[][] arrayMain = new int[dimensionLength][dimensionLength2];
                                   ArrayList<Integer> array = new ArrayList<>();
ArrayList<Integer> array2 = new ArrayList<>();
int[] array4 = new int[dimensionLength * dimensionLength2 * dimensionLength3];
ArrayList<Integer> arrayTrack = new ArrayList<>();
ArrayList<Integer> arrayHolder = new ArrayList<>();
			int number = 0;
			int space = 0
			int length = array.length;
			if (arrayMain.getClass().getComponentType().isArray()) {
				System.out.println("This is a multidimensional array");
			}else{
				System.out.println("This is not a multidimensional array");
			}
			    Random rand = new Random();
				for(int a = 0; a < dimensionLength; a++)
			    {
			        for(int b = 0; b < dimensionLength2; b++)
			        {
							number = rand.nextInt(10);
							arrayMain[a][b] = number;
						}
			       }
                                       int i = 0;
                                        for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength2; b++)
                                          {
                                               list.add(arrayMain[a][b].toString());
                                               i++;
                                               }
}
                                               for(int a = i; a < list.size(); a++)
                                              {
                                               char[] char = list.get(a).toCharArray();
                                               for(int b = 0; b < list.size(); b++)
                                               {
                                                  if(char[b] == ‘,’)
                                                 {
                                                       array.add(str);
                                                       str = “”;
                                                       for(int c = b; c < list.size(); c++)
                                                      {
                                                          if(char[c] == ‘,’)
                                                          {
                                                          array2.add(str);
                                                          str = “”;
                                                         }
                                                         }
                                                          str = str + char[c];
                                                         }
                                                    }
                                               str = str + char[b];
                                               }
                                            }
				for(int a = 0; a < array.length; a++)
				{
					for(int b = 0; b < array.length; b++)
					{
						if(array[a] < array[b])
						{
						space = array.get(a);
						arrayset(a, array.get(b));
						array.set(b, space);
                                                                      arrayTrack.add(b);
						}
					}
				}
                                               for(int a = 0; a < array2.size; a++)
                                              {
                                                    arrayHolder.set(a, array2.get(arrayTracker.get(a)));
                                               }
                                              for(int a = 0; a < array2.size; a++)
                                              {
                                                    array2.set(a, arrayHolder.get(a));
                                               }
                                               i = 0;
                                               for(int a = 0; a < array2.size; a++)
                                              {
                                                    arrayHolder.set(a, 0);
                                                    arrayTracker.set(a, 0);
                                               }
                                               for(int a = 0; a < array2.size; a++)
				{
					for(int b = 0; b < array2.length; b++)
					{
						if(array2[a] < array2[b])
						{
						space = array2.get(a);
						array2.set(a, array2.get(b));
						array2.set(b, space);
                                                                      arrayTrack.set(i, b);
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

