import java.util.*;

public class Sort2Bracket4DArray{
     public static void main(String []args){
                                   int bracketLength = 1000;
int bracketLength2 = 3;
			int[][] arrayMain = new int[bracketLength][bracketLength2];
                                   ArrayList<ArrayList<Integer>> array = new ArrayList<>();
ArrayList<Integer> array0 = new ArrayList<>();
ArrayList<Integer> array1 = new ArrayList<>();
ArrayList<Integer> array2 = new ArrayList<>();
ArrayList<Integer> array3 = new ArrayList<>();
ArrayList<Integer> array4 = new ArrayList<>();
ArrayList<Integer> arrayTrack = new ArrayList<>();
ArrayList<ArrayList<Integer>> arrayHolder = new ArrayList<>();
 int i = 0; 
int n = 0;
int e = -1;
int c = 1;
boolean brk = false;
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
                       array0.add(arrayMain[a][0]);
                                           }
for(int a = 0; a < bracketLength2; a++)
                                        {
                       array1.add(arrayMain[a][1]);
                                           }
for(int a = 0; a < bracketLength2; a++)
                                        {
                       array2.add(arrayMain[a][2]);
                                           }
for(int a = 0; a < bracketLength2; a++)
                                        {
                       array3.add(arrayMain[a][3]);
                                           }
array.add(array0);
array.add(array1);
array.add(array2);
array.add(array3);
for(int x = 0; x < bracketLength2; x++)
{
            for( ; ; )
            {
				for(int a = c; a < bracketLength; a++)
				{
					for(int b = c; b < bracketLength; b++)
					{
                                                                if(e > -1 && c < bracketLength - 1)
                                                                {
                                                                    if(array.get(e).get(a) != array.get(e).get(c))
                                                                    {
                                                                        brk = true;
                                                                    }
                                                                }
                                                                if(brk == true)
                                                                {
                                                                     break;
                                                                }
                                                                if(array.get(x).get(a) < array.get(x).get(b))
			                            {
						hold = array.get(x).get(a);
						array.get(x).set(a, array.get(x).get(b));
						array.get(x).set(b, hold);
                                                                      arrayTrack.add(b);
                                                                      i++;
				                 }
					}
                                                          if(brk == true)
                                                          {
                                                              break;
                                                          }
                                                          c++;
				}
                             for(int y = n; y < bracketLength2; y++)
                             {
                                               for(int a = c; a < bracketLength; a++)
                                              {
                                                    arrayHolder.get(y).set(a, array.get(y).get(arrayTrack.get(a)));
                                               }
                                              for(int a = c; a < bracketLength; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder.get(y).get(a));
                                               }
                                               arrayHolder.get(y).clear();
                              }
                       if(c == bracketLength - 1)
                       {
                             c = 0;
                        }
                      if(brk == true)
                      {
                           brk = false;
                           break;
                       }
              }
i = 0;
n++;
e++;
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
System.out.print(", ");
}
System.out.println();
}
}       
     }
}





