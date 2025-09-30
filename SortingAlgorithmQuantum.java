import java.util.ArrayList;
import java.util.Random;
public class SortingAlgorithmQuantum{
     public static void main(String []args){
                                   int bracketLength = 200000000;
                                   int bracketLength2 = 4;
int[][] arrayOld = new int[bracketLength][bracketLength2];
ArrayList<ArrayList<Integer>> array = new ArrayList<>();
ArrayList<Integer> array1 = ArrayList<>(bracketLength);
ArrayList<Integer> array2 = ArrayList<>(bracketLength);
ArrayList<Integer> array3 = ArrayList<>(bracketLength);
ArrayList<Integer> array4 = ArrayList<>(bracketLength);
                                   ArrayList<Integer> arrayTrack = new ArrayList<>(bracketLength);
                                   ArrayList<Integer> arrayHolder = new ArrayList<>(bracketLength);             
                ArrayList<Integer> arrayHolder2 = new ArrayList<>(bracketLength);
ArrayList<Integer> arrayHolder3 = new ArrayList<>(bracketLength);
ArrayList<Integer> arrayHolder4 = new ArrayList<>(bracketLength);
                                   int e = -1;
                                   int c = 0;
                                   int i = 0;
                                  int d = bracketLength;
                                  int l = 0;
                                  int v = 0;
                                  int t = 1;
                                   boolean brk = false;
                                   int num = 0;
                                   int hold = 0;
                               ResultSet result;
ResultSet result2;
ResultSet result3;
ResultSet result4;
                                   if (array.getClass().getComponentType().isArray()) {
	                       System.out.println("This is a multidimensional array");
                                  }else{
	                      System.out.println("This is not a multidimensional array");
                                  }
                                 try{ Class.forName("com.mysql.jdbc.Driver");  
		connection = DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/Twitter","root","root");    
		database = connection.createStatement();
		result = database.execute("SELECT xAxis FROM QuantumPoints");
database = connection.createStatement();
		result2 = database.execute("SELECT yAxis FROM QuantumPoints");
database = connection.createStatement();
		result3 = database.execute("SELECT zAxis FROM QuantumPoints");
database = connection.createStatement();
		result4 = database.execute("SELECT qAxis FROM QuantumPoints");
		}catch(SQLException e)
		{
		}
		try{
			while(result.next())
			{
			array1.add(result.getInt(t));
array2.add(result2.getInt(t));
array3.add(result3.getInt(t));
array4.add(result4.getInt(t));
                                   t++;
			}
		}catch(Exception e)
		{
		}
array.add(array1);
array.add(array2);
array.add(array3);
array.add(array4);               
for(int a = 0; a < bracketLength2; a++)
{
for(int b = r; b < d; b++)
{
      arrayOld[b][a] = array.get(a).get(b);
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
                                          if(array.get(e).get(c) != array.get(e).get(d))   
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
                                                      if(array.get(n).get(a) < array.get(n).get(b))
                                           {
                                             hold = array.get(n).get(a);
                                             array.get(n).get(a) = array.get(n).get(b);
                                             array.get(n).get(b) = hold;
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
             if(arrayOld[b][n] == array.get(n).get(a))
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
                                                    arrayHolder[a][y] = array.get(y).get(arrayTrack.get(a);
                                               }
                                              for(int a = r; a < d; a++)
                                              {
                                                    array.get(y).get(a) = arrayHolder[a][y];
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
              System.out.print(array.get(b).get(a));
               if(b < bracketLength2 - 1)
               {
                     System.out.print(", ");
               }
        }
System.out.println();
}       
     }
}











