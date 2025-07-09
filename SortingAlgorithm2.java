import java.util.*;

public class SortingAlgorithm2BracketInfiniteDArray{
     public static void main(String []args){
                                   Arraylist<String> list = new Arraylist<>();
                                   int bracketLength = 1000;
int bracketLength2 = 3;
                                   int numOfBrackets = 2;
			int[][] arrayMain = new int[dimensionLength][dimensionLength2];
                                   ArrayList<<Integer>> array = new ArrayList<>();
ArrayList<Integer> array4 = new ArrayList<>();
ArrayList<Integer> arrayTrack = new ArrayList<>();
ArrayList<<Integer>> arrayHolder = new ArrayList<>();
 int i = 0; 
int y = 0;
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
							number = rand.nextInt(10);
							arrayMain[a][b] = number;
			        }
			    }
                                        for(int a = 0; a < dimensionLength2; a++)
                                        {
                                          for(int b = 0; b < dimensionLength; b++)
                                          {       
                                             list.add(arrayMain[b][a]);
                                           }
                                               for(int c = 0; c < list.size(); c++)
                                               {
                                                       array.get(a).add(list.get(c));
                                                   }
}
for(int x = 0; x < dimensionLength2; x++)
{
				for(int a = 0; a < array.get(x).size(); a++)
				{
					for(int b = 0; b < array.get(x).size(); b++)
					{
                                                           if(array.get(x).get(a) < array.get(x).get(b))
						{
						space = array.get(x).get(a);
						array.get(x).set(a, array.get(x).get(b);
						array.get(x).set(b, space);
                                                                      arrayTrack.set(i, b);
                                                                      i++;
						}
					}
				}
                                               y++;
                                             for(int k = 0; k < dimensionLength2; k++)
                                             {
                                               for(int a = 0; a < array.get(x).size; a++)
                                              {
                                                    arrayHolder.get(x).set(a, array.get(y).get(arrayTracker.get(a)));
                                               }
                                             }
                                              for(int a = 0; a < array.get(y).size; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder.get(x).get(a));
                                               }
                                              y++;
                                             for(int a = 0; a < array.get(y).size; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder2.get(y).get(a));
                                               }
                                               (int a = 0; a < array.get(1) * dimensionLength2; a++)
                                               {
                                                        array4.set(i, array.get(x).get(a));
                                                        i++;
                                                        array4.set(i, array.get(x).get(a));
                                                        i++;
                                                        array4.set(i, array.get(x).get(a));
                                                        i++;
                                               }
                                               i = 0;
                                               for(int a = 0; a < dimensionLength; a++)
                                        {
                                          for(int b = 0; b < dimensionLength2; b++)
                                          {
                                               arrayMain[a][b] = array4.get(I);
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

