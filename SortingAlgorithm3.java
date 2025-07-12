import java.util.*;

public class SortingAlgorithm3BracketInfiniteDArray{
     public static void main(String []args){
                                   int bracketLength = 3;
int bracketLength2 = 3;
int bracketLength3 = 4;
			int[][][] arrayMain = new int[bracketLength][bracketLength2][bracketLength3];
int[][] arrayMain2 = new int[bracketLength2][bracketLength3];
                                   ArrayList<<Integer>> array = new ArrayList<>();
ArrayList<Integer> array4 = new ArrayList<>();
ArrayList<Integer> arrayTrack = new ArrayList<>();
ArrayList<<Integer>> arrayHolder = new ArrayList<>();
 int i = 0; 
int n = 0;
int s = 0;
			int num = 0;
			int hold = 0;
			if (arrayMain.getClass().getComponentType().isArray()) {
				System.out.println("This is a multidimensional array");
			}else{
				System.out.println("This is not a multidimensional array");
			}
			    Random rand = new Random();
for(int z = 0; z < bracketLength; z++)
{
				for(int a = 0; a < bracketLength2; a++)
			    {
			        for(int b = 0; b < bracketLength3; b++)
			       {
				num = rand.nextInt(10);
				arrayMain[a][b] = num;
			        }
			    }
                                        for(int a = 0; a < bracketLength3; a++)
                                        {
                                          for(int b = 0; b < bracketLength2; b++)
                                          {       
                                             array.get(a).add(arrayMain[b][a]);
                                           }
}
for(int x = 0; x < bracketLength3; x++)
{
				for(int a = 0; a < bracketLength2; a++)
				{
					for(int b = 0; b < bracketLength2; b++)
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
                 for(int y = n; y < bracketLength3; y++)
                 {
                                               for(int a = 0; a < bracketLength2; a++)
                                              {
                                                    arrayHolder.get(y).set(a, array.get(y).get(arrayTrack.get(a)));
                                               }
                                              for(int a = 0; a < bracketLength2; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder.get(y).get(a));
                                               }
                                              arrayHolder.get(y).clear();
                 }
                i = 0;
               arrayTrack.clear();
               n++;
}
for(int x = 0; x < bracketLength2 * bracketLength3; x++)
{
                                              for(int a = 0; a < array.get(1).size() * bracketLength3; a++)
                                               {
                                                        array4.add(array.get(x).get(a));
                                               }
}
                                               for(int a = 0; a < bracketLength2; a++)
                                        {
                                          for(int b = 0; b < bracketLength3; b++)
                                          {
                                               arrayMain2[a][b] = array4.get(i);
                                               i++;
                                          }
                                        }
		for(int a = 0; a < bracketLength2; a++)
{	
for(int b = 0; b < bracketLength3; b++)
{
   System.out.print(arrayMain2[a][b]);
if(b < bracketLength3 - 1)
{
System.out.print(“, “);
}
System.out.println();
}
} 
array4.clear();
for(int a = 0; a < array.size; a++)
{
for(int b = 0; b < array.get(a).size; b++)
{
array.get(b).clear();
}
}
}   
     }
}



