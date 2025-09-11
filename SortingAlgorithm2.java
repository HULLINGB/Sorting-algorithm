import java.util.*;

public class Sort2Bracket4DArray{
     public static void main(String []args){
                                   int bracketLength = 1000;
int bracketLength2 = 4;
			int[][] array = new int[bracketLength][bracketLength2];
ArrayList<Integer> arrayTrack = new ArrayList<>();
int[][] arrayHolder = new int[bracketLength][bracketLength2];                             
 int i = 0; 
int n = 0;
int e = -1;
int c = 1;
boolean brk = false;
			int num = 0;
			int hold = 0;
			if (array.getClass().getComponentType().isArray()) {
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
				array[a][b] = num;
			        }
			    }
for( ; ; )
{
                    for(int x = 0; x < bracketLength2; x++)
                    {
				for(int a = c; a < bracketLength; a++)
				{
					for(int b = c; b < bracketLength; b++)
					{
                                                                if(e > -1)
                                                                {
                                                                    if(array[a][e] != array[c][e])                   
                                                                   {                                                                      
                                                                         brk = true;        
                                                                        e++;
                                                                    }                                                        
                                                                }
                                                                if(brk == true)
                                                                {                                                               
                                                                      break;                                                      
                                                                }
                                                                if(array[a][x] < array[b][x])
			                            {
						hold = array[a][x];
						array[a][x] = array[b][x];
						array[b][x] = hold;                                       
                                                                       arrayTrack.add(b);                                                                
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
                                                    arrayHolder[a][y] = array[arrayTrack.get(a)][y];
                                               }
                                              for(int a = c; a < bracketLength; a++)
                                              {
                                                    array[a][y] = arrayHolder[a][y];
                                               }
                              }
                         arrayTrack.clear();
                             c = 0;
                             e = n;
                      if(brk == true)
                      {
                           brk = false;
                           break;
                       }
              }
                      if(brk == true)
                      {
                           brk = false;
                           break;
                       }
n++;
}                                   
		for(int a = 0; a < bracketLength; a++)
{	
for(int b = 0; b < bracketLength2; b++)
{
   System.out.print(array[a][b]);
if(b < bracketLength2 - 1)
{
System.out.print(", ");
}
System.out.println();
}
}       
     }
}









