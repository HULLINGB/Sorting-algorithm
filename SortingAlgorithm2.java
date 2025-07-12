import java.util.*;

public class SortingAlgorithm2BracketInfiniteDArray{
     public static void main(String []args){
                                   int bracketLength = 1000;
int bracketLength2 = 3;
			int[][] arrayMain = new int[bracketLength][bracketLength2];
                                   ArrayList<<Integer>> array = new ArrayList<>();
ArrayList<Integer> array4 = new ArrayList<>();
ArrayList<Integer> arrayTrack = new ArrayList<>();
ArrayList<<Integer>> arrayHolder = new ArrayList<>();
 int i = 0; 
int n = 0;
			int num = 0;
			int hold = 0;
			if (arrayMain.getClass().getComponentType().isArray()) {
				System.out.println("This is a multidimensional array");
			}else{
				System.out.println("This is not a multidimensional array");
			}
			    Random rand = new Random();
				for(int a = 0; a < bracketLength; a++)
			    {
			        for(int b = 0; b < bracketLength2; b++)
			       {
				num = rand.nextInt(10);
				arrayMain[a][b] = num;
			        }
			    }
                                        for(int a = 0; a < bracketLength2; a++)
                                        {
                                          for(int b = 0; b < bracketLength; b++)
                                          {       
                                             array.get(a).add(arrayMain[b][a]);
                                           }
}
for(int x = 0; x < bracketLength2; x++)
{
				for(int a = 0; a < bracketLength; a++)
				{
					for(int b = 0; b < bracketLength; b++)
					{
                                                                if(array.get(x).get(a) < array.get(x).get(b))
			                            {
						hold = array.get(x).get(a);
						array.get(x).set(a, array.get(x).get(b);
						array.get(x).set(b, hold);
                                                                      arrayTrack.set(i, b);
                                                                      i++;
				                 }
					}
				}
                 for(int y = n; y < bracketLength2; y++)
                 {
                                               for(int a = 0; a < bracketLength; a++)
                                              {
                                                    arrayHolder.get(y).set(a, array.get(y).get(arrayTracker.get(a)));
                                               }
                                              for(int a = 0; a < bracketLength; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder.get(y).get(a));
                                               }
                                               arrayHolder.get(y).clear();
                 }
i = 0;
n++;
}
for(int x = 0; x < bracketLength * bracketLength2; x++)
{
                                              for(int a = 0; a < array.get(1).size() * bracketLength2; a++)
                                               {
                                                        array4.add(array.get(x).get(a));
                                               }
}
                                               for(int a = 0; a < bracketLength; a++)
                                        {
                                          for(int b = 0; b < bracketLength2; b++)
                                          {
                                               arrayMain[a][b] = array4.get(i);
                                               i++;
                                          }
                                        }
		for(int a = 0; a < bracketLength; a++)
{	
for(int b = 0; b < bracketLength2; b++)
{
   System.out.print(arrayMain[a][b]);
if(b < bracketLength2 - 1)
{
System.out.print(“, “);
}
System.out.println();
}
}       
     }
}





