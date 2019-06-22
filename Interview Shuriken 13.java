/*Interview Shuriken 13: If Brackets are balanced?

Given a string expression, check if brackets present in the expression are balanced or not. Brackets are balanced if the bracket which opens last, closes first.
You need to return true if it is balanced, false otherwise.
Note: This problem was asked in initial rounds in Facebook
Sample Input 1 :
{ a + [ b+ (c + d)] + (e + f) }
Sample Output 1 :
true
Sample Input 2 :
{ a + [ b - c } ]
Sample Output 2 :
false
*/

import java.io.*;
import java.util.*;
public class Solution {
  
     static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }

	public static boolean checkBalanced(String exp) {
		    /* Declare an empty character stack */
       Stack<Character> st = new Stack<Character>();
      
       /* Traverse the given expression to 
          check matching parenthesis */
       for(int i=0; i<exp.length(); i++)
       {
           
          /*If the exp[i] is a starting 
            parenthesis then push it*/
          if (exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[')
            st.push(exp.charAt(i));
      
          /* If exp[i] is an ending parenthesis 
             then pop from stack and check if the 
             popped parenthesis is a matching pair*/
          if (exp.charAt(i) == '}' || exp.charAt(i) == ')' || exp.charAt(i) == ']')
          {
                  
              /* If we see an ending parenthesis without 
                 a pair then return false*/
             if (st.isEmpty())
               {
                   return false;
               } 
      
             /* Pop the top element from stack, if 
                it is not a pair parenthesis of character 
                then there is a mismatch. This happens for 
                expressions like {(}) */
             else if ( !isMatchingPair(st.pop(), exp.charAt(i)) )
               {
                   return false;
               }
          }
           
       }
         
       /* If there is something left in expression 
          then there is a starting parenthesis without 
          a closing parenthesis */
       
       if (st.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } // Write your code here

	}
}