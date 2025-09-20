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
                                   ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength);
                                   int[][] arrayHolder = new int[bracketLength][bracketLength2];       
                                  ArrayList<Integer> start = new ArrayList<>(bracketLength2);
                                   int e = 0;
                                  int c = 0;
                                   int i = 0;
                                  int d = bracketLength;
                                  int l = 0;
                                  int r = 0;       
                                  int v = 0;
                                  int z = 0;
                                   int g = bracketLength * bracketLength2;
                                   boolean brk = false;
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
for( ; ; )
{
                                  for(int x = 0; x < bracketLength2; x++)
                                {                        
                                   for(int n = e; n < bracketLength2; n++)
{       
                                  for( int u = r; u < bracketLength; u++)
                                  {
                                           for(int t = u; t < bracketLength;t++)
                                           {
                                           if(n > 0 && d < bracketLength)
                                          {                   
                                          if(array[c][n] != array[d][n])   
                                               {                                                 
                                                    brk = true;
                                                }
                                           c++;
                                           if(brk == true)
                                           {
                                           	break;
                                           }
                                          }                
                                          brk = false;                                    
                                    }  
                                    z = z + d;
                                   start.add(c + 1);
                                     for(int a = r; a < d; a++)
                                {
                                        arrayTrack.add(0);
                                        for(int b = r; b < d; b++)
                                   {
                                                      i = 0;
                                                      if(array[a][n] < array[b][n])
                                           {
                                             hold = array[a][n];
                                             array[a][n] = array[b][n];
                                             array[b][n] = hold;             
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
                                           
                                 }
                                 l++;
                                 }
                                l = 0;
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
                                  }
                           r = start.get(x);  
                               
                         }          
                         e++;                              
                  }
                  e = 0;
                  start.clear();
                  if(z >= g - 1)
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
             }
System.out.println();
}       
     }
}










