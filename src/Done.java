import java.util.*; 
class Done
{
  public static void main(String args[])
  {
     String str="aaabbcccdddd";
     HashSet<Character> st=new HashSet<Character>();
     char[] arr=str.toCharArray();
     for(int i=0; i<str.length(); i++)
     {
        if(!st.contains(arr[i]))
        {
            st.add(arr[i]);
        }
     
      }
      Iterator<Character> itr = st.iterator();
      while (itr.hasNext())
      {

           System.out.println("Value in hash set are: "+itr.next() + " ");
      }
  } 
}