import java.util.*;

public class SortingAlgorithmInfiniteBracketArray{
     public static void main(String []args){
                                   Arraylist<String> list = new Arraylist<>();
                                   int dimensionLength = 3;
int dimensionLength2 = 3;
int dimensionLength3 = 3;
                                   int numOfDimensions = 3;
			int[][][] arrayMain = new int[dimensionLength][dimensionLength2][dimensionLength3];
                                   ArrayList<Integer> array = new ArrayList<>();
ArrayList<Integer> array2 = new ArrayList<>();
ArrayList<Integer> array3 = new ArrayList<>();
int[] array4 = new int[dimensionLength * dimensionLength2 * dimensionLength3];
ArrayList<Integer> arrayTrack = new ArrayList<>();
ArrayList<Integer> arrayTrack2 = new ArrayList<>();
ArrayList<Integer> arrayHolder = new ArrayList<>();
ArrayList<Integer> arrayHolder2 = new ArrayList<>();
			int number = 0;
			int space = 0;
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
						for(int c = 0; c < dimensionLength3; c++)
						{
							number = rand.nextInt(10);
							arrayMain[a][b][c] = number;
						}
			        }
			    }
                                        for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength2; b++)
                                          {
                                         for(int c = 0; c < dimensionLength3; c++)
                                         {
                                               list.add(arrayMain[a][b][c].toString());
                                               }
                                               }
}
                                               for(int a = i; a < list.size(); a++)
                                              {
                                               char[] char = list.get(a).toCharArray();
                                               for(int b = 0; b < char.length; b++)
                                               {
                                                  if(char[b] == ‘,’)
                                                 {
                                                       b = b + 2;
                                                       array.add(Integer.valueOf(str));
                                                       str = “”;
                                                       for(int c = b; c < char.length; c++)
                                                      {
                                                         c = c + 2;
                                                          if(char[c] == ‘,’)
                                                          {
                                                          array2.add(Integer.valueOf(str));
                                                          str = “”;
                                                                for(int d = c; d < char.length; d++)
                                                               {
                                                          if(char[d] == ‘,’)
                                                          {
                                                          d = d + 2;
                                                          array3.add(Integer.valueOf(str));
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
                                            }
                                           int i = 0;
				for(int a = 0; a < array.length; a++)
				{
					for(int b = 0; b < array.length; b++)
					{
						if(array.get(a) < array.get(b))
						{
						space = array.get(a);
						array.set(a, array.get(b);
						array.set(b, space);
                                                                      arrayTrack.set(i, b);
                                                                      i++;
						}
					}
				}
                                               for(int a = 0; a < array2.size; a++)
                                              {
                                                    arrayHolder.set(a, array2.get(arrayTracker.get(a)));
                                                    arrayHolder2.set(a, array3.get(arrayTracker.get(a)));
                                               }
                                              for(int a = 0; a < array2.size; a++)
                                              {
                                                    array2.set(a, arrayHolder.get(a));
                                                    array3.set(a, arrayHolder2.get(a));
                                               }
                                               for(int a = 0; a < array2.length; a++)
                                              {
                                                    arrayHolder.set(a, 0);
                                                    arrayHolder2.set(a, 0);
                                                    arrayTracker.set(a, 0);
                                               }
                                               i = 0;
                                               for(int a = 0; a < array2.size; a++)
				{
					for(int b = 0; b < array2.size; b++)
					{
						if(array2.get(a) < array2.get(b))
						{
						space = array2.get(a);
						array2.set(a, array2.get(b));
						array2.set(b, space);
                                                                      arrayTrack2.set(i, b);
                                                                      i++;
						}
					}
				}	
                                              for(int a = 0; a < array2.size; a++)
                                              {
                                                    arrayHolder2.set(a, array3.get(arrayTracker2.get(a)));
                                               }
                                              for(int a = 0; a < array2.size; a++)
                                              {
                                                    array3.set(a, arrayHolder2.get(a));
                                               }
                                               for(int a = 0; a < array2.size; a++)
                                              {
                                                    arrayHolder2.set(a, 0);
                                                    arrayTracker2.set(a, 0);
                                               }
                                               i = 0;	
                                               for(int a = 0; a < array3.size; a++)
				{
					for(int b = 0; b < array3.size; b++)
					{
						if(array3.get(a) < array3.get(b))
						{
						space = array3.get(a);
						array3.set(a, array3.get(b));
						array3.set(b, space);
                                                                      arrayTrack2.set(i, b);
                                                                      i++;
						}
					}
				}	
                                              for(int a = 0; a < array2.size; a++)
                                              {
                                                    arrayHolder2.set(a, array3.get(arrayTracker.get(a)));
                                               }
                                              for(int a = 0; a < array2.size; a++)
                                              {
                                                    array3.set(a, arrayHolder2.get(a));
                                               }
                                              i = 0;
                                               for(int a = 0; a < array4.length; a++)
                                               {
                                                        array4.set(i, array.get(a));
                                                        i++;
                                                        array4.set(i, array2.get(a));
                                                        i++;
                                                        array4.set(i, array3.get(a));
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
            for(int a = 0; a < array.size; a++)
            {
                System.out.print("{");
                for(int b = 0; b < array2.size; b++)
                {
					for(int c = 0; c < array3.size; c++)
					{
						System.out.print(arrayMain[a][b][c]);
                        if(c < array3.size - 1)
						{
							System.out.print(", ");
						}
						
					}
					   System.out.print("}");
					   if(b < array2.size - 1)
					   {
					        System.out.print(",{");
					   }
				}
				System.out.print("}");
				if(a < array.size - 1)
				{
				    System.out.print(",{");
				}
            }
            System.out.println("}");
     }
}
