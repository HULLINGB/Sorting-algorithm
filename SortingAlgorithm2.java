import java.util.*;

public class Sort2Bracket4DArray{
     public static void main(String []args){
                                   int bracketLength = 1000;
                                   int bracketLength2 = 4;
			int[][] array = new int[bracketLength][bracketLength2];
                                   ArrayList<Integer> arrayTrack = new ArrayList<>();
                                   int[][] arrayHolder = new int[bracketLength][bracketLength2];                             
                                   int e = -1;
                                   int c = 0;
                                   int i = 0;
                                  int d = 0;
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
                                           if(e > -1 && e < bracketLength2)
                                          {
                                                d++;
                                                if(array[a][e] != array[d][e])                   
                                               {                                                                     
                                                    brk = true;     
                                                }                                                        
                                            }     
                                            arrayTrack.add(0);
                                            if(brk == true)
                                           {
                                                brk = false;
                                                break;
                                            }
                                       }
                                     for(int a = c; a < d; a++)
	                        {
	                                for(int b = c; b < d; b++)
		                   {
                                                      if(array[a][x] < array[b][x])
			                   {
				             hold = array[a][x];
				             array[a][x] = array[b][x];
				             array[b][x] = hold;             
                                                            i++;                                                 
                                                            v = a;
				        }
			            }
                                      if(i > 0)
                                      {
                                             arrayTrack.set(l, v);
                                             i = 0;
                                      }else{
                                       arrayTrack.set(l, l);
                                     }
                                     l++;                   
                                 }  
                                i = 0;
                                l = 0;
                                for(int y = n; y < bracketLength2; y++)
                                {
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
                             c = 0;
                            d = 0;
                           i = 0;
                          if(e < bracketLength2 - 1)
                          {
                           e++;
                         }
                         if(e == bracketLength2 - 1)
                        {
                            break;
                       }              
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









