/*Code: Stack Using LL

You need to implement a Stack class using linked list.
The data members should be private.
Implement the following public functions :
1. Constructor -
Initialises the data member (i.e. head to null).
2. push :
This function should take one argument of type T and has return type void. This function should insert an element in the stack. Time complexity should be O(1).
3. pop :
This function takes no input arguments and has return type T. This should removes the last element which is entered and return that element as an answer. Time complexity should be O(1).
4. top :
This function takes no input arguments and has return type T. This should return the last element which is entered and return that element as an answer. Time complexity should be O(1).
5. size :
Return the size of stack i.e. count of elements which are present ins stack right now. Time complexity should be O(1).
6. isEmpty :
Checks if the stack is empty or not. Return true or false.
*/

/***********

public static void main(String[] args) throws StackEmptyException {
      		Scanner s = new Scanner(System.in);

		Stack<Integer> st = new Stack<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
    }


class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

************/
class StackEmptyException extends Exception {
  
  /**
  *
  **/
  private static final long serialVersionUID = 1L;
}

public class Stack<T> {
	private  Node<T> head;
  private int size;
	public Stack() {
head=null;
      size=0;
	}
	
	public int size() {
         return size;
	}
	
	public void push(T data) {
         Node<T> newnode =new Node<T>(data);
         newnode.next=head;
         head=newnode;
      size++;
	    }
	
	public boolean isEmpty() {
     return(size==0);}
  
	public T pop() throws StackEmptyException {
      if(size()==0)
         { throw  new StackEmptyException(); 
            }
T temp=head.data;
      head=head.next;
      size--;
      return temp;
	}
	
	public T top() throws StackEmptyException {
 if(size()==0)
         { throw  new StackEmptyException(); 
            }
      return head.data;
	}
}
