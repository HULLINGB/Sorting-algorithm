import java.util.ArrayList;

public class Sort2Bracket4DArray{
     public static void main(String []args){
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
            {0, 0, 0, 0},
            {0, 0, 0, 2},
            {0, 0, 0, 3},
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {1, 0, 2, 0},
            {0, 0, 0, 0}
        }; 
                                   ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength);
                                   int[][] arrayHolder = new int[bracketLength][bracketLength2];       
                                  ArrayList<Integer> end = new ArrayList<>(bracketLength2);
                                   int e = -1;
                                  int c = 0;
                                   int i = 0;
                                  int k = 0;
                                  int d = bracketLength;
                                  int l = 0;
                                  int r = 0;       
                                  int v = 0;
                                  int z = 0;
                                   int g = bracketLength * bracketLength2;
                                   int w = 0;
                                   boolean brk = false;
                                   boolean dup = false;
                                   int num = 0;
                                   int hold = 0;
                                   if (array.getClass().getComponentType().isArray()) {
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
                                                    brk = true;
                                                }
                                           if(brk == true)
                                           {
                                           	brk = false;
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
                                             array2[a][n] = array[b][n];
                                             array2[b][n] = hold;
                                        }
}
                                 }                 
v = r;      
for(int a = r; a < d a++)
{
	arrayTrack.add(0);
	}    
for(int a = r; a < d; a++)
{
             for(int b = r; b < d; b++)
            {
             if(array[a][n] == array2[b][n])
            {
                    v = b;
                    for(int f = 0; f < arrayTrack.size(); f++)
                    {
                           if(b == arrayTrack.get(f))
                           {
                                  v++;
                                 dup = true;
                           }
                    }
                   if(dup == true)
                   {
                    arrayTrack.set(l, v);
                    dup = false;
                  }else{
                    arrayTrack.set(l, b);
                   }
                    w++;
                   break;
            }
}
if(w == 0)
{
	  arrayTrack.set(l, a);
}
w = 0;
l++;
}
l = 0;
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
                                for(int y = n + 1; y < bracketLength2; y++)
                                {
                                              i = 0;
                                               for(int a = r; a < d; a++)
                                              {
                                                    arrayHolder[a][y] = array[arrayTrack.get(i)][y];
                                                    i++;
                                               }
                                              for(int a = r; a < d; a++)
                                              {
                                                    array[a][y] = arrayHolder[a][y];
                                               }                                           
                             }
                             arrayTrack.clear();
                              r = d;
                              if(r == bracketLength)
                              {
                                    break;
                               }
                                }
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


