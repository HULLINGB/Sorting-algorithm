import java.util.*;

public class SortingAlgorithm3BracketInfiniteDArray{
     public static void main(String []args){
                                   Arraylist<String> list = new Arraylist<>();
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
			int number = 0;
			int space = 0; 
			int length = array.length;
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
				number = rand.nextInt(10);
				arrayMain[a][b] = number;
			        }
			    }
                                        for(int a = 0; a < bracketLength3; a++)
                                        {
                                          for(int b = 0; b < bracketLength2; b++)
                                          {       
                                             list.add(arrayMain[b][a]);
                                           }
                                               for(int c = 0; c < list.size(); c++)
                                               {
                                                       array.get(a).add(list.get(c));
                                                   }
}
for(int x = n; x < bracketLength3; x++)
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
                 n++;
                 for(int y = n; y < bracketLength3; y++)
                 {
                                               for(int a = 0; a < array.get(y).size; a++)
                                              {
                                                    arrayHolder.get(y).set(a, array.get(y).get(arrayTracker.get(a)));
                                               }
                                              for(int a = 0; a < array.get(y).size; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder.get(y).get(a));
                                               }
                                               arrayHolder.get(y).clear();
                 }
}
i = 0; 
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
list.clear();
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



