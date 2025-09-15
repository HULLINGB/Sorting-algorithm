import java.util.*;

public class Sort2Bracket4DArray{
     public static void main(String []args){
                                   int bracketLength = 1000;
                                   int bracketLength2 = 4;
			int[][] array = new int[bracketLength][bracketLength2];
                                   ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength2);
                                   int[][] arrayHolder = new int[bracketLength][bracketLength2];                             
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
                             for(int a = 0; a < bracketLength; a++)
                            {
	                       for(int b = 0; b < bracketLength2; b++)
                         	{
	             	       num = rand.nextInt(10);
	 	                  array[a][b] = num;
	                        }
                              }
                            for(int n = 0; n < bracketLength2; n++)
                            {
                                 for(int x = n; x < bracketLength2; x++)
                                 {
                                      for(int a = c; a < bracketLength; a++)
		              {
                                           if(e > -1)
                                          {
                                                d++;
                                                if(array[a][e] != array[d][e])                   
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
                                                      if(array[a][x] < array[b][x])
			                   {
				             hold = array[a][x];
				             array[a][x] = array[b][x];
				             array[b][x] = hold;             
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
                                for(int y = n + 1; y < bracketLength2; y++)
                                {
                                              i = 0;
                                               for(int a = c; a < d; a++)
                                              {
                                                    arrayHolder[a][y] = array[arrayTrack.get(i)][y];
                                                    i++;
                                               }
                                              for(int a = c; a < d; a++)
                                              {
                                                    array[a][y] = arrayHolder[a][y];
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









