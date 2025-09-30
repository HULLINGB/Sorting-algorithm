import java.util.ArrayList;
import java.util.Random;

public class Sort2Bracket4DArray{
     public static void main(String[] args){
                                   int bracketLength = 10;
                                   int bracketLength2 = 4;
                        int[][] array = {
            {9, 8, 7, 6},
            {5, 4, 9, 2},
            {3, 0, 8, 3},
            {3, 2, 7, 0},
            {3, 1, 9, 0},
            {2, 9, 7, 0},
            {2, 4, 2, 0},
            {1, 7, 1, 0},
            {1, 7, 2, 4},
            {0, 0, 0, 0}
        }; 
                        int[][] array2 = {
            {0, 0, 0, 6},
            {0, 4, 0, 2},
            {3, 0, 0, 3},
            {3, 0, 0, 0},
            {0, 1, 0, 0},
            {2, 0, 0, 0},
            {2, 0, 2, 0},
            {1, 0, 1, 0},
            {1, 0, 2, 0},
            {0, 0, 0, 0}
        }; 
                                   ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength);
                                   int[][] arrayHolder = new int[bracketLength][bracketLength2];      
                                   int e = -1;
                                  int c = 0;
                                   int i = 0;
                                  int d = bracketLength;
                                  int r = 0;       
                                  int v = 0;
                                   int w = 0;
                                   boolean brk = false;
                                   boolean dup = false;
                                   int num = 0;
                                   int hold = 0;
                                   if(array.getClass().getComponentType().isArray()) 
{
                               System.out.println("This is a multidimensional array");
                                  }else{
                              System.out.println("This is not a multidimensional array");
                                  }
                                  /**
                                 Random rand = new Random();
                             for(int a = 0; a < bracketLength; a++)
                            {
                               for(int b = 0; b < bracketLength2; b++)
                                 {
                                    num = rand.nextInt(10);
                                   array[a][b] = num;
                                }
                              } 
                              **/  
for(int a = 0; a < bracketLength2; a++)
{
for(int b = r; b < d; b++)
{
      array2[b][a] = array[b][a];
}
}
                                   for(int n = 0; n < bracketLength2; n++)
{       
                                  for( int u = 0; u < bracketLength; u++)
                                  {
                                            if(n > 0 && d < bracketLength)
                                          {                   
                                           for(int t = r; t < bracketLength;t++)
                                           {   
                                          if(array[c][e] != array[d][e])   
                                               {                                                 
                                                    break;
                                                }
                                                c++;
                                           d++;
                                          }                                              
                                    } 
                                     for(int a = r; a < d; a++)
                                {
                                        for(int b = r; b < d; b++)
                                   {
                                                      if(array[a][n] < array[b][n])
                                           {
                                             hold = array[a][n];
                                             array[a][n] = array[b][n];
                                             array[b][n] = hold;
                                        }
}
                             }                
v = r;      
for(int a = r; a < d; a++)
{
	arrayTrack.add(0);
	}    
for(int a = r; a < d; a++)
{
             for(int b = r; b < d; b++)
            {
             if(array2[b][n] == array[a][n])
            {
                    v = b;
                    for(int f = b; f < d; f++)
                    {
                           if(f == arrayTrack.get(f))
                           {
                                  v++;
                                 dup = true;
                           }
                    }
                   if(dup == true)
                   {
                    arrayTrack.set(a, v);
                    dup = false;
                  }else{
                    arrayTrack.set(a, b);
                   }
                    w++;
                   break;
            }
}
if(w == 0)
{
	  arrayTrack.set(a, a);
}
w = 0;
}
                                for(int y = n + 1; y < bracketLength2; y++)
                                {
                                               for(int a = r; a < d; a++)
                                              {
                                                    arrayHolder[a][y] = array[arrayTrack.get(a)][y];
                                               }
                                              for(int a = r; a < d; a++)
                                              {
                                                    array[a][y] = arrayHolder[a][y];
                                               }                                           
                             }      
                              r = d;
                              if(r == bracketLength)
                              {
                                    break;
                               }
                                }
                                arrayTrack.clear();
                                c = 0;
                                d = 1;
                                  r = 0;
                                  e++;
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
             }
System.out.println();
}       
     }
}