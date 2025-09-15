import java.util.*;

public class Sort3Bracket4DArray{
     public static void main(String []args){
                                   int bracketLength = 3;
                                   int bracketLength2 = 1000;
                                   int bracketLength3 = 4;
int[][][] array = new int[bracketLength][bracketLength2][bracketLength3];
			int[][] array2 = new int[bracketLength2][bracketLength3];
                                   ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength2);
                                   int[][] arrayHolder = new int[bracketLength2][bracketLength3];                             
                                   int e = -1;
                                   int c = 0;
                                   int i = 0;
                                  int d = bracketLength;
                                  int l = 0;
                                  int v = 0;
                                   boolean brk = false;
                                   int num = 0;
                                   int hold = 0;
                                   if (array.getClass().getComponentType().isArray()) {
	                       System.out.println("This is a multidimensional array");
                                  }else{
	                      System.out.println("This is not a multidimensional array");
                                  }
                                 Random rand = new Random();
                             for(int k = 0; k < bracketLength; k++)
                            {
	                       for(int a = 0; a < bracketLength2; a++)
                         	{
                                        for(int b = 0; b < bracketLength3; b++)
                         	     {
	             	       num = rand.nextInt(10);
	 	                  array2[a][b] = num;
	                             }
                                   }                      
                            for(int n = 0; n < bracketLength3; n++)
                            {
                                 for(int x = n; x < bracketLength3; x++)
                                 {
                                      for(int a = c; a < bracketLength2; a++)
		              {
                                           if(e > -1)
                                          {
                                                d++;
                                                if(array2[a][e] != array2[d][e])                   
                                               {                                                                     
                                                    brk = true;     
                                                }                                                        
                                            }     
                                            if(brk == true)
                                           {
                                                brk = false;
                                                break;
                                            }
                                       }
                                     for(int a = c; a < d; a++)
	                        {
                                        arrayTrack.add(0);
	                                for(int b = c; b < d; b++)
		                   {
                                                      if(array2[a][x] < array2[b][x])
			                   {
				             hold = array2[a][x];
				             array2[a][x] = array2[b][x];
				             array2[b][x] = hold;             
                                                            i++;                                                 
                                                            v = b;
				        }
                                                if(i > 0)
                                               {
                                                    arrayTrack.set(l, v);
                                               }
                                             if(i == 0)
                                            {
                                                  arrayTrack.set(l, a);
                                            }
                                           i = 0;
                                 }
                                 l++;
                                 }
                                l = 0;
                                for(int y = n + 1; y < bracketLength3; y++)
                                {
                                              i = 0;
                                               for(int a = c; a < d; a++)
                                              {
                                                    arrayHolder[a][y] = array2[arrayTrack.get(i)][y];
                                                    i++;
                                               }
                                              for(int a = c; a < d; a++)
                                              {
                                                    array2[a][y] = arrayHolder[a][y];
                                               }
                                }
                                c = d + 1;
                                arrayTrack.clear();
                            }
                           if(e < bracketLength2)
                          {
                           e++;
                         }
                         if(e == bracketLength2)
                        {
                            break;
                       }   
                           c = 0;
                            d = 0;
                           i = 0;
                    } 
                    e = 0;
                    for(int a = 0; a < bracketLength2; a++)
                    {	
                       for(int b = 0; b < bracketLength3; b++)
                      {
                             array[k][a][b] = array2[a][b];
                       }
                   }     
            }                                        
for(int a = 0; a < bracketLength; a++)
{	
         for(int b = 0; b < bracketLength2; b++)
         {
              for(int u = 0; u < bracketLength3; u++)
              {
              System.out.print(array[a][b][u]);
               if(c < bracketLength3 - 1)
               {
                     System.out.print(", ");
               }
              System.out.println();
        }
    }
for(int r = 0; r < 100; r++)
{
      System.out.println();
}
System.out.println("Next first bracket section");
}       
     }
}













