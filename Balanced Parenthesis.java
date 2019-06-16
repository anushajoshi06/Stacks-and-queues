/*Code: Balanced Parenthesis

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

public class Solution {

	public static boolean checkBalanced(String exp) {
		// Write your code here
     JStack s = new JStack();
      boolean check =true;
      int i=0;
while(i<exp.length())
       { if(exp.charAt(i)=='(')
          { s.push('(');
             }
        else if(exp.charAt(i)=='{')
            { s.push('{');
              }
         else if(exp.charAt(i)=='[')
            { s.push('[');
              }
        else if(exp.charAt(i)==']' && (char)s.peek()=='[' && (!s.isEmpty()))
             {
                 s.pop();
               }
         else if(exp.charAt(i)=='}' && (char)s.peek()=='{'&& (!s.isEmpty()))
             {
                 s.pop();
               }
         else if(exp.charAt(i)==')' && (char)s.peek()=='('&& (!s.isEmpty()))
             {
                 s.pop();
               }
        
         i++;
        }
      if(!s.isEmpty())
         { check =false;
            }
      return check;
	}
}


class JStack<T>
 
   {
	private Object[] data;
	private int index = 0;
	private int size = 0;
  
   public JStack() {
		this.size = 30; 
		data = new Object[this.size];
	}
  
  	public void push(T o) {
		if (index >= size) {
			this.increaseSize();
		}
		this.data[index] = o;
		index++;
	}
  
  public Object pop() {
		if (index != 0) {
			Object obj = data[index - 1];
			this.data[index - 1] = null; // Deleted
			index--;
			return obj;
		} else
			return null;
	}
  
  	public Object peek() throws RuntimeException {
		if (index != 0)
			return this.data[index - 1];
		else
			return null;
	}

  
  public boolean isEmpty() {
		return index == 0 ? true : false;
	}

	public int getStackSize() {
		return index;
	}

  	public void deleteStack() {
		if (index != 0) {
			for (int i = 0; i < index; i++) {
				this.data[i] = null;
			}
			index = 0;
			System.out.println("The Stack has been deleted");
		}
	}
  
  	private void increaseSize() {
		Object[] temp = new Object[size];
		size = size * 2;
		for (int i = 0; i < index; i++) {
			temp[i] = this.data[i];
		}
		this.data = new Object[this.size];
		for (int i = 0; i < index; i++) {
			this.data[i] = temp[i];
		}
	}
}