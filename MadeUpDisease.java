//Shell for student to experiment with Accessibility
public class MadeUpDisease
{
//Instance Variables
   private String name;
   private int val;
   
//Constructors  
   public MadeUpDisease()
   {
      name = "One";
      val = 0;
   }
   
   public MadeUpDisease(String s, int x)
   {
      name = s;
      val = x;
   }
   
//Accessor Methods
   public String getName()
   {
      return name;
   }
   
   public int getVal()
   {
      return val;
   }
   
//Mutator Method
   public void changeVal()
   {
      val += vowelCount();
   }

//Helper Method
   public int vowelCount()
   {
      int count  = 0;
      for(int i = 0; i < name.length(); i++)
      {
         String vowels = "aeiouAEIOU";
         if(vowels.indexOf(name.substring(i, i+1))>-1)
            count++;
      }
      return count;
   }

//toString Method
   public String toString()
   {
      String output = "Disease name: " + name;
      output += "\nRating: " + val;
      return output;
   }  
}