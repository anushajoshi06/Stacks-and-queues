/*Reverse Queue

Given a queue of integers, reverse it without help of any explicit stack or queue. You need to change in the given queue itself.
Note : No need to return or print the queue.
Input format :
Line 1 : First Element - Size of Queue, Rest Elements - Elements Of Queue
Output format :
Queue elements
Sample Input :
4 1 2 3 4     (1 is at front)
Sample Output :
4 3 2 1    (4 is at front)
*/

import java.io.*;
import java.util.*;
/********** Given Queue Class **************
// You can directly use these functions

class Queue<T> {

	public int size();

	public boolean isEmpty();

	public T front();

	public void enqueue(T element);

	public T dequeue();
}

**********************************/



public class Solution {

	public static void reverseQueue(Queue<Integer> q) {
		// Write your code here
      Stack<Integer> s = new Stack<Integer>();  //create a stack

    //while the queue is not empty
    while(!q.isEmpty())
    {  //add the elements of the queue onto a stack
       s.push(q.front());
      q.dequeue();
    } 

    //while the stack is not empty
    while(!s.isEmpty())
    { //add the elements in the stack back to the queue
      q.enqueue(s.peek());
      s.pop();
    }

	}
}