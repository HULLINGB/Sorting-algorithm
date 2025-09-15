import java.util.*;

public class SortingAlgorithmQuantum{
     public static void main(String []args){
                                   int bracketLength = 200000000;
                                   int bracketLength2 = 4;
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
                            for(int n = 1; n < bracketLength2; n++)
                            {
                                 for(int x = n; x < bracketLength2; x++)
                                 {
                                      for(int a = c; a < bracketLength; a++)
		              {
                                           if(e > -1)
                                          {
                                                d++;
                                                if(array.get(e).get(a) != array.get(e).get(d)                   
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
                                                      if(array.get(x).get(a) < array.get(x).get(a))
			                   {
				             hold = array.get(x).get(a);
				             array.get(x).set(a, array.get(x).get(b);
				             array.get(x).set(b, hold);             
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
                                                    arrayHolder.get(y).set(a, array.get(y).get(arrayTrack.get(i)));
                                                    i++;
                                               }
                                              for(int a = c; a < d; a++)
                                              {
                                                    array.get(y).set(a, arrayHolder.get(y).get(a));
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
              System.out.print(array.get(b).get(a));
               if(b < bracketLength2 - 1)
               {
                     System.out.print(", ");
               }
              System.out.println();
        }
}       
     }
}











