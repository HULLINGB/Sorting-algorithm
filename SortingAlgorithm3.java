import java.util.ArrayList;
import java.util.Random;
public class Sort3Bracket4DArray{
     public static void main(String []args){
                                   int bracketLength = 3;
                                   int bracketLength2 = 10;
                                   int bracketLength3 = 4;
                        int[][][] array = new int[bracketLength][bracketLength2][bracketLength3];
int[][][] array2 = new int[bracketLength][bracketLength2][bracketLength3];
int[][] array3 = new int[bracketLength2][bracketLength3];
int[][] array4 = new int[bracketLength2][bracketLength3];
ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength2);
                                   int[][] arrayHolder = new int[bracketLength2][bracketLength3];      
                                   int e = -1;
                                   int i = 0;
                                  int k = 0;
                                  int d = bracketLength2;
                                  int r = 0;       
                                  int v = 0;
                                  int z = 0;
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
for(int x = 0; x < bracketLength; x++)
                            {
                                 Random rand = new Random();
                             for(int a = 0; a < bracketLength2; a++)
                            {
                               for(int b = 0; b < bracketLength3; b++)
                                 {
                                    num = rand.nextInt(10);
                                   array3[a][b] = num;
                                }
                              } 
for(int a = 0; a < bracketLength3; a++)
{
for(int b = 0; b < bracketLength2; b++)
{
      array4[b][a] = array3[b][a];
}
}
                                   for(int n = 0; n < bracketLength3; n++)
{       
                                  for( int u = 0; u < bracketLength2; u++)
                                  {
                                            if(n > 0 && d < bracketLength2)
                                          {                   
                                           for(int t = r; t < bracketLength2;t++)
                                           {   
                                          if(array3[i][e] != array3[d][e])   
                                               {                                                 
                                                    brk = true;
                                                }
                                           if(brk == true)
                                           {
                                           	brk = false;
                                           	break;
                                           }
                                                i++;
                                           d++;
                                          }                                              
                                    } 
                                     for(int a = r; a < d; a++)
                                {
                                        for(int b = r; b < d; b++)
                                   {
                                                      if(array3[a][n] < array3[b][n])
                                           {
                                             hold = array3[a][n];
                                             array3[a][n] = array3[b][n];
                                             array3[b][n] = hold;
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
             if(array4[b][n] == array3[a][n])
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
                                for(int y = n + 1; y < bracketLength3; y++)
                                {
                                               for(int a = r; a < d; a++)
                                              {
                                                    arrayHolder[a][y] = array3[arrayTrack.get(a)][y];
                                               }
                                              for(int a = r; a < d; a++)
                                              {
                                                    array3[a][y] = arrayHolder[a][y];
                                               }                                           
                             }      
                              r = d;
                              if(r == bracketLength2)
                              {
                                    break;
                               }
                                }
                                arrayTrack.clear();
                                i = 0;
                                d = 1;
                                  r = 0;
                                  e++;
                         } 
for(int a = 0; a < bracketLength2; a++)
{
for(int b = 0; b < bracketLength3; b++)
{
       array[x][a][b] = array3[a][b];
}
}
e = 0;
}
for(int a = 0; a < bracketLength; a++)
{        
         for(int b = 0; b < bracketLength2; b++)
         {
for(int c = 0; c < bracketLength3; c++)
         {
              System.out.print(array[a][b][c]);
               if(c < bracketLength3 - 1)
               {
                     System.out.print(", ");
               }
             }
System.out.println();
}
System.out.println();
System.out.println();
}       
     }
}



